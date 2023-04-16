package BDD.interfaces;

import Entity.Oeuvre;

import java.time.LocalDate;
import java.util.List;

public interface ExpositionInterface {
    String getName();
    LocalDate getdebDate();
    LocalDate getfinDate();
    int getmaxPlace();
    List<SalleInterface> getSalles();
    void addSalle(SalleInterface Salle);
    void removeSalle(SalleInterface Salle);
    List<OeuvreInterface> getOeuvres();
    boolean isOpen();
    List<OeuvreInterface>getOeuvresBySalle(SalleInterface Salle);
}