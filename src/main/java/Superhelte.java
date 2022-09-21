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

    public  void setNavn(String navn){
    this.navn=navn;
    }

    public void setRigtignavn(String rigtignavn){
        this.rigtignavn=rigtignavn;
    }

    public void setSuperkraft(String superkraft){
        this.superkraft=superkraft;
    }

    public void setMenneske(boolean menneske){
        this.menneske=menneske;
    }

    public void setOprettelseÅr(int oprettelseÅr){
        this.oprettelseÅr=oprettelseÅr;
    }

    public void setStyrke(double styrke){
        this.styrke=styrke;
    }

    @Override
    public String toString (){
        return navn + " " + rigtignavn + " " + superkraft + " " + menneske + " " + oprettelseÅr + " " + styrke;
    }

}

