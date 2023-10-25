// 40. Runtime vs. Checked Exceptions
public class App {
    public static void main(String[] args) {
        String[] tekstia = {"yksi", "kaksi", "kolme"};

        try {
            System.out.println(tekstia[3]);
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }
    }
}
