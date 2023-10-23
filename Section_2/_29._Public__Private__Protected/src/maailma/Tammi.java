package maailma;

public class Tammi extends Kasvi {
    public Tammi() {

        // Ei toimi --- Tyyppi on private
        // tyyppi = "puu";

        // Tämä toimii -- koska koko on protected,
        // maailma.Tammi on Kasvin alaluokka.
        this.koko = "suuri";

        // ei käyttöoikeusmääritystä
        // Toimii koska Kasvo on samassa paketissa
        this.korkeus = 10;
    }
}
