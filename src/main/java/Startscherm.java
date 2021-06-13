import java.util.ArrayList;
import java.util.Scanner;

public class Startscherm {
    Scanner scanner = new Scanner(System.in);
    private int keuze;
    private String keuzeString;
    private String datum;
    private FAQ faq;
    private Ontvanger ontvanger;
    private Wedstrijd game;
    private Team team;

    public Startscherm(){
        this.faq = new FAQ();
        this.game = new Wedstrijd();
        this.team = new Team();
        this.ontvanger = new Ontvanger();
    }

    public void Menu(){
        System.out.println("1) Team toevoegen");
        System.out.println("2) Teams weergeven");
        System.out.println("3) Scorebord");
        System.out.println("4) Verzenden naar de basketbalbond");
        System.out.println("5) FAQ");
        System.out.print("Welkom in het startscherm, kies uw optie: ");
        keuze = scanner.nextInt();
        switch(keuze) {
            case 1:
                addTeam();
                break;
            case 2:
                printTeam();
                break;
            case 3:
                printScore();
            case 4:
                checkGame();
                break;
            case 5:
                printFAQ();
                break;

            default:
                throw new IllegalStateException("Keuze is niet mogelijk");
        }
    }

    private void checkGame() {
        if(team.getSpelersT().isEmpty() && team.getSpelersU().isEmpty()){
            System.out.println("Er kan geen gegevens verzonden worden!");
            Menu();
        }
        System.out.print("Wat is de datum vandaag (dd-mm-jjjj): ");
        datum = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Thuis team: " + team.getTeamT());
        for (int i = 0; i < team.getSpelersT().size(); i++) {
            System.out.println(team.getSpelersT().get(i));
        }
        System.out.println();
        System.out.println("Uit team: " + team.getTeamU());
        for (int i = 0; i < team.getSpelersU().size(); i++) {
            System.out.println(team.getSpelersU().get(i));
        }
        System.out.println();
        System.out.println("Score: " + team.getTeamT() + " " + game.getScoreT() + " - " + game.getScoreU() + " " + team.getTeamU());
        System.out.println("Gegevens zijn succesvol verstuurd naar: " + ontvanger.getEmail());
        System.out.println("Klik op 0 om terug te gaan naar het startscherm: ");
        keuzeString = scanner.nextLine();
        if (keuzeString.equals("0")) {
            Menu();
        } else {
            System.out.println("Gegevens zijn al verstuurd!");
            Menu();
        }
    }

    private void printScore() {
        game.getScore();
        keuzeString = scanner.nextLine();
        System.out.println("Klik op 0 om terug te gaan naar het startscherm: ");
        keuzeString = scanner.nextLine();
        if (keuzeString.equals("0")) {
            Menu();
        } else {
            System.out.println("Wedstrijd is geëindigd!");
            Menu();
        }

    }

    public void addTeam(){
        team.addTeamT();
        team.addTeamU();
        System.out.println("Klik op 0 om terug te gaan naar het startscherm: ");
        scanner.nextLine();
        keuzeString = scanner.nextLine();
        if(keuzeString.equals("0")){
            Menu();
        }
        else{
            System.out.println("U kunt maximaal 2 teams toevoegen!");
            Menu();
        }
    }


    public void printTeam(){
        if(team.getSpelersT().isEmpty() && team.getSpelersU().isEmpty()) {
            System.out.println("De thuis- en uitteam zijn leeg!");
            Menu();
        }else {
            team.printTeams();
            keuzeString = scanner.nextLine();
            System.out.println("Klik op 0 om terug te gaan naar het startscherm: ");
            keuzeString = scanner.nextLine();
            if (keuzeString.equals("0")) {
                Menu();
            } else {
                System.out.println("Teams zijn al weergegeven!");
                Menu();
            }
        }
    }

    public void printFAQ() {
        System.out.println("Meest gestelde vragen: ");
        faq.printVraag();
        keuzeString = scanner.nextLine();
        System.out.print("Klik op 0 om terug te gaan naar het startscherm en een ander getal om nog een vraag te beantwoorden: ");
        keuzeString = scanner.nextLine();
        if(keuzeString.equals("0")){
            this.Menu();
        }
        else{
            printFAQ();
        }
    }

    public int getKeuze() {
        return keuze;
    }

    public void setKeuze(int keuze) {
        this.keuze = keuze;
    }
} //Einde van class Startscherm
