package BDD.interfaces;

import Entity.Salle;

import java.sql.SQLException;
import java.util.ArrayList;

public interface SalleInterface {

    ArrayList<Salle> listeAllSalle () throws SQLException;

    Salle getSalleByName(String name);
    ArrayList<Salle> getSalleByNameExposition(String nameExposition);

    boolean insertSalle(Salle salle) throws SQLException;

    boolean updateSalle(Salle salle) throws SQLException;

    boolean deleteSalle(String name) throws SQLException;

}
