package BDD.entityBDD;

import BDD.interfaces.SalleInterface;
import Entity.Artiste;
import Entity.Exposition;
import Entity.Salle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SalleBDD extends Bdd implements SalleInterface {
    @Override
    public ArrayList<Salle> listeAllSalle () throws SQLException {
        jbdcConnection = getConnect();
        ArrayList<Salle> sallesList = new ArrayList<>();
        Statement statement = jbdcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from Salles");
        while (resultSet.next()){
            Salle salle = creatSalleObject(resultSet);
            sallesList.add(salle);
        }
        resultSet.close();
        statement.close();
        deconnect();
        return sallesList;
    }
    @Override
    public boolean insertSalle(Salle salle) throws SQLException {
        jbdcConnection= getConnect();
        String insert = "INSERT INTO Exposition( name, nbrPlace, nameExposition) " +
                "VALUES (?,?,?)";
        PreparedStatement preparedStatement = jbdcConnection.prepareStatement(insert);
        preparedStatement.setString(1, salle.getName());
        preparedStatement.setInt(2, salle.getNbrPlace());
        preparedStatement.setString(3, salle.getNameExposition());

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;
    }
    @Override
    public boolean updateSalle(Salle salle) throws SQLException {
        jbdcConnection=getConnect();
        String update = "UPDATE Exposition SET name=?,nbrPlace=?,nameExposition=? WHERE name=?";
        PreparedStatement preparedStatement = jbdcConnection.prepareStatement(update);
        preparedStatement.setString(1, salle.getName());
        preparedStatement.setInt(2, salle.getNbrPlace());
        preparedStatement.setString(3, salle.getNameExposition());
        preparedStatement.setString(4, salle.getName());

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;

    }

    @Override
    public  boolean deleteSalle(String name) throws SQLException {
        jbdcConnection= getConnect();
        String delet = "DELETE FROM Salle WHERE name = ?";
        PreparedStatement preparedStatement = jbdcConnection.prepareStatement(delet);
        preparedStatement.setString(1, name);

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;

    }

    @Override
    public Salle getSalleByName(String name) {

        Salle salle=null;

        String select="SELECT * FROM Salle WHERE name=?";
        try{
            jbdcConnection=getConnect();
            PreparedStatement st = jbdcConnection.prepareStatement(select);
            st.setString(1, name);
            ResultSet resultSet=st.executeQuery();
            while(resultSet.next()){
                salle=creatSalleObject(resultSet);
            }
            deconnect();
        }catch (Exception ignored){

        }
        return salle;
    }
    @Override
    public ArrayList<Salle> getSalleByNameExposition(String nameExposition) {

        ArrayList<Salle> arrayList = new ArrayList<>();

        String select="SELECT * FROM Salle WHERE nameExposition=?";
        try{
            jbdcConnection=getConnect();
            PreparedStatement st = jbdcConnection.prepareStatement(select);
            st.setString(1, nameExposition);
            ResultSet resultSet=st.executeQuery();
            while(resultSet.next()){
                Salle salle=creatSalleObject(resultSet);
                arrayList.add(salle);

            }
            deconnect();
        }catch (Exception ignored){

        }
        return arrayList;
    }

    public Salle creatSalleObject(ResultSet resultSet) throws SQLException {
        String name = resultSet.getString("name");
        String nameExposition = resultSet.getString("nameExposition");
        int nbrPlacen = Integer.parseInt(resultSet.getString("nbrPlace"));

        return new Salle(name, nbrPlacen, nameExposition) ;
    }

}
