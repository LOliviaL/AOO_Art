package Entity;

import java.util.ArrayList;
import java.util.List;

public class Panier {

    private List<Peinture> oeuvres;
    private double montantTotal;

    public Panier() {
        oeuvres = new ArrayList<>();
        montantTotal = 0;
    }

    public void ajouterOeuvre(Peinture oeuvre) {
        oeuvres.add(oeuvre);
        montantTotal += oeuvre.getEstimationPrice();
    }

    public void supprimerOeuvre(Peinture oeuvre) {
        oeuvres.remove(oeuvre);
        montantTotal -= oeuvre.getEstimationPrice();
    }

    public List<Peinture> getOeuvres() {
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