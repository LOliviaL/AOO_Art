package BDD.repository;

import BDD.interfaces.PeintureInterface;
import Entity.Peinture;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PeintureObjet implements PeintureInterface {

    private static ArrayList<Peinture> peintureList=new ArrayList<>();
    @Override
    public ArrayList<Peinture> listeAllPeinture() {
        return peintureList;
    }

    @Override
    public boolean insertPeinture(Peinture peinture) {
        peintureList.add(peinture);
        return true;
    }

    @Override
    public boolean findPeinture(Peinture peinture) {
        Peinture peinturefind = null;
        for (Peinture p : peintureList){
            if (p.getName() == peinturefind.getName()){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePeinture(Peinture peinture){
        return false;
    }

    @Override
    public boolean deletePeinture(String name){
        for (Peinture peinturefind : peintureList){
            if (peinturefind.getName() == name){
                peintureList.remove(peinturefind);
                return true;
            }
        }
        return false;
    }

    @Override
    public Peinture getPeintureById(int id) {
        for (Peinture peinturefind : peintureList){
            if (peinturefind.getId() == id){
                return peinturefind;
            }
        }
        return null;
    }

    @Override
    public Peinture getPeintureByName(String name) {
        for (Peinture peinturefind : peintureList){
            if (peinturefind.getName() == name){
                return peinturefind;
            }
        }
        return null;
    }

    @Override
    public Peinture creatPeintureObject(ResultSet resultSet){
        return null;
    }
}
