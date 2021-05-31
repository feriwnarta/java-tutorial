package application;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class MengData<T> {
    private T data;

    public void add(T data) {
        this.data = data;
    }

    public void delete(T delete){
        this.data = delete;
    }

    public void show()
    {
        System.out.println(data);
    }
}

public class CobaUlang {
    public static void main(String[] args) {
        MengData<Integer> m = new MengData<>();
        m.add(100);
        m.show();
        m.delete(0);
        m.show();

        Map<String, Integer> map = new HashMap<>();
        map.put("feri", 19);




    }
}
