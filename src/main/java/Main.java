import java.util.Scanner;

public class Main {


public static void main(String[]args) {

    System.out.println("Velkommen til Superhelteverden");

    Database database = new Database();
    Scanner scanner = new Scanner(System.in);

    do {
        System.out.println("1) for at oprette ny superhelt");
        System.out.println("9) for af afslutte");
        int menuvalg = scanner.nextInt();

        //scanner.nextLine(); - fix for scanner bug

        if (menuvalg) ==1){

            System.out.println("Opret en superhelt");
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

        }else if (menuvalg == 9) ;
        {
            System.out.println("Programmet afsluttes");
        }
    } while (menuvalg != 9);


}}
