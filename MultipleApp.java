package application;

import data.MultipleGeneric;

public class MultipleApp {
    public static void main(String[] args) {

        MultipleGeneric<String, Integer> udin = new MultipleGeneric<>("Udin", 17);
        MultipleGeneric<String, Integer> totong = new MultipleGeneric<>("Totong", 60);
        MultipleGeneric<String, Integer> rohani = new MultipleGeneric<>("rohani", 52);

        String namaUdin = udin.getData1() + " umurnya " + udin.getData2();
        String namaTotong = totong.getData1() + " umurnya " + totong.getData2();
        String namaRohani = rohani.getData1() + " umurnya " + rohani.getData2();

        System.out.println(namaUdin);
        System.out.println(namaTotong);
        System.out.println(namaRohani);

    }
}
