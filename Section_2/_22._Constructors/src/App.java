// 22. Constructors

class Kone {
    public Kone() {
        this("sano", 23);
        System.out.println("Tämä on eka konstuktori.");
    }

    public Kone(String nimi) {
        System.out.println("Tämä on toinen konstuktori.");
    }

    public Kone(String nimi, int vuosimalli) {
        System.out.println("Tämä on kolmas konstuktori.");
        System.out.println("Koneen nimi on " + nimi + " ja vuosimallia " + vuosimalli);
    }
}
    public class App {
        public static void main(String[] args) {
            System.out.println("--------------");
            Kone kone1 = new Kone();
            System.out.println("--------------");
            Kone kone2 = new Kone("Kakka");
            System.out.println("--------------");
        }

}