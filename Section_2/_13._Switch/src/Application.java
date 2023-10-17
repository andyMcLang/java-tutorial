// 13. Switch

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String komento;
        System.out.println("start - Käynnistää tietokoneen.");
        System.out.println("stop - Sulkee tietokoneen.\n");

        System.out.print("Anna komentosi: ");
        komento = scanner.nextLine();

        switch (komento) {
            case "start":
                System.out.println("Käynnistit tietokoneen!");
                break;
            case "stop":
                System.out.println("Suljit tietokoneen!");
                break;
            default:
                System.out.println("Nyt ei menny ihan oikein noi komennot!");
        }
    }
}
