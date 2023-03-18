package BDD;

import Entity.Peinture;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class PeintureBDD extends Bdd{

    public ArrayList<Peinture> listeAllPeinture () throws SQLException {
        jbdcConnection = getConnect();
        ArrayList<Peinture> peintureList = new ArrayList<>();
        Statement statement = jbdcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from Peinture");
        while (resultSet.next()){
            String name = resultSet.getString("name");
            String photo = resultSet.getString("photo");
            String estimationPrice = resultSet.getString("estimationPrice");
            String description = resultSet.getString("description");
            Date dateCreation = resultSet.getDate("dateCreation");
            String nameArtiste = resultSet.getString("nameArtiste");

            Peinture peinture =new Peinture(name, photo,description, Float.parseFloat(estimationPrice), dateCreation, nameArtiste);
            peintureList.add(peinture);
        }
        resultSet.close();
        statement.close();
        deconnect();
        return peintureList;
    }

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

    public boolean updatePeinture (Peinture peinture) throws SQLException {
        jbdcConnection=getConnect();
        String update = "UPDATE peinture SET photo=?,estimationPrice=?,description=?,dateCreation=?,nameArtiste=? WHERE name=?";
        PreparedStatement preparedStatement = jbdcConnection.prepareStatement(update);
        preparedStatement.setString(1, peinture.getPhoto());
        preparedStatement.setFloat(2, peinture.getEstimationPrice());
        preparedStatement.setString(3, peinture.getDescription());
        preparedStatement.setDate(4, (java.sql.Date) peinture.getDateCreation());
        preparedStatement.setString(5, peinture.getNameArtiste());
        preparedStatement.setString(6, peinture.getName());

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;

    }
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


}
