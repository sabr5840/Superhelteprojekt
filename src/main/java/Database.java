import java.util.ArrayList;

public class Database {


    private ArrayList<Superhelte> superhelte = new ArrayList<>();



    public void skabSuperhelt(String navn, String rigtignavn, String superkraft, boolean menneske, int oprettelseÅr, double styrke) {

        Superhelte superhelt = new Superhelte(navn, rigtignavn, superkraft, menneske, oprettelseÅr, styrke);
        System.out.println(superhelt);
        superhelte.add(superhelt);
    }

    public ArrayList<Superhelte> getSuperhelte(){
        return superhelte;
    }


    public Superhelte searchFor(String searchTerm){
        for (Superhelte superhelte : superhelte){
            String navn = superhelte.getNavn();
            if (superhelte.getNavn().equals(searchTerm)) {
                return superhelte;
            }
    }
        return null;
    }

    public void createTestData(){
        skabSuperhelt("Scarlet Witch", "Wanda Maximoff", "telekinese, energimanipulation og en eller anden form for neuroelektrisk grænseflade", false, 1989, 100);
        skabSuperhelt("Captain Marvel", "Carol Danvers", "forbedret styrke, udholdenhed, smidighed og holdbarhed, samt kan flyve og næsten total immunitet over for toksiner og giftstoffer", false, 1960, 100);
        skabSuperhelt("Black Widow", "Natasha Romanoff", "Mester i hemmelige kunster spionage, infiltration og subterfuge", false, 1884, 100);
        skabSuperhelt("She-hulk", "Jennifer Walter", "Overmenneskelig styrke, hurtighed, smidighed, udholdenhed og holdbarhed Regenerativ helbredende faktor Power-switching. Bevarer sin intelligens i She-Hulk-form", false, 1880, 100);
        skabSuperhelt("Spiderman", "Peter Parker", "Umenneskelige styrke, hurtighed, reflekser, udholdenhed, Spider-Sense alert, forhøjede sanser, vægcrawling", false, 1962, 100);
        skabSuperhelt("Captain America", "Steve Rogers", "Smidighed, styrke, hurtighed, udholdenhed og hurtig reaktionstid", false, 1941, 100);
        skabSuperhelt("Thor", "Thor", "Overmenneskelig styrke, hurtighed, udholdenhed og modstand mod skader, mester i torden og lyn", true, 1962, 100);
    }


    
    
}
