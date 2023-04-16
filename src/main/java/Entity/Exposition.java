package Entity;

import BDD.interfaces.ExpositionInterface;
import BDD.interfaces.OeuvreInterface;
import BDD.interfaces.SalleInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exposition implements ExpositionInterface {
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

    @Override
    public int getmaxPlace() {
        return nbPlace;
    }

    public List<SalleInterface> getSalles() {
        return Salles;
    }

    public void addSalle(SalleInterface Salle) {
        Salles.add(Salle);
    }

    public void removeSalle(SalleInterface Salle) {
        Salles.remove(Salle);
    }

    public List<OeuvreInterface> getOeuvres() {
        return oeuvres;
    }

    @Override
    public void addOeuvre(Oeuvre oeuvre) {

    }

    @Override
    public void removeOeuvre(Oeuvre oeuvre) {

    }

    public void addOeuvre(OeuvreInterface oeuvre) {
        oeuvres.add(oeuvre);
    }

    public void removeOeuvre(OeuvreInterface oeuvre) {
        oeuvres.remove(oeuvre);
    }

    @Override
    public boolean isOpen() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.isEqual(debDate) || currentDate.isEqual(finDate) || (currentDate.isAfter(debDate) && currentDate.isBefore(finDate));
    }

    @Override
    public List<OeuvreInterface> getOeuvresBySalle(SalleInterface Salle) {
        List<OeuvreInterface> oeuvresBySalle = new ArrayList<>();
        /*
        for (OeuvreInterface oeuvre : oeuvres) {
            if (oeuvre.getSalles().contains(Salle)) {
                oeuvresBySalle.add(oeuvre);
            }
        }
        */
        return oeuvresBySalle;
    }

    public void planifierExposition(String name, LocalDate debDate, LocalDate finDate, int maxPlace) {
        Exposition newExposition = new Exposition(name, debDate, finDate, maxPlace);
        expositionsListe.add(newExposition);
    }

    public void afficherInfosExposition(Exposition exposition) {
        System.out.println("Nom: " + exposition.getName());
        System.out.println("Date de début: " + exposition.getdebDate());
        System.out.println("Date de fin: " + exposition.getfinDate());
        System.out.println("Nombre maximum de places: " + exposition.getmaxPlace());
    }


    public List<Exposition> getExpositionsEnCoursOuAVenir() {
        List<Exposition> expositionsEnCoursOuAVenir = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();
        for (Exposition exposition : expositionsListe) {
            if (exposition.getdebDate().isAfter(currentDate)) {
                expositionsEnCoursOuAVenir.add(exposition);
            }
        }
        return expositionsEnCoursOuAVenir;
    }



}