// 17. Classes and Objects
public class App {
    public static void main(String[] args) {
        PunainenHedelma hedelma1 = new PunainenHedelma();
        hedelma1.nimi = "Omena";
        hedelma1.ika = 2;

        PunainenHedelma hedelma2 = new PunainenHedelma();
        hedelma2.nimi = "Banaani";
        hedelma2.ika = 3;

        System.out.println("Hedelmä: "+ hedelma1.nimi + " ja sen ikä: " + hedelma1.ika);

        System.out.println("Hedelmä: "+ hedelma2.nimi + " ja sen ikä: " + hedelma2.ika);
    }
}
