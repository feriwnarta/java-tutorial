package Polymorfisme;

class Car {
    private String brand;
    private int speed;     // cc
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void display() {

    }

}

class Avanza extends Car {

    public void display() {
        System.out.println("Name this car " + getBrand() + " Model " + getModel() + " Speed Car is : " + getSpeed() + " CC");
    }

}

class Bmw extends Car{
    public void display() {
        System.out.println("Name this car " + getBrand() + " Model " + getModel() + " Speed Car is : " + getSpeed() + " CC");
    }
}

public class PolyApp {
    public static void main(String[] args) {

        // polimorfisme

        Car isCar = new Avanza();
        isCar.setBrand("Toyota");
        isCar.setModel("Avanza 1.3");
        isCar.setSpeed(1300);
        isCar.display();

        isCar = new Bmw();
        isCar.setBrand("Bmw");
        isCar.setModel("Luxury 1.3");
        isCar.setSpeed(1500);
        isCar.display();

        // tanpa polimorfisme kode lebih panjang dan banyak objek
//        Avanza avanza = new Avanza();
//        avanza.setBrand("Toyota");
//        avanza.setModel("Avanza 1.3");
//        avanza.setSpeed(1300);
//        avanza.display();
//
//        Bmw bmw = new Bmw();
//        bmw.setBrand("Bmw");
//        bmw.setModel("luxury 1.3");
//        bmw.setSpeed(1500);
//        bmw.display();


    tampilLengkap(new Bmw());
    tampilLengkap(new Avanza());


    }

    static void tampilLengkap(Car car) {
        car.display();
    }
}


