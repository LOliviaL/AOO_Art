package BDD.entityBDD;

import BDD.interfaces.SalleInterface;
import Entity.Artiste;
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

    public Salle creatSalleObject(ResultSet resultSet) throws SQLException {
        String name = resultSet.getString("name");
        String nameExposition = resultSet.getString("nameExposition");
        int nbrPlacen = Integer.parseInt(resultSet.getString("nbrPlace"));

        return new Salle(name, nbrPlacen, nameExposition) ;
    }

}
