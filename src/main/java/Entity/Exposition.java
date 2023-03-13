package Entity;
import java.util.Date;

public class Exposition {
    private static String name;
    private static int nbrVisiteurMax;
    private static String lieu;
    private static  Date dateDeb;
    private static  Date dateFin;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;

    }
    public String getLieu() {
        return this.lieu;
    }
    public void setLieu(String lieu) {
        this.lieu = lieu;

    }
    public int getNbrVisiteurMax() {
        return this.nbrVisiteurMax;
    }
    public void setNbrVisiteurMax(int nbrVisiteurMax) {
        this.nbrVisiteurMax = nbrVisiteurMax;

    }
    public Date getDateDeb() {
        return this.dateDeb;
    }
    public void setDateDeb(Date dateDeb) {
        this.dateDeb = dateDeb;

    }
    public Date getDateFin() {
        return this.dateFin;
    }
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;

    }

    public Exposition(String name, String lieu, int nbrVisiteurMax, Date dateDeb, Date dateFin) {
        this.name = name;
        this.lieu=lieu;
        this.nbrVisiteurMax=nbrVisiteurMax;
        this.dateDeb=dateDeb;
        this.dateFin=dateFin;
    }
}
