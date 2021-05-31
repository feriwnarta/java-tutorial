/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringJoiner;

import java.util.StringJoiner;

public class JoinerApp {
    public static void main(String[] args) {
        StringJoiner join = new StringJoiner("0","{","}" );
        String selamat = "Selamat datang dirumahkami";
        join.add(selamat);
        System.out.println(join);
               
    }
}
