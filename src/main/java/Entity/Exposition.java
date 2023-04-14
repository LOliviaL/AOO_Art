package Entity;

import BDD.interfaces.ExpositionInterface;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exposition implements ExpositionInterface {
    private String location;
    private String name;
    private LocalDate debDate;
    private LocalDate finDate;
    private int maxPlace;
    private List<Peinture> oeuvres;

    public Exposition(String name, LocalDate debDate, LocalDate finDate, int maxPlace, String location) {
        this.name = name;
        this.debDate = debDate;
        this.finDate = finDate;
        this.location = location;
        this.maxPlace = maxPlace;
        this.oeuvres = new ArrayList<>();
        /*  this.spaces = new ArrayList<>(); */
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public LocalDate getdebDate() {
        return debDate;
    }
    @Override
    public LocalDate getfinDate() {
        return finDate;
    }
    @Override
    public int getmaxPlace() {
        return maxPlace;
    }
    @Override
    public List<Peinture> getOeuvres() {
        return oeuvres;
    }
    @Override
    public void addOeuvre(Peinture oeuvre) {
        oeuvres.add(oeuvre);
    }
    @Override
    public void removeOeuvre(Peinture oeuvre) {
        oeuvres.remove(oeuvre);
    }

    @Override
    public boolean isOpen() {

        LocalDate currentDate= LocalDate.now();
        return currentDate.isEqual(debDate) || currentDate.isEqual(finDate) || (currentDate.isAfter(debDate) && currentDate.isBefore(finDate));
    }

    /*
    public List<ISpace> getSpaces() {
        return spaces;
    }

    public void addSpace(ISpace space) {
        spaces.add(space);
    }

    public void removeSpace(ISpace space) {
        spaces.remove(space);
    }
*/
        /*
        LocalDate currentDate= LocalDate.now();
        return (currentDate >= debDate) && (currentDate <= finDate);
        */

    /*  @Override
    public List<Peinture> getOeuvresBySpace(ISpace space) {
        List<Peinture> oeuvresBySpace = new ArrayList<>();
        for (Peinture oeuvre : oeuvres) {
            if (oeuvre.getSpaces().contains(space)) {
                oeuvresBySpace.add(oeuvre);
            }
        }
        return oeuvresBySpace;
     */
}