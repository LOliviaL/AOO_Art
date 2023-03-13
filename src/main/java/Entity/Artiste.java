package Entity;
import java.util.Date;

public class Artiste {
    private static String name;
    private static String surname;
    private static String photo;
    private static  Date dateNaiss;
    private static  Date dateDeces;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;

    }
    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;

    }

    public String getPhoto() {
        return this.photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;

    }
    public Date getDateNaiss() {
        return this.dateNaiss;
    }

    public Date getDateDeces() {
        return this.dateDeces;
    }

    public Artiste(String name, String surname, String photo, Date dateNaiss) {
        this.name = name;
        this.surname=surname;
        this.photo=photo;
        this.dateNaiss=dateNaiss;
    }

}

