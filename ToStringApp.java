package OverideToString;

import data.Produk;

public class ToStringApp {
    public static void main(String[] args) {
        Produk laptop = new Produk("Asus ROG", 15000000);
        System.out.println(laptop.getNama());
        System.out.println(laptop.getHarga());

        System.out.println(laptop);

        Produk handphone = new Produk("Xiaomi Redmi 5 Plus", 2300000);
        System.out.println(handphone);
    }
}
