package application;

import data.MyData;

public class Contravariant {
    public static void main(String[] args) {
        // contravariant akan menerima apapun jika yg diset atau dikirim adalah parent dari child, berupa type<Child>
        // apapun itu jika dia adalah parent dari type <? super Child>, / <? super String>
        // Contravariant akan bermasalah jika method get (parent) di casting manual dengan tipe yg kita ingin kan (child)
        // casting bermasalah akan berada didalam method yang fix
        // penyebabnya adalah jika parameter type menerima apapun itu jika parent dari child dan didalam method dicasting menjadi
        // tipe data fix, akan menjadi masalah jika argumen yg dikirim <parent> tidak bisa dicasting menjadi tipe lai
        // seperti tipe integer di casting menjadi string
        // paramater type tidak akan mempengaruhi isi parameter didalam class my data
        // kesimpulan ulang, contravriant akan menerima apapun itu jika dia yg dikirim adalah parent sebuah child
        // parent akan masuk ke dalam parameter method, atau parent akan dicasting menjadi tipe data child

        // contravariant hanya bisa set data, dengan tipe yang sama sesuai childnya <? super child>, bukan objek yg dikrim
        // contravariant dapat getData, akan berbahay jika didalam method tersebut terjadi casting manual
        // karena jika tipedatanya tidak dapat di casting akan menyebabkan eror, contoh integer di jadika string


        // tipe genericnya parent
        MyData<Object> objectMyData = new MyData<>(10);
        // MyData<String> stringMyData = objectMyData; akan eror karena invariant

        // konversi dari parent ke child (parent -> child)
        MyData<? super String> myData = objectMyData;
        System.out.println(myData.getData());

//        MyData<String> dataString = new MyData<>("string");
//        methodCovariant(dataString);
//        methodContravariant(objectMyData);



        // saat ? super double, yg akan dikirim adalah parent dari double berupa objek
        // akan tetapi pada data double diubah, harus bertipe double bukan objek
        MyData<Object> doubleMyData = new MyData<>("Sebuah String");
        MyData<? super Double> myData1 = new MyData<Object>("ini objek");
        System.out.println(myData1.getData());
        // myData1.setData("12.7d");
        myData1.setData(125.d);

        // akan oke karena parameternya string, dan di casting manual didalam method menjadi string
        MyData<Object> dataString = new MyData<>("string");
        methodContravariant(dataString);

        // masalah, karena integer tidak dapat dijadikan string
        // MyData<Object> dataObj = new MyData<>(1000);
        // methodContravariant(dataObj);
    }

    public static void methodCovariant(MyData<? extends Object> apapun) {
        // something
        // child - > parent
        System.out.println(apapun.getData());
    }

    public static void methodContravariant(MyData<? super String> apapun) {
//       apapun.setData("woy");
        // parent -> child
       System.out.println(apapun.getData());
       String wouy = (String) apapun.getData();

    }
}
