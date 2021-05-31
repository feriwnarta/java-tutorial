/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringImmutable;

/**
 *
 * @author Feri Winarta
 */
public class StringImut {
    public static void main(String[] args) {
        String str = "ini adalah sebuah String";
        System.out.println("String sebelum dirubah : " + str);
        addres("Sebelum substring",str);
        
        // merubah string sebenarnya membuat objek baru di string pool, 
        // dan variabel tersebut akan mereference ke objek baru,
        // lalu string sebelumnya akan terkena garbage collector
        
        str = str.substring(0, 10);
        System.out.println(str);
        
        addres("Sesudah substring",str);
        
        
    }
    
    static void addres(String desk, String value) {
        int addres = value.hashCode();
        System.out.println(desk + "" + Integer.toHexString(addres));
    }
}
