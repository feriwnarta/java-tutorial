/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberClass;

public class NumberApp {
    public static void main(String[] args) {
        
        // konveri tipe data primitif ke non primitif
        int a1 = 10;
        Integer nonInt = a1;
        System.out.println(nonInt);
        
        Integer int1 = 20;
        // konversi kelong dalam bentuk non primitif 
        Long toLong = int1.longValue();
        System.out.println(toLong);
        // konversi long ke short
        Short toShort = toLong.shortValue();
        System.out.println(toShort);
        // konversi short ke float
        Float toFloat = toShort.floatValue();
        System.out.println(toFloat);
        // konversi non primitif float ke string
        String toString = "Konversi dari float ke string " + toFloat.toString();
        System.out.println(toString);
        
        // konversi String ke number
        // integer
        String nomor = "123";
        Integer intNomor = Integer.valueOf(nomor);
        System.out.println(intNomor);
        
        // konversi string ke short
        Short shortNomor = Short.valueOf(nomor);
        System.out.println(shortNomor);
        
        // konversi string ke double
        Double doubleNomor = Double.valueOf(nomor);
        System.out.println(doubleNomor);
        
        // konvesi object integer ke int
        int parsInt = intNomor + 10;
        System.out.println("Non primitif dari objek Integer yg value"
                + " dari string " + parsInt);
        
        
        // konversi primitf integer ke string
        String valueString = String.valueOf(parsInt);
        
        String a = "132";
        
        
        
        
        
    }
}
