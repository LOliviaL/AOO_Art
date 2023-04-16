package BDD.interfaces;

import Entity.Oeuvre;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface OeuvreInterface {

    ArrayList<Oeuvre> listeAllOeuvre() throws SQLException;

    boolean insertOeuvre(Oeuvre oeuvre) throws SQLException;

    boolean findoeuvre(Oeuvre oeuvre) throws SQLException;

    boolean updateOeuvre(Oeuvre oeuvre) throws SQLException;

    boolean deleteOeuvre(String name) throws SQLException;

    Oeuvre getOeuvreById(int id);

     Oeuvre getOeuvreByName(String name);

    Oeuvre creatOeuvreObject(ResultSet resultSet) throws SQLException;




}
