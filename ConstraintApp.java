package application;

class DataNumber<T extends Number> {
    private T data;

    public DataNumber(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class ConstraintApp {
    public static void main(String[] args) {
        // paremeter type dapat kita tentukan sendiri
        // secara default parameter type jika tidak eksplisit akan berbentuk Object

        DataNumber<Integer> integerDataNumber = new DataNumber<>(100);
        DataNumber<Float> floatDataNumber = new DataNumber<>(123f);

        System.out.println(integerDataNumber.getData());
        System.out.println(floatDataNumber.getData());

        // DataNumber<String> stringDataNumber = new DataNumber<String>("test"); ERROR
        // karena parameter DataNumber adalah extends Number dan kelas turunannya saja yg bisa masuk kedalam parameter type
        // Parameter type diatas adalah extends number dan yg kita kirim string akan error karena string bukan bagian dari
        // kelas number

    }
}

