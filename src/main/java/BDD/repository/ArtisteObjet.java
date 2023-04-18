package BDD.repository;

import BDD.interfaces.ArtisteInterface;
import Entity.Artiste;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ArtisteObjet implements ArtisteInterface {
    private static ArrayList<Artiste> artisteList=new ArrayList<>();
    @Override
    public boolean insertArtiste(Artiste artiste) {
        artisteList.add(artiste);
        return true;
    }

    @Override
    public ArrayList<Artiste> listeAllArtistes() {
        return artisteList;
    }

    @Override
    public boolean findArtiste(Artiste artiste)  {
        for (Artiste a : artisteList){
            if (a.getName() == artiste.getName()){
                return true;
            }
        }
        return false;
    }

    @Override
    public Artiste getArtisteById(int id) {

        for (Artiste artistefind : artisteList){
            if (artistefind.getId() == id){
                return artistefind;
            }
        }
        return null;
    }

    @Override
    public Artiste creatArtisteObject(ResultSet resultSet){
        return null;
    }

    @Override
    public Artiste getArtisteByPseudo(String pseudo) {
        for (Artiste artistefind : artisteList){
            if (artistefind.getPseudo() == pseudo){
                return artistefind;
            }
        }
        return null;
    }

}
