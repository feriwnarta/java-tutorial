package application;

interface CanSayHello{
    void sayHelo(String name);
}

abstract class Parent {

}

class Child extends  Parent {

}

class Cucu extends Parent implements CanSayHello{
    @Override
    public void sayHelo(String name) {
        System.out.println("Hello " + name);
    }
}

public class ConstratintMultiple {
    public static void main(String[] args) {
        // Data<Child> childData = new Data<>(new Child()); Ini Masih Oke oke saja jika parameter type Data adalah extends paren

        // Data<Child> childData = new Data<>(new Child()); ini sekarang akan eror karena paremter type
        // data ada dua yaitu extends dari parent dan juga mengimplemetn interface CanSayHello
        Data<Cucu> cucuData = new Data<>(new Cucu());



    }
}

class Data<T extends Parent & CanSayHello> {
    private T data;

    public Data(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
