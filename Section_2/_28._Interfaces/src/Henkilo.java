public class Henkilo implements Info {

    private String nimi;

    public Henkilo(String nimi) {
        this.nimi = nimi;
    }

    void tervehdys() {
        System.out.printf("Terve %s!\n", nimi);
    }

    @Override
    public void showInfo() {
        System.out.printf("Henkilön nimi on %s\n", nimi);
    }
}
