import java.util.ArrayList;

public class Database {


    private ArrayList<Superhelte> superhelte = new ArrayList<>();

    public void skabSuperhelt(String navn, String rigtignavn, String superkraft, boolean menneske, int oprettelseÅr, double styrke) {

        Superhelte superhelt = new Superhelte(navn, rigtignavn, superkraft, menneske, oprettelseÅr, styrke);
        System.out.println(superhelt);
        superhelte.add(superhelt);


    }




}
