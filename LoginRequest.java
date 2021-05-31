package recordclass;

// record class digunakan untuk penggunaan kelas yang hanya menyimpan data saja
// secara default record class akan mengextens java.lang.record
// dan method yg secara otomatis disediakan, getter, konstuktor, equals, hascode, toString
// record class bersifat immutable
// tidak bisa menggunakan method setter, atau membutnya sendiri juga
// record class tidak bisa mempunyai instance variabel
// setiap paramater yang ada dikonstruk secara otomatis akan dibuat sebagai variabel

public record LoginRequest(String username, String password) {


}
