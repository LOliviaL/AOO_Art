package Entity;

import BDD.interfaces.SalleInterface;

public class Salle implements SalleInterface {
    private static  String name;
    private static int nbrPlace;

    public Salle(String name,int nbrPlace) {
        this.name = name;
        this.nbrPlace=nbrPlace;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int getNbrPlace() {
        return this.nbrPlace;
    }
    @Override
    public void setNbrplace(int nbrPlace) {
        this.nbrPlace = nbrPlace;

    }




}
