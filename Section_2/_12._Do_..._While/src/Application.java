// 12. Do ... While

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arvo = 0;

        do {
            System.out.print("Anna numeroarvo: ");
            arvo = scanner.nextInt();
        } while (arvo != 5);
        System.out.println("Osuit numero 5:een ja se lopettaa ohgelman!");
    }
}
