// 38. Handling Exceptions
package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {
    File file = new File("test.txt");

        try {
            FileReader fr = new FileReader(file);
            System.out.println("Tiedosto löytyi!");
        } catch (FileNotFoundException e) {
            System.out.println("Ei löydy tiedosto, ei millään!");
        }
    }
}
