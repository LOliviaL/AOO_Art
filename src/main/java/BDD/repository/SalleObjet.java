package BDD.repository;

import BDD.interfaces.SalleInterface;
import Entity.Salle;

import java.sql.SQLException;
import java.util.ArrayList;

public class SalleObjet implements SalleInterface {
    private static ArrayList<Salle> sallesList=new ArrayList<>();

    @Override
    public ArrayList<Salle> listeAllSalle() throws SQLException {
        return sallesList;
    }

    @Override
    public Salle getSalleByName(String name) {
        for (Salle sallefind : sallesList){
            if (sallefind.getName() == name){
                return sallefind;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Salle> getSalleByNameExposition(String nameExposition) {
        ArrayList<Salle> liste =new ArrayList<>();
        for (Salle sallefind : sallesList){
            if (sallefind.getNameExposition() == nameExposition){
                liste.add(sallefind);
                return liste;
            }
        }
        return null;
    }

    @Override
    public boolean insertSalle(Salle salle) throws SQLException {
        sallesList.add(salle);
        return true;
    }

    @Override
    public boolean updateSalle(Salle salle) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteSalle(String name) throws SQLException {
        for (Salle sallefind : sallesList){
            if (sallefind.getName() == name){
                sallesList.remove(sallefind);
                return true;
            }
        }
        return false;
    }
}
