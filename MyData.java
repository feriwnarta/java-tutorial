package data;

// generic didalam class
// Generic diawali <> dan dalamnya diisi data
// E element, biasa digunakan dalam collection
// T Type

// dapat diibaratkan bahwa generic berguna untuk membuat tipedata sendiri yang dapat menampung
// nilai yang berbeda
// int varibale, berati Genericnya ( T variabel )
// kalo objek, Object data -> dapat menampung semua nilai turunannya
// <T> sama seperti Tipe data / pengganti tipe data

public class MyData <T>{
    private T data;

   public MyData(T data){
       this.data = data;
   }

   public void setData(T data) {
       this.data = data;
   }

   public T getData() {
       return this.data;
   }

}
