/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hub2Objek;


class Bank {
    protected String name;
    protected String addres;

    //default konstrktor
    Bank() {
        
    }
    
    Bank(String name, String addres) {
        this.name = name;
        this.addres = addres;
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    void setAddres(String addres) {
        this.addres = addres;
    }
    
    void display() {
        System.out.println("Nama bank \t: " + name + "\n"
        + "Alamat \t\t: " + addres);
    }
    
    
}

class Transfer extends Bank{
    int saldo;
    int noRek;
    
    void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    void setNoRek(int noRek) {
        this.noRek = noRek;
    }
    
    int getSaldo() {
        return saldo;
    }
    
    int getNoRek() {
        return noRek;
    }
    
}

public class HubApp {
    public static void main(String[] args) {
        
        Bank b1 = new Bank("BcB", "Kp.SindangSana");
        Transfer tf = new Transfer();
        b1.display(); // ada isinya
        tf.display(); // null
        tf.setNoRek(206);
        tf.setSaldo(10000000);
        // kenapa tf kosong, sdgkan b1 ada isinya ?
        // karena display b1. suda diisi datanya, oleh objek b1 (konstruktor)
        // sedangkan tf belum diisi oleh objeknya, walaupun diinherit
        // data yang dkirim hanya fieldnya saja bukan data nya
        // (BEDA OBJEK BEDA DATA)
        System.out.println(tf.getNoRek());
        System.out.println(tf.getSaldo());
        
        // contoh agar display tf ada isinya
        tf.setAddres("Kp Sindangsana 2");
        tf.setName("BJU");
        tf.display();
        
    }    
    
}
