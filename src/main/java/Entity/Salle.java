package Entity;

import BDD.interfaces.SalleInterface;

public class Salle{
    private static  String name;
    private static int nbrPlace;

    private static String nameExposition;

    public Salle(String name,int nbrPlace, String nameExposition) {
        this.name = name;
        this.nbrPlace=nbrPlace;
        this.nameExposition= nameExposition;
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

    public String getNameExposition() {
        return this.nameExposition;
    }

    public void setNameExposition(String nameExposition) {
        this.nameExposition = nameExposition;

    }



}
