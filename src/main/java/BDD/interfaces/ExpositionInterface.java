package BDD.interfaces;

import Entity.Peinture;

import java.time.LocalDate;
import java.util.List;

public interface ExpositionInterface {
    String getName();
    LocalDate getdebDate();
    LocalDate getfinDate();
    int getmaxPlace();
    List<Peinture> getOeuvres();
    void addOeuvre(Peinture oeuvre);
    void removeOeuvre(Peinture oeuvre);
    boolean isOpen();

    /* List<ISpace> getSpaces(); */
    /*  List<Peinture> getOeuvresBySpace(ISpace space); */
    /*
    void addSpace(ISpace space);
    void removeSpace(ISpace space);
    */

}