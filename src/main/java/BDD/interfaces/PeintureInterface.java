package BDD.interfaces;

import Entity.Peinture;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface PeintureInterface {

    ArrayList<Peinture> listeAllPeinture () throws SQLException;

    boolean insertPeinture( Peinture peinture) throws SQLException;

    boolean findPeinture(Peinture peinture) throws SQLException;

    boolean updatePeinture (Peinture peinture) throws SQLException;

    boolean deletePeinture (String name) throws SQLException;

    Peinture getPeintureById(int id);

    Peinture getPeintureByName(String name);

    Peinture creatPeintureObject(ResultSet resultSet) throws SQLException;




}
