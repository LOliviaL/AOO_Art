package BDD.repository;

import BDD.interfaces.ExpositionInterface;
import Entity.Exposition;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExpositionObjet implements ExpositionInterface {
    ArrayList<Exposition> expositionsList =new ArrayList<>();
    @Override
    public ArrayList<Exposition> listeAllExpositions() throws SQLException {
        return expositionsList;
    }

    @Override
    public boolean insertExposition(Exposition exposition) throws SQLException {
        expositionsList.add(exposition);
        return true;
    }

    @Override
    public Exposition getExpositionByName(String name) {
        for (Exposition expositionfind : expositionsList){
            if (expositionfind.getName() == name){
                return expositionfind;
            }
        }
        return null;
    }

    @Override
    public boolean updateExposition(Exposition exposition) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteExposition(String name) throws SQLException {
        for (Exposition expositionfind : expositionsList){
            if (expositionfind.getName() == name){
                expositionsList.remove(expositionfind);
                return true;
            }
        }
        return false;
    }

    @Override
    public Exposition creatExpositionObject(ResultSet resultSet) throws SQLException {
        return null;
    }
}
