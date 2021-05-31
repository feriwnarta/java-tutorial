/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaced;

/**
 *
 * @author Feri Winarta
 */
public class Xiaomi implements Handphone{

    @Override
    public void volumeUp() {
        System.out.println("Volume hp bertambah");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume hp berkurang ");
    }

    @Override
    public void powerOn() {
        System.out.println("Hp menyala");
    }

    @Override
    public void phisycKeyboard() {
        System.out.println("Tampil Keyboard");
    }
    
    public static void main(String[] args) {
        // tanpa polimorfisme
        Xiaomi hp = new Xiaomi();
        hp.powerOn();
        // dengan polimorfisme
        Handphone xiaomi = new Xiaomi();
        xiaomi.volumeDown();
        xiaomi.powerOn();

        
    }
            
    
}
