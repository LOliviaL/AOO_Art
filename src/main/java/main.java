import BDD.entityBDD.OeuvreBDD;
import Entity.Oeuvre;

import java.sql.SQLException;
import java.util.ArrayList;

public class main {

    public static ArrayList<Oeuvre> test () throws SQLException {
        ArrayList<Oeuvre> oeuvreList = new ArrayList<>();
        OeuvreBDD oeuvreBDD = new OeuvreBDD();
        oeuvreList = oeuvreBDD.listeAllOeuvre();
        return oeuvreList;
    }

    public static void main(String[] args) throws SQLException {
        System.out.println("OOOOOOOOOOOOOOOO");
        for(Oeuvre p : test()){
            System.out.println(p.getName());
        }
    }
}
