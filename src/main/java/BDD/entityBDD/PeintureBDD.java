package BDD.entityBDD;

import BDD.interfaces.PeintureInterface;
import Entity.Artiste;
import Entity.Peinture;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class PeintureBDD extends Bdd implements PeintureInterface {

    @Override
    public ArrayList<Peinture> listeAllPeinture () throws SQLException {
        jbdcConnection = getConnect();
        ArrayList<Peinture> peintureList = new ArrayList<>();
        Statement statement = jbdcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from Peinture");
        while (resultSet.next()){
            Peinture peinture = creatPeintureObject(resultSet);
            peintureList.add(peinture);
        }
        resultSet.close();
        statement.close();
        deconnect();
        return peintureList;
    }
    @Override
    public boolean insertPeinture( Peinture peinture) throws SQLException {
        jbdcConnection= getConnect();
        String insert = "INSERT INTO peinture( name, photo, estimationPrice, description, dateCreation, nameArtiste) " +
                "VALUES (?,?,?,?,?,?)";
        PreparedStatement preparedStatement = jbdcConnection.prepareStatement(insert);
        preparedStatement.setString(1, peinture.getName());
        preparedStatement.setString(2, peinture.getPhoto());
        preparedStatement.setFloat(3,peinture.getEstimationPrice());
        preparedStatement.setString(4,peinture.getDescription());
        preparedStatement.setDate(5, (java.sql.Date) peinture.getDateCreation());
        preparedStatement.setString(6, peinture.getNameArtiste());

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;
    }
    @Override
    public  boolean findPeinture(Peinture peinture) throws SQLException {
        jbdcConnection=getConnect();
        String select = "SELECT * FROM Peinture WHERE name=?";
        PreparedStatement preparedStatement =jbdcConnection.prepareStatement(select);
        preparedStatement.setString(1, peinture.getName());

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;
    }
    @Override
    public boolean updatePeinture (Peinture peinture) throws SQLException {
        jbdcConnection=getConnect();
        String update = "UPDATE peinture SET name=?,photo=?,estimationPrice=?,description=?,dateCreation=?,nameArtiste=? WHERE Id=?";
        PreparedStatement preparedStatement = jbdcConnection.prepareStatement(update);
        preparedStatement.setString(1, peinture.getName());
        preparedStatement.setString(2, peinture.getPhoto());
        preparedStatement.setFloat(3, peinture.getEstimationPrice());
        preparedStatement.setString(4, peinture.getDescription());
        preparedStatement.setDate(5, (java.sql.Date) peinture.getDateCreation());
        preparedStatement.setString(6, peinture.getNameArtiste());
        preparedStatement.setString(7, peinture.getName());
        preparedStatement.setInt(7, peinture.getId());

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;

    }
    @Override
    public  boolean deletePeinture (String name) throws SQLException {
        jbdcConnection= getConnect();
        String delet = "DELETE FROM peinture WHERE name = ?";
        PreparedStatement preparedStatement = jbdcConnection.prepareStatement(delet);
        preparedStatement.setString(1, name);

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;

    }
    @Override
    public Peinture getPeintureById(int id) {

        Peinture peinture=null;
        String select="SELECT * FROM Peinture WHERE Id=?";

        try{
            jbdcConnection=getConnect();
            PreparedStatement st = jbdcConnection.prepareStatement(select);
            st.setInt(1, id);
            ResultSet resultSet=st.executeQuery();
            while(resultSet.next()){
                peinture=creatPeintureObject(resultSet);
            }
            deconnect();
        }catch (Exception ignored){

        }
        return peinture;
    }
    @Override
    public Peinture getPeintureByName(String name) {

        Peinture peinture=null;
        String select="SELECT * FROM Peinture WHERE name=?";

        try{
            jbdcConnection=getConnect();
            PreparedStatement st = jbdcConnection.prepareStatement(select);
            st.setString(1, name);
            ResultSet resultSet=st.executeQuery();
            while(resultSet.next()){
                peinture=creatPeintureObject(resultSet);
            }
            deconnect();
        }catch (Exception ignored){

        }
        return peinture;
    }


    @Override
    public Peinture creatPeintureObject(ResultSet resultSet) throws SQLException {

        int id=resultSet.getInt("Id");

        String name = resultSet.getString("name");
        String photo = resultSet.getString("photo");
        String estimationPrice = resultSet.getString("estimationPrice");
        String description = resultSet.getString("description");
        Date dateCreation = resultSet.getDate("dateCreation");
        String nameArtiste = resultSet.getString("nameArtiste");

        return new Peinture(id,name, photo,description, Float.parseFloat(estimationPrice), dateCreation, nameArtiste);
    }


}
