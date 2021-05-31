/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuilder;

/**
 *
 * @author Feri Winarta
 */
public class BuilderApp {
    public static void main(String[] args) {
        // String builder berguna untuk manipulasi string dengan jumlah
        // yang besar dan banyak
        
        StringBuilder builder = new StringBuilder();
        builder.append("Feri");
        builder.append(" ");
        builder.append("winarta");
        builder.insert(5, "halo ");
        System.out.println(builder.toString());
        
    }
}
