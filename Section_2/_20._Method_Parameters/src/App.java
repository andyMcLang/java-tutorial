// 20. Method Parameters

class Henkilo {
    String nimi;
    int ika;

    void sukunimi(String sukunimi) {
        System.out.println("Sukunimesi on siis "+ sukunimi);
    }

    void hyppy(int pituus) {
        System.out.println("Hyppäsit siis " + pituus + " metriä.");
    }

    void matka(int pituus, String suunta) {
        System.out.println("Suuntanasi on siis " + suunta + " ja matkan pituusesi on " + pituus + " metriä.");
    }
}

public class App {
    public static void main(String[] args) {
        Henkilo henkilo1 = new Henkilo();
        henkilo1.nimi = "Heikki";
        henkilo1.ika = 32;

        System.out.println("Nimesi on " + henkilo1.nimi + " ja ikäsi on " + henkilo1.ika);
        henkilo1.sukunimi("Laitela");
        henkilo1.hyppy(1);
        henkilo1.matka(23, "pohjoinen");
    }
}
