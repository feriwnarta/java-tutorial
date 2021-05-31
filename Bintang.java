/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolyLebihDalam;

public class Bintang {
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--) {
            for(int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        int a = 4;
        for(int i = 1; i <= 5; i++) {
            for(int j = (i + a); j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
            if(i == 3 || i == 4) a -= 3;
            else a-=2;
            
        }
        
        
        
    }
}
