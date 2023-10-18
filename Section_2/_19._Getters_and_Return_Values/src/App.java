// 19. Getters and Return Values

class Henkilo {
    String nimi;
    int syntymavuosi;

    String getNimi() {
        return nimi;
    }

    int getSyntymavuosi() {
        return syntymavuosi;
    }
    int laskeIka() {
        return 2023-syntymavuosi;
    }
}

public class App {
    public static void main(String[] args) {
        Henkilo henkilo1 = new Henkilo();
        henkilo1.nimi = "Heikki";
        henkilo1.syntymavuosi = 1978;

        Henkilo henkilo2 = new Henkilo();
        henkilo2.nimi = "Antero";
        henkilo2.syntymavuosi = 1954;

        System.out.println(henkilo1.getNimi());

        System.out.println("Terve + " + henkilo1.getNimi() + ". Olet iältäsi " + henkilo1.laskeIka());
        System.out.println("Terve + " + henkilo2.getNimi() + ". Olet iältäsi " + henkilo2.laskeIka());

    }
}
