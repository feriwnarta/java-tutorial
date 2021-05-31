package application;

import data.MyData;

public class GenericApp {
    public static void main(String[] args) {
        // generic tipe integer, tipe generic akan dinamis mengikuti generic yang diberikan
        MyData<Integer> dataInteger = new MyData<>(1000);
        System.out.println("Data Generic Integer : " + dataInteger.getData());

        // Generic Tipe String
        MyData<String> dataString = new MyData<>("Ini generic string");
        System.out.println(dataString.getData());

        // generic tipe float
        MyData<Float> dataFloat = new MyData<>(100.5f);
        System.out.println("Ini adalah data float " + dataFloat.getData());



    }
}
