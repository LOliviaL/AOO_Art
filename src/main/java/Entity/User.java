package Entity;
import java.util.Scanner;

/**
 * User
 */
public class User {
    private static Scanner sc = new Scanner(System.in);
    private static String name;
    private static String surname;
    private static String pseudo;
    private static String password;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;

    }
    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String pseudo) {
        this.surname = surname;

    }
    public String getPseudo() {
        return this.pseudo;
    }
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;

    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;

    }
    public User(String pseudo, String password){
        this.pseudo = pseudo;
        this.password=password;
    }




}