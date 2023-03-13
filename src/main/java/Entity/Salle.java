package Entity;
public class Salle {
    private static  String name;
    private static String adresse;
    private static int nbrPlace;

    public String getName() {
        return this.name;
    }
    public String getAdresse() {
        return this.adresse;
    }
    public int getNbrPlace() {
        return this.nbrPlace;
    }
    public void setNbrplace(int nbrPlace) {
        this.nbrPlace = nbrPlace;

    }

    public Salle(String name, String adresse, int nbrPlace) {
        this.name = name;
        this.adresse=adresse;
        this.nbrPlace=nbrPlace;
    }


}
