package Entity;

import BDD.interfaces.SalleInterface;

public class Salle{
    private static  String name;
    private static int nbrPlace;

    public Salle(String name,int nbrPlace) {
        this.name = name;
        this.nbrPlace=nbrPlace;
    }

    public String getName() {
        return this.name;
    }

    public int getNbrPlace() {
        return this.nbrPlace;
    }

    public void setNbrplace(int nbrPlace) {
        this.nbrPlace = nbrPlace;

    }




}
