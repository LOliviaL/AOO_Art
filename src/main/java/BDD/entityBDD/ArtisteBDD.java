package BDD.entityBDD;

import BDD.interfaces.ArtisteInterface;
import Entity.Artiste;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class ArtisteBDD extends Bdd implements ArtisteInterface {

    @Override
    public ArrayList<Artiste> listeAllArtistes () throws SQLException {
        jbdcConnection = getConnect();
        ArrayList<Artiste> artisteList = new ArrayList<>();
        Statement statement = jbdcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from Artiste");
        while (resultSet.next()){
            Artiste artiste = creatArtisteObject(resultSet);
            artisteList.add(artiste);
        }
        resultSet.close();
        statement.close();
        deconnect();
        return artisteList;
    }
    @Override
    public boolean insertArtiste(Artiste artiste) throws SQLException {
        jbdcConnection = getConnect();
        String insert = "INSERT INTO Artiste( pseudo, name, surname, photo, password,  dateNaiss) VALUES (?,?,?,?,?,?)";

        PreparedStatement preparedStatement =jbdcConnection.prepareStatement(insert);
        preparedStatement.setString(1, artiste.getPseudo());
        preparedStatement.setString(2, artiste.getName());
        preparedStatement.setString(3, artiste.getSurname());
        preparedStatement.setString(4,artiste.getPhoto());
        preparedStatement.setString(5, artiste.getPassword());
        preparedStatement.setDate(6, (java.sql.Date) artiste.getDateNaiss());


        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;
    }
    @Override
    public  boolean findArtiste(Artiste artiste) throws SQLException {
        jbdcConnection=getConnect();
        String select = "SELECT * FROM Artiste WHERE pseudo=?";
        PreparedStatement preparedStatement =jbdcConnection.prepareStatement(select);
        preparedStatement.setString(1, artiste.getPseudo());

        boolean rowInsert = preparedStatement.executeUpdate()>0;
        preparedStatement.close();
        deconnect();
        return rowInsert;

    }

    @Override
    public Artiste getArtisteById(int id) {
        return null;
    }

    @Override
    public Artiste getArtisteByPseudo(String pseudo) {

        Artiste artiste=null;

        String select="SELECT * FROM Artiste WHERE pseudo=?";
        try{
            jbdcConnection=getConnect();
            PreparedStatement st = jbdcConnection.prepareStatement(select);
            st.setString(1, pseudo);
            ResultSet resultSet=st.executeQuery();
            while(resultSet.next()){
                artiste=creatArtisteObject(resultSet);
            }
            deconnect();
        }catch (Exception ignored){

        }
        return artiste;
    }


    @Override
    public Artiste creatArtisteObject(ResultSet resultSet) throws SQLException {

        String pseudo = resultSet.getString("pseudo");
        String name = resultSet.getString("name");
        String surname = resultSet.getString("surname");
        String photo = resultSet.getString("photo");
        Date dateNaiss = resultSet.getDate("dateNaiss");
        String password = resultSet.getString("password");

        return new Artiste(pseudo,name, surname, photo, dateNaiss, password);
    }
}
