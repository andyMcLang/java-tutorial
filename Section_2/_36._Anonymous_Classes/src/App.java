// 36. Anonymous Classes

class Kone {
    void start() {
        System.out.println("kone käynnistyy...");
    }
}

interface Kasvi {
    void kasva();
}

public class App {
    public static void main(String[] args) {
        Kone kone1 = new Kone() {
            @Override
            void start() {
                System.out.println("Kamera napsii kuvia!");
            }
        };

        kone1.start();

        Kasvi kasvi = new Kasvi() {
            @Override
            public void kasva() {
                System.out.println("kasvi kasvaa!");
            }
        };

        kasvi.kasva();
    }
}
