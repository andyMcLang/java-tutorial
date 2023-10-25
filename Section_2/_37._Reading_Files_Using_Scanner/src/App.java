// 37. Reading Files Using Scanner

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class App {
    public static void main(String[] args) throws FileNotFoundException {
        String tiedostonimi = "example.txt";

        File tekstitiedosto = new File(tiedostonimi);

        Scanner in = new Scanner(tekstitiedosto);

        int arvo = in.nextInt();
        System.out.println("Arvo: " + arvo);

        in.nextLine();

        int laskuri = 1;
        while (in.hasNext()) {
            String linja = in.nextLine();
            System.out.println(laskuri + ": " + linja);
            laskuri++;
        }
        in.close();
    }
}