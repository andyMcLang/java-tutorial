package maailma;

public class Kasvi {
    // Huono käytäntö
    public String nimi;

    // Hyväksyttävä käytäntö --- se on final.
    public static int ID = 8;

    protected String koko;

    int korkeus;

    private
    String tyyppi;

    public Kasvi() {
        this.nimi = "Reetu";
        this.tyyppi = "kasvi";
        this.koko = "keskikoko";
        this.korkeus = 8;
    }
}
