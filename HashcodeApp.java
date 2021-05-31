package Overide_HashCode;

import data.Produk;

public class HashcodeApp {
    public static void main(String[] args) {

        Produk mayora = new Produk("Komo", 500);
        Produk duaKelinci = new Produk("kacang dua kelinci", 1000);

        System.out.println(mayora.hashCode());
        System.out.println(duaKelinci.hashCode());

        Produk mayora2 = new Produk("Jaguar", 100);
        System.out.println(mayora.equals(mayora2));
        System.out.println(mayora2.hashCode());
        System.out.println(mayora.hashCode() == mayora2.hashCode());


    }
}
