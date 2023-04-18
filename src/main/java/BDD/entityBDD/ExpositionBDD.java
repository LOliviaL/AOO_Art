package BDD.entityBDD;

import BDD.interfaces.ExpositionInterface;
import Entity.Exposition;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;


public class ExpositionBDD extends Bdd implements ExpositionInterface {
    @Override
    public ArrayList<Exposition> listeAllExpositions () throws SQLException {
        jbdcConnection = getConnect();
        ArrayList<Exposition> expositionsList = new ArrayList<>();
        Statement statement = jbdcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from Exposition");
        while (resultSet.next()){
            Exposition exposition = creatExpositionObject(resultSet);
            expositionsList.add(exposition);
        }
        resultSet.close();
        statement.close();
        deconnect();
        return expositionsList;
    }

    @Override
    public boolean insertExposition(Exposition exposition) throws SQLException {
        jbdcConnection= getConnect();
        String insert = "INSERT INTO Exposition( name, debDate, finDate, nbPlace) " +
                "VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = jbdcConnection.prepareStatement(insert);
        preparedStatement.setString(1, exposition.getName());
        preparedStatement.setObject(2, exposition.getdebDate());
        preparedStatement.setObject(3, exposition.getfinDate());
        preparedStatement.setInt(4, exposition.getmaxPlace());

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;
    }

    @Override
    public Exposition getExpositionByName(String name) {

        Exposition exposition =null;
        String select="SELECT * FROM Exposition WHERE name=?";

        try{
            jbdcConnection=getConnect();
            PreparedStatement st = jbdcConnection.prepareStatement(select);
            st.setString(1, name);
            ResultSet resultSet=st.executeQuery();
            while(resultSet.next()){
                exposition = creatExpositionObject(resultSet);
            }
            deconnect();
        }catch (Exception ignored){

        }
        return exposition;
    }

    @Override
    public boolean updateExposition(Exposition exposition) throws SQLException {
        jbdcConnection=getConnect();
        String update = "UPDATE Exposition SET name=?,debDate=?,finDate=?,nbPlace=? WHERE name=?";
        PreparedStatement preparedStatement = jbdcConnection.prepareStatement(update);
        preparedStatement.setString(1, exposition.getName());
        preparedStatement.setObject(2, exposition.getdebDate());
        preparedStatement.setObject(3, exposition.getfinDate());
        preparedStatement.setInt(4, exposition.getmaxPlace());
        preparedStatement.setString(5, exposition.getName());

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;

    }

    @Override
    public  boolean deleteExposition(String name) throws SQLException {
        jbdcConnection= getConnect();
        String delet = "DELETE FROM Exposition WHERE name = ?";
        PreparedStatement preparedStatement = jbdcConnection.prepareStatement(delet);
        preparedStatement.setString(1, name);

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;

    }

    @Override
    public Exposition creatExpositionObject(ResultSet resultSet) throws SQLException {
        String name = resultSet.getString("name");
        LocalDate debDate = LocalDate.parse(resultSet.getString("debDate"));
        LocalDate finDate = LocalDate.parse(resultSet.getString("finDate"));
        int nbPlace = Integer.parseInt(resultSet.getString("nbPlace"));

        return new Exposition(name, debDate, finDate, nbPlace) ;
    }
}
