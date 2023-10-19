// 25. The toString Method

class Orava {
    private String nimi;
    private int ika;

    Orava(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }

    @Override
    public String toString() {
        return String.format("Oravan nimi on %s ja sen ikä on %d", nimi, ika);
    }
}

public class App {
    public static void main(String[] args) {
        Orava orava1 = new Orava("Tiku", 1);
        Orava orava2 = new Orava("Olli", 2);

        System.out.println(orava1);
        System.out.println(orava2);

    }
}
