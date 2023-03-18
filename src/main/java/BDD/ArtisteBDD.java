package BDD;

import Entity.Artiste;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class ArtisteBDD extends Bdd{

    public ArrayList<Artiste> listeAllArtistes () throws SQLException {
        jbdcConnection = getConnect();
        ArrayList<Artiste> artisteList = new ArrayList<>();
        Statement statement = jbdcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from Artiste");
        while (resultSet.next()){
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            String photo = resultSet.getString("photo");
            Date dateNaiss = resultSet.getDate("dateNaiss");
            String password = resultSet.getString("password");
            Artiste artiste = new Artiste(name, surname, photo, dateNaiss, password);
            artisteList.add(artiste);
        }
        resultSet.close();
        statement.close();
        deconnect();
        return artisteList;
    }

    public boolean insertArtiste(Artiste artiste) throws SQLException {
        jbdcConnection = getConnect();
        String insert = "INSERT INTO Artiste( name, surname, photo, dateNaiss, password) VALUES (?,?,?,?,?)";

        PreparedStatement preparedStatement =jbdcConnection.prepareStatement(insert);
        preparedStatement.setString(1, artiste.getName());
        preparedStatement.setString(2, artiste.getSurname());
        preparedStatement.setString(3,artiste.getPhoto());
        preparedStatement.setDate(4, (java.sql.Date) artiste.getDateNaiss());
        preparedStatement.setString(5, artiste.getPassword());

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;
    }
    public  boolean findArtiste(Artiste artiste) throws SQLException {
        jbdcConnection=getConnect();
        String select = "SELECT * FROM Artiste WHERE name=?";
        PreparedStatement preparedStatement =jbdcConnection.prepareStatement(select);
        preparedStatement.setString(1, artiste.getName());

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;

    }
}
