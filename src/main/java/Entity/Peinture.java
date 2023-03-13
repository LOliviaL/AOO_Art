package Entity;
import java.util.Date;

public class Peinture {

    private static String name;
    private static int estimationPrice;
    private static String description;
    private static Date dateCreation;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;

    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;

    }
    public int getEstimationPrice() {
        return this.estimationPrice;
    }
    public void setEstimationPrice(int estimationPrice) {
        this.estimationPrice = estimationPrice;

    }
    public Date getDateCreation() {
        return this.dateCreation;
    }

    public Peinture(String name, String description, int estimationPrice, Date dateCreation) {
        this.name = name;
        this.description=description;
        this.estimationPrice= estimationPrice;
        this.dateCreation= dateCreation;
    }
}
