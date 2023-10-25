public class Kamera extends Kone {
    @Override
    public void kaynnista() {
        System.out.println("Kamera käynnistetty!");
    }

    @Override
    public void teeJuttuja() {
        System.out.println("Otetaan kuvia!");
    }

    @Override
    public void sammuta() {
        System.out.println("Sammuta kamera!");
    }
}
