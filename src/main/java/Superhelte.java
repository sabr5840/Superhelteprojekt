public class Superhelte {

    private String navn;
    private String rigtignavn;
    private String superkraft;
    private boolean menneske;
    private int oprettelseÅr;
    private double styrke;

    public Superhelte(String navn, String rigtignavn, String superkraft, boolean menneske, int oprettelseÅr, double styrke) {
        this.navn = navn;
        this.rigtignavn = rigtignavn;
        this.superkraft = superkraft;
        this.menneske = menneske;
        this.oprettelseÅr = oprettelseÅr;
        this.styrke = styrke;
    }

    public String getNavn() {
        return navn;
    }

    public String getRigtignavn() {
        return rigtignavn;
    }

    public String getSuperkraft() {
        return superkraft;
    }

    public boolean getmenneske() {
        return menneske;
    }

    public int getOprettelseÅr() {
        return oprettelseÅr;
    }

    public double getStyrke() {
        return styrke;
    }

    public int setAntal() {
        return setAntal();
    }

    @Override
    public String toString (){
        return navn + " " + rigtignavn + " " + superkraft + " " + menneske + " " + oprettelseÅr + " " + styrke;
    }

}
