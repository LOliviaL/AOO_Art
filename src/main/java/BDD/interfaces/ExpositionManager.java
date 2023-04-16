package BDD.interfaces;

import Entity.Exposition;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ExpositionManager implements ExpositionManagerInterface{

    private List<Exposition> expositions;

    public ExpositionManager() {
        expositions = new ArrayList<>();
    }
    @Override
    public void creerExposition(String nom, LocalDate dateDebut, LocalDate dateFin, int nbVisiteursMax) {
        Exposition exposition = new Exposition(nom, dateDebut, dateFin, nbVisiteursMax);
        this.expositions.add(exposition);
    }
    @Override
    public void supprimerExposition(Exposition exposition) {
        this.expositions.remove(exposition);
    }
    @Override
    public List<Exposition> getExpositions() {
        return this.expositions;
    }




}
