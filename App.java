/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refference;

/**
 *
 * @author Feri Winarta
 */

public class App {
    int angka = 3; // instance
    
    public static void main(String[] args) {        
        App ap = new App();
        int angka2 = 5;
        printAddres(ap.angka);
        printAddres(angka2);
    
        // pass bu value
        String nama = "sandi";
        printAddres(nama);
        value(nama);
        System.out.println(nama);
        System.out.println("");
        // pass by reference
        String[]name = new String[1];
        name[0] = "Yono";
        printAddres(name);
        System.out.println(name[0]);
        referensi(name);
        System.out.println(name[0]);
        System.out.println(name[0]);
        
        System.out.println("Sebelum berubah (pas by referensi) " + ap.angka);
        objek(ap);
        System.out.println(ap.angka);
        System.out.println(ap.angka);
    }
    
    static void objek(App ap) {
        ap.angka = 10;
    }
    
    static void referensi(String[] name) {
        name[0] = "yani";
        System.out.println(name[0]);
        printAddres(name[0]);
    }
    static void value(String nama) {
        nama = "adela";
        System.out.println(nama);
        printAddres(nama);
    }
    static void printAddres(Object obj) {
        System.out.println(Integer.toHexString(System.identityHashCode(obj)));
    }
            
}
