package BDD.entityBDD;

import BDD.interfaces.OeuvreInterface;
import Entity.Oeuvre;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class OeuvreBDD extends Bdd implements OeuvreInterface {

    @Override
    public ArrayList<Oeuvre> listeAllOeuvre() throws SQLException {
        jbdcConnection = getConnect();
        ArrayList<Oeuvre> oeuvreList = new ArrayList<>();
        Statement statement = jbdcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from Oeuvre");
        while (resultSet.next()){
            Oeuvre oeuvre = creatOeuvreObject(resultSet);
            oeuvreList.add(oeuvre);
        }
        resultSet.close();
        statement.close();
        deconnect();
        return oeuvreList;
    }
    @Override
    public boolean insertOeuvre(Oeuvre oeuvre) throws SQLException {
        jbdcConnection= getConnect();
        String insert = "INSERT INTO Oeuvre( name, photo, estimationPrice, description, dateCreation, nameArtiste,nameSalle) " +
                "VALUES (?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = jbdcConnection.prepareStatement(insert);
        preparedStatement.setString(1, oeuvre.getName());
        preparedStatement.setString(2, oeuvre.getPhoto());
        preparedStatement.setFloat(3, oeuvre.getEstimationPrice());
        preparedStatement.setString(4, oeuvre.getDescription());
        preparedStatement.setDate(5, (java.sql.Date) oeuvre.getDateCreation());
        preparedStatement.setString(6, oeuvre.getNameArtiste());
        preparedStatement.setString(7, oeuvre.getNameSalle());

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;
    }
    @Override
    public  boolean findoeuvre(Oeuvre oeuvre) throws SQLException {
        jbdcConnection=getConnect();
        String select = "SELECT * FROM Oeuvre WHERE name=?";
        PreparedStatement preparedStatement =jbdcConnection.prepareStatement(select);
        preparedStatement.setString(1, oeuvre.getName());

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;
    }
    @Override
    public boolean updateOeuvre(Oeuvre oeuvre) throws SQLException {
        jbdcConnection=getConnect();
        String update = "UPDATE Oeuvre SET name=?,photo=?,estimationPrice=?,description=?,dateCreation=?,nameArtiste=?, nameSalle=? WHERE name=?";
        PreparedStatement preparedStatement = jbdcConnection.prepareStatement(update);
        preparedStatement.setString(1, oeuvre.getName());
        preparedStatement.setString(2, oeuvre.getPhoto());
        preparedStatement.setFloat(3, oeuvre.getEstimationPrice());
        preparedStatement.setString(4, oeuvre.getDescription());
        preparedStatement.setDate(5, (java.sql.Date) oeuvre.getDateCreation());
        preparedStatement.setString(6, oeuvre.getNameArtiste());
        preparedStatement.setString(7, oeuvre.getNameSalle());
        preparedStatement.setString(8, oeuvre.getName());

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;

    }
    @Override
    public  boolean deleteOeuvre(String name) throws SQLException {
        jbdcConnection= getConnect();
        String delet = "DELETE FROM Oeuvre WHERE name = ?";
        PreparedStatement preparedStatement = jbdcConnection.prepareStatement(delet);
        preparedStatement.setString(1, name);

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;

    }
    @Override
    public Oeuvre getOeuvreById(int id) {

        Oeuvre oeuvre =null;
        String select="SELECT * FROM Oeuvre WHERE Id=?";

        try{
            jbdcConnection=getConnect();
            PreparedStatement st = jbdcConnection.prepareStatement(select);
            st.setInt(1, id);
            ResultSet resultSet=st.executeQuery();
            while(resultSet.next()){
                oeuvre = creatOeuvreObject(resultSet);
            }
            deconnect();
        }catch (Exception ignored){

        }
        return oeuvre;
    }
    @Override
    public Oeuvre getOeuvreByName(String name) {

        Oeuvre oeuvre =null;
        String select="SELECT * FROM Oeuvre WHERE name=?";

        try{
            jbdcConnection=getConnect();
            PreparedStatement st = jbdcConnection.prepareStatement(select);
            st.setString(1, name);
            ResultSet resultSet=st.executeQuery();
            while(resultSet.next()){
                oeuvre = creatOeuvreObject(resultSet);
            }
            deconnect();
        }catch (Exception ignored){

        }
        return oeuvre;
    }
    @Override
    public ArrayList<Oeuvre> getOeuvreBySalle(String nameSalle) {

        ArrayList<Oeuvre> arrayList = new ArrayList<>();
        String select="SELECT * FROM Oeuvre WHERE nameSalle=?";

        try{
            jbdcConnection=getConnect();
            PreparedStatement st = jbdcConnection.prepareStatement(select);
            st.setString(1, nameSalle);
            ResultSet resultSet=st.executeQuery();
            while(resultSet.next()){
                Oeuvre oeuvre = creatOeuvreObject(resultSet);
                arrayList.add(oeuvre);

            }
            deconnect();
        }catch (Exception ignored){

        }
        return arrayList;
    }


    @Override
    public Oeuvre creatOeuvreObject(ResultSet resultSet) throws SQLException {

        String name = resultSet.getString("name");
        String photo = resultSet.getString("photo");
        String estimationPrice = resultSet.getString("estimationPrice");
        String description = resultSet.getString("description");
        Date dateCreation = resultSet.getDate("dateCreation");
        String nameArtiste = resultSet.getString("nameArtiste");
        String nameSalle = resultSet.getString("nameSalle");

        return new Oeuvre(name, photo,description, Float.parseFloat(estimationPrice), dateCreation, nameArtiste, nameSalle);
    }


}
