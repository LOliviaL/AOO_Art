package Entity;
import java.util.Date;

public class Artiste {

    private static int Id;
    private static String pseudo;
    private static String name;
    private static String surname;
    private static String photo;

    private static String adresse;

    private static String password;

    private static Date dateNaiss;


    public  int getId(){
        return this.Id;
    }
    public String getName() {

        return this.name;
    }
    public void setName(String name) {
        this.name = name;

    }
    public String getPseudo() {

        return this.pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;

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

    public  String getAdresse(){
        return this.adresse;
    }

    public void setAdresse(String adresse){
        this.adresse=adresse;
    }
    public Date getDateNaiss() {

        return this.dateNaiss;
    }
    public void setDateNaiss(Date dateNaiss) {

       this.dateNaiss=dateNaiss;

    }


    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;

    }

    public Artiste(String pseudo, String name, String surname, String photo,Date dateNaiss, String password) {
        this.pseudo=pseudo;
        this.name = name;
        this.surname=surname;
        this.photo=photo;
        this.dateNaiss=dateNaiss;
        this.password = password;
    }



}

