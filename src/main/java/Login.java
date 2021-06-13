import java.util.Scanner;

public class Login {
    private Startscherm enters;
    Scanner scanner = new Scanner(System.in);

    public Login(){
        this.enters = new Startscherm();
    }

    public boolean Inloggen(String un, String pw){
        System.out.println("Welkom!");
        System.out.print("Gebruikersnaam: ");
        un = scanner.nextLine();
        System.out.print("Wachtwoord: ");
        pw = scanner.nextLine();

        if(un.equals("admin") && pw.equals("abc123")){
            enters.Menu();
        }
        else if (un.equals("admin")){
            System.out.println("Wachtwoord onjuist!");
            Inloggen(un, pw);
        } else if(pw.equals("abc123")){
            System.out.println("Gebruikersnaam onjuist!");
            Inloggen(un, pw);
        } else {
            System.out.println("Onjuiste gebruikersnaam en wachtwoord!");
            Inloggen(un, pw);
        }
        return false;
    }
} // Einde van class Login
