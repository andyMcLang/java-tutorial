import java.util.Scanner;

// 11. Getting User Input
public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line;

        System.out.print("Anna jotain: ");
        line = input.nextLine();

        System.out.println("Annoit sanan: " + line);
    }
}
