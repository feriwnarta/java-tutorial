package application;

import data.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        // defaultnya generic itu invariant, tidak bisa polymorphism, atau tipenya berubah
        // contoh generic invariant

        MyData<Integer> dataInteger = new MyData<>(1000);
        MyData<Double> dataDouble = new MyData<>(1000d);
        MyData<Object> dataObj = new MyData<>("object");

        // dataInteger = dataDouble;  -> Error
        // tidak bisa karena generic invariant

        // dari parent object ke child tidak bisa / polimorfisme tidak berlaku
        // MyData<Object> dataObject = dataInteger;

        // begitupun sebaliknya
        // MyData<Object> dataObj = new MyData<>(1000);
        // dataInteger = dataObj;

        // ------------ begitupun di method ----------------
        // Child -> Parent
        // apapun(dataInteger); -> Error
        // parent -> child
        // methodObj(dataObj); -> Error
        // Kesimpulan, generic invariant, (Tetap) jika data object maka harus objek
        // jika data string maka harus string, jika data intger maka harus integer, dan seterusnya


        // -------------------Analogi -----------------------
        // Integer apapun = 10000; -> tidak error
        // apapun2(apapun); karena integer adalah child dari object anak kurus pakai baju anak gemuk
        methodObj(dataInteger);
    }

    static void apapun(MyData<Object> obj){
        // code
    }

    static void methodObj(MyData<Integer> dataInteger){
        // code
        System.out.println(dataInteger.getData());
    }

    static void apapun2(Object apapun) {
        // code
    }
}
