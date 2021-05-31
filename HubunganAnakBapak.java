/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hubungan;

class Bapak {
    String nama;
    int duit;
    
    
    public Bapak() {
        
    }
    
    public Bapak(String nama) {
        this.nama = nama;
    }
    
    public Anak aksesAnak() {
        Anak ank2 = new Anak();
        return ank2;
    }
}

class Anak extends Bapak{
    int umur;
    int sekolah;
    
    public Anak(String nama) {
        super(nama);
    }
    
    public Anak() {
        
    }
    void setUmur(int umur) {
        this.umur = umur;
    }
    
    void pengecekan() {
        
    }
}

public class HubunganAnakBapak {
    public static void main(String[] args) {
        
        Bapak bpk = new Bapak("tutung");
        System.out.println(bpk.nama);
        
        Anak ank = new Anak("sandhoro");
        System.out.println(ank.nama); 
        Object Bapak;
        // cara agar kelas bapak dapat mengakses kelas anak
        // polimorfisme berlaku hanya untuk method tururannya saja
        
    }      
    
   
}
