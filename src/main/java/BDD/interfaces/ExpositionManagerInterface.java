package BDD.interfaces;

import Entity.Exposition;

import java.time.LocalDate;
import java.util.List;

public interface ExpositionManagerInterface {

    void creerExposition(String nom, LocalDate dateDebut, LocalDate dateFin, int nbVisiteursMax);
    void supprimerExposition(Exposition exposition);
    List<Exposition> getExpositions();

}
