package BDD.repository;

import BDD.interfaces.OeuvreInterface;
import Entity.Oeuvre;
import java.sql.ResultSet;
import java.util.ArrayList;

public class OeuvreObjet implements OeuvreInterface {

    private static ArrayList<Oeuvre> oeuvreList =new ArrayList<>();
    @Override
    public ArrayList<Oeuvre> listeAllOeuvre() {
        return oeuvreList;
    }

    @Override
    public boolean insertOeuvre(Oeuvre oeuvre) {
        oeuvreList.add(oeuvre);
        return true;
    }

    @Override
    public boolean findoeuvre(Oeuvre oeuvre) {
        Oeuvre peinturefind = null;
        for (Oeuvre p : oeuvreList){
            if (p.getName() == peinturefind.getName()){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateOeuvre(Oeuvre oeuvre){
        return false;
    }

    @Override
    public boolean deleteOeuvre(String name){
        for (Oeuvre peinturefind : oeuvreList){
            if (peinturefind.getName() == name){
                oeuvreList.remove(peinturefind);
                return true;
            }
        }
        return false;
    }

    @Override
    public Oeuvre getOeuvreById(int id) {
        for (Oeuvre peinturefind : oeuvreList){
            if (peinturefind.getId() == id){
                return peinturefind;
            }
        }
        return null;
    }

    @Override
    public Oeuvre getOeuvreByName(String name) {
        for (Oeuvre peinturefind : oeuvreList){
            if (peinturefind.getName() == name){
                return peinturefind;
            }
        }
        return null;
    }

    @Override
    public Oeuvre creatOeuvreObject(ResultSet resultSet){
        return null;
    }

    @Override
    public ArrayList<Oeuvre> getOeuvreBySalle(String nameSalle) {
        ArrayList<Oeuvre> liste =new ArrayList<>();
        for (Oeuvre peinturefind : oeuvreList){
            if (peinturefind.getNameSalle() == nameSalle){
                liste.add(peinturefind);
                return liste;
            }
        }
        return null;
    }
}
