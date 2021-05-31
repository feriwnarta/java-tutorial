package EqualApp;

import data.Produk;

public class EqualApp {

    static void cekAddres(Object o){
        if(o != null) {
            System.out.println(Integer.toHexString(o.hashCode()));
        }
    }

    public static void main(String[] args) {
        // @dibawah ada lagi

        Produk laptop = new Produk("Asus", 70000000);
        Produk laptop2 = new Produk("Asus", 70000000);
        Produk laptop3 = laptop; // laptop 3 akan menyimpan memorinya laptop, karena variabel objek aakan menyimpan
                                 // reference memori / alamat memori

        System.out.println(laptop == laptop2); // memori objek akan sama

        cekAddres(laptop);
        cekAddres(laptop2);
        cekAddres(laptop3);

        laptop.setNama("susA");
        System.out.println(laptop.getNama());
        System.out.println(laptop3.getNama());

        laptop3.setNama("Lenovo");

        System.out.println(laptop); // reference objek sama
        System.out.println(laptop3); // reference objek sama


        System.out.println(laptop.equals(laptop2)); // secara default method equals jika digunakan dalam bentuk objek
        // akan membandingkan alamat memori, bukan value dari objek tsb
        System.out.println(laptop.equals(laptop3));

        Produk p1 = new Produk("xiaomi", 1000);
        Produk p2 = new Produk("xiaomi", 100);
        System.out.println(p1.equals(p2));
        Produk p3 = new Produk("Lenovo", 1000);
        System.out.println(p1.equals(p3));
        Produk p4 = new Produk("xiaomi",100);
        System.out.println(p2.equals(p4));


        System.out.println(p1.getClass());
        System.out.println(p2.getClass());

















//        // Memori heap
//        String nama = "Feri";
//        nama = nama + " " + "Winarta";
//        System.out.println("nama 1 : " + Integer.toHexString(nama.hashCode()));
//        //System.out.println(nama);
//
//        // Karena Literal kesimpen di memory string pool yg ada di heap
//        String nama2 = "Feri Winarta"; // string pool
//        System.out.println("nama 2 : " +  Integer.toHexString(nama2.hashCode()));
//
//        System.out.println(nama == nama2);
//
//        // Karena Literal kesimpen di memory string pool yg ada di heap
//        String nama3 = "Feri Winarta";
//        System.out.println("nama 3 : " +  Integer.toHexString(nama3.hashCode()));
//        System.out.println(nama2 == nama3); // sama sama berada di string pool
//
//        System.out.println("");
//        nama3 = "Feri";
//        nama3 = nama3 + " " + "Winarta"; // string berubah ke memori heap
//        System.out.println(nama3);
//        System.out.println(nama2 == nama3);
//        System.out.println("nama 3 berubah : " +  Integer.toHexString(nama3.hashCode()));
    }
}
