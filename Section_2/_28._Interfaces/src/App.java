// 28. Interfaces
public class App {
    public static void main(String[] args) {
        Kone kone1 = new Kone();
        kone1.start();
        kone1.showInfo();

        Henkilo hlo1 = new Henkilo("Jaska");
        hlo1.tervehdys();
        hlo1.showInfo();

        Info hlo2 = new Henkilo("Kake");
        hlo2.showInfo();

        System.out.println("\n((Info) hlo1).showInfo(); : ");
        ((Info) hlo1).showInfo();

        System.out.println("\noutputInfos: ");
        outputInfo(kone1);
        outputInfo(hlo2);
    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }
}
