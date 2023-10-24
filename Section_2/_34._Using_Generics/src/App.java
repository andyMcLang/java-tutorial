import java.util.ArrayList;

// 34. Using Generics
public class App {
    public static void main(String[] args) {
        ArrayList<String> jokuLista = new ArrayList<>();
        jokuLista.add("Koira");
        jokuLista.add("Kissa");
        jokuLista.add("Hiiri");

        System.out.println(jokuLista.get(2));
        System.out.println();

        for (String elain : jokuLista) {
            System.out.println(elain);
        }
    }
}
