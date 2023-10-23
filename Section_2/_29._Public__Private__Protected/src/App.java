// 29. Public, Private, Protected

import maailma.Kasvi;
import maailma.Tammi;

/*
 * private -- vain samassa luokassa
 * public -- mistä vaan
 * protected -- samassa luokka, aliluokassa ja samassa paketissa
 * ei luokiteltu -- vain samssa paketissa
 */

public class App {
    public static void main(String[] args) {

        Kasvi kasvi = new Kasvi();

        Tammi tammi = new Tammi();

        System.out.println(kasvi.nimi);

        System.out.println(Kasvi.ID);

        // Ei toimi --- tyyppi on private
        // System.out.println(kasvi.tyyppi);

        // Ei toimi -- koko on protected
        // App ei ole samassa paketissa kuin Kasvi.
        // System.out.println(kasvi.koko);

        // Ei toimi
        // App ja Kasvi on eri paketissa, korkeudella on pakkaus-tason näkyvyys
        // System.out.println(kasvi.korkeus);
    }
}
