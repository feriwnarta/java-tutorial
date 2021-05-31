/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hubungan;

// Has - A
class Kelas1 {
    int data1;
    Kelas2 k2;
    
    
    void setData1(int data1) {
        this.data1 = data1;
    }
    int getData1() {
        return data1;
    }
    void getAkses() {
        k2 = new Kelas2(10000);
        
        //k2.setData2(1000);
    }
}

class Kelas2 {
    int data2;
    
    public Kelas2(int data2) {
        this.data2 = data2;
    }
    
    void setData2(int data2) {
        this.data2 = data2;
    }
    int getData2() {
        return data2;
    }
    // tanpa konstruktor data tetap kosong
    void showData() {
        System.out.println("data kelas 2: " + data2);
    }
    
}
public class HubungaApp {
    public static void main(String[] args) {
        // tanpa konstruktor data tetap kosong
        Kelas1 k1 = new Kelas1();
        k1.getAkses();
        k1.setData1(20);
        // karena dengan konstruktor tidak perlu isi data lagi
//        k1.k2.setData2(10);
        k1.k2.showData();
    }
}
