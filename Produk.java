package data;

public class Produk {
    private String nama;
    private int harga;

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String toString(){
        return "Nama Produk : " + nama + " harganya : " + harga;
    }

    @Override
    public boolean equals(Object o) {
        // pengecekan objek
        if (this == o) return true; // membandingkan memori kedua objek
        if (o == null || getClass() != o.getClass()) return false; // pengecekan object apakah null atau getclass produk
        // dan getclass object tidak sama
        // false | kelasnya sama true, akan true
        // objek null true | truenkelas nya tidak sama akan masuk method dan akan return false
        // objek null true | kelasnya sama, true | false, tetap akan return false, karena objek o bernilai null
        // get clas representasi dari clas, package dan nama clas package.class5

        Produk produk = (Produk) o; // konversi object menjadi produk

        // pengecekan field / atribut
        if (harga != produk.harga) return false; // pengecekan harga, apakah harga produk, dengan kelas produk ke 2
                                                 // tidak sama, kalo tidak sama return false
        return nama != null ? nama.equals(produk.nama) : produk.nama == null; // pengecekan jika nama kaga null
        // lalu pemabandingan produk nama dengan produk2 nama apakah sama atau tidak

        // kalo nama kaga null ( ada isinya ) , pengcekan equals, jika ternyata null (tidak ada isinya)
        // pengecekan produk2.nama apakah memorinya null, kalo null return true, kalo tidak null return false
        // produk(parameter).nama == null ?, kalo null berarti true, kalo tidak null berarti false

    }

//    public boolean equalsCoba(Object o) {
//        if(this == o) return true; // pengcekan alamat memori
//        if(o == null || getClass() != o.getClass()) return false;
//
//        Produk produk = (Produk) o;
//
//        if(harga != produk.getHarga()) return false;
//        return (nama != null) ? nama.equals(produk.nama) : produk.nama == null;
//    }

    @Override
    public int hashCode() {
        // int result = nama != null ? nama.hashCode() : 0;
        // result = 31 * result + harga;
        return 1;
    }
}
