import BDD.entityBDD.PeintureBDD;
import Entity.Peinture;

import java.sql.SQLException;
import java.util.ArrayList;

public class main {

    public static ArrayList<Peinture> test () throws SQLException {
        ArrayList<Peinture> peintureList = new ArrayList<>();
        PeintureBDD peintureBDD = new PeintureBDD();
        peintureList = peintureBDD.listeAllPeinture();
        return peintureList;
    }

    public static void main(String[] args) throws SQLException {
        System.out.println("OOOOOOOOOOOOOOOO");
        for(Peinture p : test()){
            System.out.println(p.getName());
        }
    }
}
