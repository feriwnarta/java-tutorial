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
class Satu {
    int x = 20;
    
    void showX() {
        System.out.println(x);
    }
}

public class MethodRefrensi {
    int x = 10;
    public static void main(String[] args) {
        MethodRefrensi r = new MethodRefrensi();
        System.out.println(r.x);
        r.x = 20;
        System.out.println(r.x);
        // tetap 20
        r.showX();
        
        System.out.println("Objek satu");
        // merubah secara eksplisit
        Satu s = new Satu();
        System.out.println(s.x);
        // s.x = 40;
        // System.out.println(s.x);
        
        // method value
        //int x = 60;
        //r.ubahSatu(x);
        //System.out.println(x);
        
        // method reference
        System.out.println("\nreferensi");
        // cara agar objek tidak menagkses pass by refernce
        int x = s.x;
        r.ubahSatu(x);
        System.out.println(x);
        System.out.println(s.x);
        
        // mengakses reference
        r.refrence(s);
        System.out.println(s.x);
        s.showX();
    }
    void refrence(Satu obj) {
        obj.x = 60;
        System.out.println(obj.x);
    }
    
    void ubahSatu(int x) {
        
         x = 30;
         System.out.println(x);
    }
    
    void showX() {
        System.out.println(x);
    }
}
