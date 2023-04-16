package Entity;
import java.util.Date;

public class Oeuvre {

    private static int Id;
    private static String name;
    private static String photo;
    private static float estimationPrice;
    private static String description;
    private static Date dateCreation;

    private static String nameArtiste;

    private static String nameSalle;

    public  int getId(){

        return this.Id;
    }

    public String getName() {

        return this.name;
    }
    public void setName(String name) {
        this.name = name;

    }
    public String getPhoto() {

        return this.photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;

    }
    public String getDescription() {

        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;

    }
    public float getEstimationPrice() {

        return this.estimationPrice;
    }
    public void setEstimationPrice(float estimationPrice) {
        this.estimationPrice = estimationPrice;

    }
    public Date getDateCreation() {

        return this.dateCreation;
    }
    public void setDateCreation(Date dateCreation){

        this.dateCreation=dateCreation;
    }
    public String getNameArtiste(){

        return this.nameArtiste;
    }
    public void setNameArtiste(String nameArtiste){

        this.nameArtiste=nameArtiste;
    }
    public String getNameSalle(){

        return this.nameSalle;
    }
    public void setNameSalle(String nameSalle){

        this.nameSalle=nameSalle;
    }

    public Oeuvre(String name, String photo, String description, float estimationPrice, Date dateCreation, String nameArtiste, String nameSalle) {
        this.name = name;
        this.photo=photo;
        this.description=description;
        this.estimationPrice= estimationPrice;
        this.dateCreation= dateCreation;
        this.nameArtiste=nameArtiste;
        this.nameSalle =nameSalle;
    }
}
