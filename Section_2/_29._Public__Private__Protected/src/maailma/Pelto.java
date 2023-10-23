package maailma;

public class Pelto {
    private Kasvi kasvi = new Kasvi();

    public Pelto() {
        // koko on protected; maailma.Pelto on samassa paketissa kuin maailma.Kasvi.
        System.out.println(kasvi.koko);
    }
}
