import java.io.*;

// 42. Reading Files With File Reader
public class App {
    public static void main(String[] args) {
        File file = new File("teksti.txt");
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String linja;

            while ((linja = br.readLine()) != null) {
                System.out.println(linja);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa " + file.toString() + " ei löydy!");
        } catch (IOException e) {
            System.out.println("Tiedostoa " + file.toString() + " ei voi lukea!");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Ei voida sulkea tiedostoa nimeltä " + file.toString());
            } catch (NullPointerException ex) {
                // Tiedostoa mahdollisesti ei voitu edes avata!
            }
        }

    }
}
