package BDD.interfaces;

import Entity.Exposition;
import Entity.Oeuvre;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface ExpositionInterface {

    ArrayList<Exposition> listeAllExpositions () throws SQLException;

    boolean insertExposition(Exposition exposition) throws SQLException;

    Exposition getExpositionByName(String name);

    boolean updateExposition(Exposition exposition) throws SQLException;

    boolean deleteExposition(String name) throws SQLException;

    Exposition creatExpositionObject(ResultSet resultSet) throws SQLException;

}