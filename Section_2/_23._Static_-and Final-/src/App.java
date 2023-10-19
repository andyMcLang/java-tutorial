// 23. Static (and Final)

class Juttu {
    public static final String otsikko = "Otsikko";

    public static int laske = 0;

    public int id;

    public Juttu() {
        id = laske;
        laske++;
    }

    static void sano() {
        System.out.println(otsikko);
    }

    public void naytaNimi() {
        System.out.println("Objektin id on " + id + ", " + " on nimi");
    }
}

public class App {
    public static void main(String[] args) {
        String otsikko = Juttu.otsikko;
        Juttu.sano();

        System.out.println("Ennen laskentaa: " + Juttu.laske);

        Juttu juttu1 = new Juttu();
        Juttu juttu2 = new Juttu();
        Juttu juttu3 = new Juttu();

        System.out.println("Laskemisen jälkeen: " + Juttu.laske);

        juttu1.naytaNimi();
        juttu2.naytaNimi();
        juttu1.naytaNimi();
        juttu3.naytaNimi();
    }
}
