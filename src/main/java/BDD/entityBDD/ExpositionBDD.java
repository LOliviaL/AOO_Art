package BDD.entityBDD;

import BDD.interfaces.ExpositionInterface;
import BDD.interfaces.OeuvreInterface;
import BDD.interfaces.SalleInterface;

import java.time.LocalDate;
import java.util.List;

public class ExpositionBDD extends Bdd implements ExpositionInterface {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public LocalDate getdebDate() {
        return null;
    }

    @Override
    public LocalDate getfinDate() {
        return null;
    }

    @Override
    public int getmaxPlace() {
        return 0;
    }

    @Override
    public List<SalleInterface> getSalles() {
        return null;
    }

    @Override
    public void addSalle(SalleInterface Salle) {

    }

    @Override
    public void removeSalle(SalleInterface Salle) {

    }

    @Override
    public List<OeuvreInterface> getOeuvres() {
        return null;
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public List<OeuvreInterface> getOeuvresBySalle(SalleInterface Salle) {
        return null;
    }
}
