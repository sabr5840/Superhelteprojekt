import java.util.ArrayList;
import java.util.List;
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
        System.out.println("Indtast ønsket superhelt, som skal redigeres:");
        String name = scanner.nextLine();
        List<Superhelte> superheltes = database.searchFor(name);
        if (superheltes.size()==0){
            System.out.println("Superhelt findes ikke, prøv igen");
        }else {
            Superhelte superhelte = superheltes.get(0);
            System.out.println("ret Superheltens navn ("+superhelte.getNavn()+"):");
            String newname = scanner.nextLine();
            if (!newname.isEmpty()){
                superhelte.setNavn(newname);
            }

            System.out.println("Ret superheltens rigtige navn ("+superhelte.getRigtignavn()+"):");
            String newrealname = scanner.nextLine();
            if (!newrealname.isEmpty()){
                superhelte.setRigtignavn(newrealname);
            }

            System.out.println("Ret superheltens superkraft("+superhelte.getSuperkraft()+"):");
            String newsuperpower = scanner.nextLine();
            if (!newsuperpower.isEmpty()){
                superhelte.setSuperkraft(newsuperpower);
            }

           System.out.println("Ret superheltens art ("+superhelte.getmenneske()+"):");
            boolean newhuman = scanner.nextBoolean();
            if (!newhuman.isEmpty()){
                int ishuman = Integer.parseInt(newhuman);
                superhelte.setMenneske(ishuman);
            }

            System.out.println("Ret superheltens oprettelseår ("+superhelte.getOprettelseÅr()+"):");
            try {
                String newcreationyear = scanner.nextLine();
                if (!newcreationyear.isEmpty()) {
                    int year = Integer.parseInt(newcreationyear);
                    superhelte.setOprettelseÅr(year);
                }
            }catch (NumberFormatException e){
                System.out.println("Ikke korrekt tal");
            }




            System.out.println("Ret superheltens styrke ("+superhelte.getStyrke()+"):");
            double power = scanner.nextDouble();
            if (!power.isEmpty()){
                superhelte.setStyrke(newcreationyear);
            }*/
        }


    }

}

