/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateDanKalender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Feri Winarta
 */
public class DateFormat {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(now));
        String tanggal = "21/12/1990 08:09:10";
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(tanggal);
            System.out.println(new SimpleDateFormat("dd MMMM yyyy").format(date));
        } catch(ParseException ex) {
            ex.printStackTrace();
        } 
    }
}
