package application;

import data.MyData;

public class TypeErasureAppp {
    public static void main(String[] args) {
        // type erasure / typenya hilang berbahaya
        // berbahaya
        MyData data = new MyData("String");
        MyData<Integer> asd = (MyData<Integer>) data;
        // Integer a = asd.getData(); ERROR

    }
}
