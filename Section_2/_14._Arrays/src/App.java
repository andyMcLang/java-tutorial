import java.util.Scanner;

// 14. Arrays
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arvo;
        int[] arvot = new int[3];

        for (int i = 0; i < arvot.length; i++) {
            System.out.print("Anna taulukon arvo [" + i + "]:");
            arvo = scanner.nextInt();
            arvot[i] = arvo;
        }

        System.out.println("Tulostit arvot:");
        for (int numerot : arvot) {
            System.out.println(numerot);
        }
    }
}
