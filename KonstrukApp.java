/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konstruktor;

/**
 *
 * @author Feri Winarta
 */
public class App {
    int x;
    int y;
    
    public App() {
        this(0);
    }
    
    public App(int x) {
        this("asd");
        this.x = x;
    }
    
    public App(String name) {
        this(20,10);
        System.out.println("Name");
    }
    
    public App(int x, int y) {
        this("asd",10);
        this.x = x;
        this.y = y;
    }
    
    public App(String aga, int x) {
        System.out.println("wouy");
    }
    
    
    public static void main(String[] args) {
        App ap1 = new App("asd");
//        iterasi(12);
    }
    
    
//    static void iterasi(int x){
//        int y = x;
//        wouy();
//    }
//    
//    static void wouy() {
//        iterasi(12);
//    }
    
}
