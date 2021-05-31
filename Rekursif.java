/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial5;

/**
 *
 * @author Feri Winarta
 */
public class Rekursif {
    public static void main(String[] args) {
        
        int total = rekursif(10);
        System.out.println("total = " + total);
        
        
    }
//    public static void rekursif(int parameter) {
//        System.out.println("ini adalah rekursif " + parameter);
//        if (parameter == 1){
//            return;
//        }
//        parameter--;
//        rekursif(parameter);
//    }
//    
//    public static int rekursif2(int parameter) {
//        System.out.println("parameter ke " + parameter);
//        if(parameter == 0) {
//            return parameter;
//        }
//        return parameter + rekursif2(parameter - 1);
//    }
    
//    public static int rekursif(int a) {
//        System.out.println("Rekursif ke " + a);
//        if (a == 10) {
//            return a;
//        }
//        
//        return a + rekursif(a + 1);
//    }
    
    public static int rekursif(int x) {
        System.out.println("rekursif ke " + x);
       
        if(x == 0) {
            return 0;
        }
        
        int total = 0;
        total = rekursif(x-1);
        return total;
    }
    
    
}
