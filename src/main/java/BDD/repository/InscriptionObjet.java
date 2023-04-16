package BDD.repository;

import BDD.interfaces.ArtisteInterface;
import BDD.interfaces.InscriptionInterface;
import Entity.Artiste;

import java.sql.Date;
import java.sql.SQLException;

public class InscriptionObjet implements InscriptionInterface {

    private String[] donnes;
    private ArtisteInterface artisteInterface;

    public InscriptionObjet(String[] donnes,ArtisteInterface artisteInterface){
        this.donnes=donnes;
        this.artisteInterface=artisteInterface;
    }
    @Override
    public boolean checkPseudoExist (String pseudo, ArtisteInterface artisteInterface){
        if (artisteInterface.getArtisteByPseudo(pseudo)!= null){
            return true;
        }
        return false;
    }
    @Override
    public boolean checkFormatPassword(String password){
        int majuscule = 0;
        int minuscule =0;
        int chiffre =0;

        for (int i=0; i<password.length()-1; i++){
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)){
                majuscule++;
            }
            if(Character.isLowerCase(ch)){
                minuscule++;
            }
            if(Character.isDigit(ch)){
                chiffre++;
            }
        }
        if (majuscule>=0 || minuscule>=0 || chiffre>=0 || password.length()>8){
            return true;
        }
        return false;
    }
    @Override
    public boolean checkCompte (ArtisteInterface artisteInterface, String pseudo,String password ){
        if (checkPseudoExist(pseudo, artisteInterface) || checkFormatPassword(password)){
            return true;
        }
        return false;
    }
    @Override
    public void createCompte() throws SQLException {
        if(checkCompte(artisteInterface, donnes[0], donnes[5])){
            Artiste newArtiste = new Artiste(donnes[0], donnes[1], donnes[2], donnes[3], Date.valueOf(donnes[4]), donnes[5]);
            saveCompteInBdd(newArtiste);
        }
        else{
            System.out.println("Problèmes dans les informations saisies !!");
        }
    }
    @Override
    public void saveCompteInBdd(Artiste artiste) throws SQLException {
        artisteInterface.insertArtiste(artiste);

    }
}
