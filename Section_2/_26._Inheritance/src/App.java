// 26. Inheritance
public class App {
    public static void main(String[] args) {
        Kone kone1 = new Kone();
        kone1.kaynnista();

        System.out.println(kone1.nimi);

        Auto auto = new Auto();
        auto.kaynnista();
        auto.naytaNimi();
    }
}
