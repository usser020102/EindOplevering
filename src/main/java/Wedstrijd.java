import java.util.Scanner;

public class Wedstrijd {
    private String keuze;
    private int aantal;
    private int scoreT;
    private int scoreU;
    Scanner scanner = new Scanner(System.in);

    /**
     * Normaal gesproken kan de tafelaar op de tablet direct klikken welk team heeft gescoord
     * In intelliJ heb ik zo gedaan dat de gebruiker t (thuisteam) / u (uitteam) invoert
     * en dan de hoeveelheid punten toevoegt aan de team.
     */

    public void getScore() {
        System.out.print("Voer 'j' in om de wedstrijd te starten: ");
        boolean temp = true;
        String s = scanner.nextLine();
        if(s.equals("j")){
            temp = true;
        }
        System.out.println("Wedstrijd is begonnen!");
        while(temp){
            System.out.println("Welk team heeft er gescoord t/u: ");
            keuze = scanner.nextLine();
            if (keuze.equals("t")) {
                System.out.println("Hoeveel punten zijn er gescoord door het thuisteam: ");
                aantal = scanner.nextInt();
                scoreT += aantal;
                scanner.nextLine();
                System.out.print("Einde (voer 's' in voor ja, 'n' voor nee): ");
                s = scanner.nextLine();
                if (s.equals("s")){
                    temp = false;
                    break;
                }
            } else {
                System.out.println("Hoeveel punten zijn er gescoord door het uitteam: ");
                aantal = scanner.nextInt();
                scoreU += aantal;
                scanner.nextLine();
                System.out.print("Einde (voer 's' in voor ja, 'n' voor nee): ");
                s = scanner.nextLine();
                if (s.equals("s")){
                    temp = false;
                    break;
                }
            }
        }
        System.out.println("Eindstand: "  + "Thuis " + scoreT + " - " + scoreU + " Uit");
        if(scoreT > scoreU){
            System.out.println("Thuisteam heeft gewonnen!");
        }
        else if(scoreU > scoreT){
            System.out.println("Uitteam heeft gewonnen!");
        } else if(scoreT == scoreU){
            System.out.println("Gelijk spel!");
        }
    }

    public int getScoreT() {
        return scoreT;
    }

    public int getScoreU() {
        return scoreU;
    }


} //Einde van class Wedstrijd









