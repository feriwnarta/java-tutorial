/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolyLebihDalam;

class Mobil {
    protected int ban;
    protected int speed;
    protected String lokasi;
    
    void setBan(int ban) {
        this.ban = ban;
    }
    
    void setSpeed(int speed) {
        this.speed = speed;
    }
    
    void diplay() {
        System.out.println("Jumlah ban \t: " + ban + "\n" +
                "Kecepatan \t : " + speed);
    }
    
    void setLokasi() {
        
    }
    
}

class Balap extends Mobil{
    void setLokasi() {
        System.out.println("circuit");
    }
    
}

class Offroad extends Mobil{
    void setLokasi() {
        System.out.println("hutan");
    }
}

class Umum extends Mobil{
    void setLokasi() {
        System.out.println("jalan raya");
    }
}


public class PolyEfektif {
    public static void main(String[] args) {
        
        Mobil m = new Balap();
        printAddres(m);
        m.setBan(4);
        m.setSpeed(2200);
        m.diplay();
        m.setLokasi();
        
        m = new Offroad();
        printAddres(m);
        m.setBan(4);
        m.setSpeed(1200);
        m.diplay();
        m.setLokasi();
        
        m = new Umum();
        printAddres(m);
        m.setBan(4);
        m.setSpeed(1100);
        m.diplay();
        m.setLokasi();
    }
    
    static void printAddres(Object obj) {
        int addres = obj.hashCode();
        String add = Integer.toHexString(addres);
        System.out.println(add);
    }
    
}
