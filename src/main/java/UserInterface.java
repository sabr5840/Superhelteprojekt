import java.util.ArrayList;
import java.util.Scanner;

//Alt main data er overflyttet til UserInterface

public class UserInterface {

    Database database = new Database();
    Scanner scanner = new Scanner(System.in);

    int valg;

    public void startMenu() {
        database.createTestData();
        do {
            System.out.println("------------------------------");
            System.out.println("Velkommen til Superhelteverden");
            System.out.println("------------------------------");
            System.out.println("1) Opret ny superhelt \n2) Søg efter superhelt \n3) Vis alle superhelte \n4) Rediger superhelt \n5) Afslut program ");

            int valg = scanner.nextInt();
            scanner.nextLine();
            if (valg == 1) {
                opretSuperhelt();
            } else if (valg == 2) {
                søgHelt();
            } else if (valg == 3) {
                listeMenu();
            } else if (valg == 4) {
                redigerSuperhelt();
            } else if (valg == 5) {
                System.exit(0);
            }
        } while (valg != 5);
    }

    private void opretSuperhelt() {
        System.out.println("indtast en superheltens navn (eks. superman)");
        String navn = scanner.nextLine();

        System.out.println("Indtast superheltens rigtige navn");
        String rigtignavn = scanner.nextLine();

        System.out.println("Indtast superheltens superkræfter");
        String superkraft = scanner.nextLine();

        System.out.println("Er superhelten et menneske (alternativ et rumvæsen eller robot? (j/n)");
        boolean menneske = scanner.nextLine().substring(0, 1).equalsIgnoreCase("/");

        System.out.println("Indtast superheltens oprettelse år");
        int oprettelseÅr = scanner.nextInt();

        System.out.println("Hvor stærk er superhelten (iforhold til et alm. menneske er 1:0)?");
        double styrke = scanner.nextDouble();

        database.skabSuperhelt(navn, rigtignavn, superkraft, menneske, oprettelseÅr, styrke);
    }

    public void listeMenu() {
        System.out.println("Liste over superhelte");
        for (Superhelte superhelte : database.getSuperhelte()) {
            System.out.println("Heltenavn: " + superhelte.getNavn() + "\n" + "Rigtigt navn: " + superhelte.getRigtignavn() + "\n" +
                    "Superkraft: " + superhelte.getSuperkraft() + "\n" + "Menneske eller ej: " + superhelte.getmenneske() + "\n" +
                    "Årtal skabt: " + superhelte.getOprettelseÅr() + "\n" + "Styrke: " + superhelte.getStyrke() + "\n");
        }
    }

    public void søgHelt() {
        System.out.println("Søg efter superhelt");
        String searchTerm = scanner.nextLine();
        ArrayList<Superhelte> fundet = database.searchFor(searchTerm);
        if (fundet.isEmpty()) {
            System.out.println("intet resultat fundet, prøv igen");
        } else {
            for (Superhelte superhelte : fundet) {
                System.out.println("Heltenavn: " + superhelte.getNavn() + "\n" + "Rigtigt navn: " + superhelte.getRigtignavn() + "\n" +
                        "Superkraft: " + superhelte.getSuperkraft() + "\n" + "Menneske eller ej: " + superhelte.getmenneske() + "\n" +
                        "Årtal skabt: " + superhelte.getOprettelseÅr() + "\n" + "Styrke: " + superhelte.getStyrke());
            }
        }

    }

    public void redigerSuperhelt () {
        System.out.println("Søg efter ønsket superhelt, som skal redigeres:");


    }

}

