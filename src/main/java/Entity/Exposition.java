package Entity;

import BDD.interfaces.OeuvreInterface;
import BDD.interfaces.SalleInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exposition {
    private String name;
    private LocalDate debDate;
    private LocalDate finDate;
    private ArrayList<Exposition> expositionsListe = new ArrayList<>();
    private int nbPlace;
    private List<SalleInterface> Salles;
    private List<OeuvreInterface> oeuvres;

    public Exposition(String name, LocalDate debDate, LocalDate finDate, int nbPlace) {
        this.name = name;
        this.debDate = debDate;
        this.finDate = finDate;
        this.nbPlace = nbPlace;
        this.Salles = new ArrayList<>();
        this.oeuvres = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public LocalDate getdebDate() {
        return debDate;
    }

    public LocalDate getfinDate() {
        return finDate;
    }


    public int getmaxPlace() {
        return nbPlace;
    }


    public boolean isOpen() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.isEqual(debDate) || currentDate.isEqual(finDate) || (currentDate.isAfter(debDate) && currentDate.isBefore(finDate));
    }
    public void afficherInfosExposition(Exposition exposition) {
        System.out.println("Nom: " + exposition.getName());
        System.out.println("Date de début: " + exposition.getdebDate());
        System.out.println("Date de fin: " + exposition.getfinDate());
        System.out.println("Nombre maximum de places: " + exposition.getmaxPlace());
    }





}