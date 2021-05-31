/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringTokenizer;

import java.util.StringTokenizer;


public class TokenApp {
    public static void main(String[] args) {
        String nama = "Feri,Winarta,keren,dan,ganteng";
        StringTokenizer str = new StringTokenizer(nama, ",");

        // str token dengan looping
        byte b = 1;
        while(str.hasMoreTokens()) {
            System.out.println("data ke " + b + " " + str.nextToken());
            b++;
        } 
        
//    String token = str.nextToken();
//    System.out.println(token);
//    token = str.nextToken();
//    System.out.println(token);
        
        
    }
}
