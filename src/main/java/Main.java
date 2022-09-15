import java.util.Scanner;
public class Main {

    Database database = new Database();
    Scanner scanner = new Scanner(System.in);

    int menuvalg;
    int valg;

    public void startMenu() {
        database.createTestData();
        do {
            System.out.println("Velkommen til Superhelteverden");
            System.out.println("------------------------------");
            System.out.println("1) opret ny superhelt \n 2) Søg efter superhelt \n 3) Vis alle superhelte \n 4) Afslut program ");

            int valg = scanner.nextInt();
            scanner.nextLine();
            if (valg == 1) {
                opretSuperhelt();
            } else if (valg == 2) {
                søgHelt();
            } else if (valg == 3) {
                listeMenu();
            } else if (valg == 4) {
                System.exit(0);
            }
        } while (valg != 4);
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

    public void listeMenu (){
        System.out.println("Liste over superhelte");
        for (Superhelte superhelte : database.getSuperhelte()){
            System.out.println(superhelte.getNavn() + superhelte.getRigtignavn()
                    + superhelte.getSuperkraft() + superhelte.getmenneske()
                    + superhelte.getOprettelseÅr() + superhelte.getStyrke());
        }
    }

    public void søgHelt(){
        System.out.println("Søg efter superhelt");
        String searchTerm = scanner.nextLine();
        Superhelte fundet = database.searchTerm(searchTerm);
        if (fundet == null){
            System.out.println("intet resultat");
        }else{
            System.out.println("Heltenavn: " + fundet.getNavn() + "\n" + "Rigtigt navn: " + fundet.getRigtignavn() + "\n" +
                    "Superkraft: " + fundet.getSuperkraft() + "\n" + "Menneske eller ej: " + fundet.getmenneske() + "\n" +
                    "Årtal skabt: " + fundet.getOprettelseÅr() + "\n" + "Styrke: " + fundet.getStyrke());
        }
    }

    //Programmet startes
    public static void main(String[] arg){
        Main program = new Main();
        program.startMenu();
    }

}

