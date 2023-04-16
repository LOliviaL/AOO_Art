package BDD.interfaces;

import Entity.Artiste;

import java.sql.SQLException;

public interface InscriptionInterface {

    boolean checkPseudoExist (String pseudo, ArtisteInterface artisteInterface);

    boolean checkFormatPassword(String password);

    boolean checkCompte (ArtisteInterface artisteInterface, String pseudo,String password );

    void createCompte() throws SQLException;

    void saveCompteInBdd(Artiste artiste) throws SQLException;


}
