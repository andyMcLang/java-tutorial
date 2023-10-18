// 21. Setters and "this"

class Sammakko {
    private String nimi;
    private int ika;

    public String getNimi() {
        return this.nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }
}

public class App {
    public static void main(String[] args) {
        Sammakko sammakko = new Sammakko();
        sammakko.setNimi("Saku");
        sammakko.setIka(1);

        System.out.println("Sammakko nimeltä " + sammakko.getNimi() + " on iältään " + sammakko.getIka());
    }
}
