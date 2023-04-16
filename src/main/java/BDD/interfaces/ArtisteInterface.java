package BDD.interfaces;

import Entity.Artiste;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ArtisteInterface {

   boolean insertArtiste(Artiste artiste) throws SQLException;
   ArrayList<Artiste> listeAllArtistes () throws SQLException;
   boolean findArtiste(Artiste artiste) throws SQLException;
   Artiste getArtisteById(int id);
   Artiste creatArtisteObject(ResultSet resultSet) throws SQLException;
   Artiste getArtisteByPseudo(String pseudo);
}
