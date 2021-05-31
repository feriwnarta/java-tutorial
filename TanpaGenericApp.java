package application;

import data.TanpaGeneric;

public class TanpaGenericApp {
    public static void main(String[] args) {
        TanpaGeneric tnpa = new TanpaGeneric("data");

        // return value method get masih dalam bentuk objek
        // biasa diakali dengan membuat method get overloading dengan berbagai bentuk kembalian
        // atau bisa dengan casting tipe data secara manual

        // secara manual, tipe object dapat menerima apaoun akan tetapi saat mendapatkan nilai harus melalui casting
        // untuk penggunaaan lebih lanjut
        System.out.println(tnpa.getData());
        String kembalian = (String) tnpa.getData();



//        Object apapun = kembalian;
//        String data = "apapun";
        // Super -> Child;
//        Object obj = data;
//        // konversinya
//        // tipe data super -> sub
//        String apapun = (String )obj;

//        byte a = 10;
//        int b = a;
//        // kesimpulan casting yang kecil bisa dipindahin kelebih besar, baju yang kecil bisa pake baju yg besar
//        // besar tidak bisa dipake yg kecil, baju yg besar ga bisa make baju yg kecil
//        byte c = (byte) b;







    }
}
