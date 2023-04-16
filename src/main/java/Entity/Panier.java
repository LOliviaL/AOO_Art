package Entity;

import java.util.ArrayList;
import java.util.List;

public class Panier {

    private List<Oeuvre> oeuvres;
    private double montantTotal;

    public Panier() {
        oeuvres = new ArrayList<>();
        montantTotal = 0;
    }

    public void ajouterOeuvre(Oeuvre oeuvre) {
        oeuvres.add(oeuvre);
        montantTotal += oeuvre.getEstimationPrice();
    }

    public void supprimerOeuvre(Oeuvre oeuvre) {
        oeuvres.remove(oeuvre);
        montantTotal -= oeuvre.getEstimationPrice();
    }

    public List<Oeuvre> getOeuvres() {
        return oeuvres;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void vider() {
        oeuvres.clear();
        montantTotal = 0;
    }
}