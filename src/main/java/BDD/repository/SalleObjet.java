package BDD.repository;

import BDD.interfaces.SalleInterface;
import Entity.Salle;

import java.sql.SQLException;
import java.util.ArrayList;

public class SalleObjet implements SalleInterface {
    private static ArrayList<Salle> sallesList=new ArrayList<>();

    @Override
    public ArrayList<Salle> listeAllSalle() throws SQLException {
        return sallesList;
    }

    @Override
    public Salle getSalleByName(String name) {
        for (Salle sallefind : sallesList){
            if (sallefind.getName() == name){
                return sallefind;
            }
        }
        return null;
    }
}
