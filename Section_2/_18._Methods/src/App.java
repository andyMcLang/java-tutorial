// 18. Methods

class Henkilo {
    String nimi;
    int ika;

    void esittele() {
        System.out.println("Terve " + nimi + ". Niin siis ikäsi oli "+ ika + ".");
    }
}

public class App {
    public static void main(String[] args) {
        Henkilo henkilo1 = new Henkilo();
        henkilo1.nimi = "Antero";
        henkilo1.ika = 45;

        Henkilo henkilo2 = new Henkilo();
        henkilo2.nimi = "Heikki";
        henkilo2.ika = 32;

        henkilo1.esittele();
        henkilo2.esittele();
    }
}
