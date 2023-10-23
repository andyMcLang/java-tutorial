// 30. Polymorphism

public class App {
    public static void main(String[] args) {
        Kasvi kasvi1 = new Kasvi();
        Puu puu = new Puu();

        Kasvi kasvi2 = puu;

        kasvi2.kasva();

        puu.tiputaLehdet();

        // Ei toimi!
        // kasvi2.tiputaLehdet();
    }

    public static void tekeeKasvamista(Kasvi kasvi) {
        kasvi.kasva();
    }

    public static void tiputaLehdet(Puu puu) {
        puu.tiputaLehdet();
    }
}