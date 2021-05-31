package DateDanKalender;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Feri Winarta
 */
public class DateKalender {
    public static void main(String[] args) {
        // untuk mendapatkan tanggal dengan mili detik / computer date
        Long waktuSekarang = System.currentTimeMillis();
        System.out.println("Waktu Berdasarkan waktu-komputer : "
                + " dari 1 januari 1970 sampai wktu sekarang\ndengan mili detol"
                + ": " + waktuSekarang);
        
        
        Date date = new Date();
        //  int tahun = date.getYear();
        // kebanyakan method date sudah di deprecated
        // jadi sudah tidak berguna maksimal
        
        //date = new Date(waktuSekarang);
        // System.out.println(date.getTime());
        
        // kelas date hanya digunakana untuk menyimpan hasil waktu saja
        // perhitung-perhintungan penggunakan tanggal hanya digunakan di
        // kelas Calendar
        
        Calendar c = Calendar.getInstance();
        // secara default menggunakan tanggal masehi ( gregorian calendar )
//        c.set(2002, Calendar.MAY, 26, 23, 56);
//        Date d = c.getTime();
//        System.out.println(d);
        
        int tahun = c.get(Calendar.YEAR);
        int hari = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(tahun);
        System.out.println(hari);
        
        
    }
}
