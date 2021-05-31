package application;

import data.MultipleGeneric;
import data.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        // covariant child -> parent
        // MultipleGeneric<String, Integer> obj = new MultipleGeneric<>("udin", 10);
        // apapun(obj); -> Error / tidak boleh karena parameternya bertipe MyData, harus MyData yg dimasukin
        // yang dinamis itu Genericnya bukan Tipe Data objeknya / kelasnya
        // akan menerima apapun itu jika yg di set atau dikirim adalah child dari parentnnya <Type parent> / <? extends Parent>

        MyData<String> stringMyData = new MyData<>("data");
        MyData<Integer> integerMyData = new MyData<>(1000);
        MyData<Float> floatMyData = new MyData<>(100.2f);
        MyData<Double> doubleMyData = new MyData<>(1000.56d);

        // covariant, parent akan disi objek
        // CovariantApp ap = new Child();

        // contravarian child akan disi parent
        // Child ch = new Parent();


        // Error Karena Invariant
        // apapun2(stringMyData);
        // apapun2(integerMyData);
        // apapun2(floatMyData);
        // apapun2(doubleMyData);

        // Tidak eror karena covariant / Covariant method
        apapun(stringMyData);
        apapun(integerMyData);
        apapun(floatMyData);
        apapun(doubleMyData);
        // Covariant Tipe Data

        MyData<? extends Object> myData1 = stringMyData;
        MyData<? extends Object> myData2 = integerMyData;
        MyData<? extends Object> myData3 = floatMyData;
        MyData<? extends Object> myData4 = doubleMyData;

        System.out.println(myData1.getData());


    }

    // method ini akan dinamis, atau generic akan covariant, dapat menerima apapun dari objek my data
    // dengan generic yang berbeda asalkan child dari parent generic
    public static void apapun(MyData<? extends Object> apapun) {
        System.out.println(apapun.getData());
    }

    public static void apapun2(MyData<Object> apapun) {
        System.out.println(apapun.getData());
    }

}
