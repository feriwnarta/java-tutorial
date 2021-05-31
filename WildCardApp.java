package application;

import data.MyData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WildCardApp {
    public static void main(String[] args) {
        // MyData<String> stringMyData = new MyData<>("hay");
        // show(stringMyData); ERROR - > invariant

        // ============= Covariant =================
        System.out.println("Covariant");
        MyData<String> stringMyData = new MyData<>("hay");
        show(stringMyData);
        MyData<Integer> integerMyData = new MyData<>(1000);
        show(integerMyData);
        System.out.println("\n");
        MyData<Child> childMyData = new MyData<>(new Child());
        show(childMyData);

        // ============ WildCard ===================
        System.out.println("WildCard");
        wildCard(stringMyData);
        wildCard(integerMyData);
        wildCard(childMyData);

        List<String> strings = new ArrayList<>();
//        strings.add("hallo");
//        strings.add("semuanya");
//        strings.add("wkwkwk");
//        Iterator i = strings.iterator();
//        while(i.hasNext()) {
//            String data = (String) i.next();
//            System.out.println(data);
//        }


    }

    public static void wildCard(MyData<?> apapun) {
        // disarankan hanya read saja, jangan write apalagi di konversi
        System.out.println(apapun.getData());
    }

    public static void show(MyData<? extends Object> apapun){
        System.out.println(apapun.getData());
    }
}
