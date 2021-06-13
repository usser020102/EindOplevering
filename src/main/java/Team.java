import java.util.ArrayList;
import java.util.Scanner;

public class Team {

    private String teamT;
    private String teamU;
    private int no;
    private int no1;
    private ArrayList<String> spelersT = new ArrayList<>();
    private ArrayList<String> spelersU = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void addTeamT(){
        System.out.print("Voer hier de naam van het thuis team in: ");
        teamT = scanner.nextLine();
        System.out.print("Vul hier de aantal spelers in: ");
        no = scanner.nextInt();

        for (int i = 0; i< no; i++){
            System.out.print("Voornaam van speler " + (i+1) + ": ");
            spelersT.add(scanner.next());

        }
        System.out.println("Thuis team succesvol toegevoegd!");
        System.out.println();
    }

    public void addTeamU(){
        System.out.print("Voer hier de naam van het uit team in: ");
        scanner.nextLine();
        teamU = scanner.nextLine();
        System.out.print("Vul hier de aantal spelers in: ");
        no1 = scanner.nextInt();

        for (int i = 0; i< no1; i++){
            System.out.print("Voornaam van speler " + (i+1) + ": ");
            spelersU.add(scanner.next());
        }
        System.out.println("Uit team succesvol toegevoegd!");
    }

    public void printTeams(){
        System.out.println("Thuis team: " + getTeamT());
        for (int i = 0; i < getSpelersT().size(); i++) {
            System.out.println(getSpelersT().get(i));
        }
        System.out.println();
        System.out.println("Uit team: " + getTeamU());
        for (int i = 0; i < getSpelersU().size(); i++) {
            System.out.println(getSpelersU().get(i));
        }
    }
    public ArrayList<String> getSpelersT() {
        return spelersT;
    }

    public void setSpelersT(ArrayList<String> spelersT) {
        this.spelersT = spelersT;
    }

    public ArrayList<String> getSpelersU() {
        return spelersU;
    }

    public void setSpelersU(ArrayList<String> spelersU) {
        this.spelersU = spelersU;
    }

    public String getTeamT() {
        return teamT;
    }

    public String getTeamU() {
        return teamU;
    }

} // Einde van class Team
