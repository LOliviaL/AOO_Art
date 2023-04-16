package BDD.interfaces;

import Entity.Salle;

import java.sql.SQLException;
import java.util.ArrayList;

public interface SalleInterface {

    ArrayList<Salle> listeAllSalle () throws SQLException;

    Salle getSalleByName(String name);

}
