public class Auto extends Kone {
    @Override
    void kaynnista() {
        System.out.println("Auto käynnistetty!");
    }

    void naytaNimi() {
        System.out.printf("Koneen nimi on %s.", nimi);
    }
}
