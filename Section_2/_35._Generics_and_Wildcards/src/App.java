// 35. Generics and Wildcards

import java.util.ArrayList;

class Kone {

    @Override
    public String toString() {
        return "Tämä on kone!";
    }

    public void start() {
        System.out.println("Kone starttas!");
    }
}

class Kamera extends Kone {
    @Override
    public String toString() {
        return "Tämä on kamera";
    }

    public void otakuva() {
        System.out.println("Kamera otti kuvan!");
    }
}

public class App {
    public static void main(String[] args) {
        ArrayList<Kone> lista1 = new ArrayList<Kone>();
        lista1.add(new Kone());
        lista1.add(new Kone());

        ArrayList<Kamera> lista2 = new ArrayList<Kamera>();
        lista2.add(new Kamera());
        lista2.add(new Kamera());

        naytaLista(lista2);
        naytaLista2(lista1);
    }

    public static void naytaLista(ArrayList<? extends Kone> lista) {
        for (Kone arvo : lista) {
            System.out.println(arvo);
            arvo.start();
        }
    }

    public static void naytaLista2(ArrayList<? super Kamera> lista) {
        for (Object arvo : lista) {
            System.out.println(arvo);

        }
    }


    public static void naytaLista3(ArrayList<?> lista) {
        for (Object arvo : lista) {
            System.out.println(arvo);
        }
    }
}
