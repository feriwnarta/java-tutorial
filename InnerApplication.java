package InnerClassApp;

public class InnerApplication {
    public static void main(String[] args) {
        Motor beat = new Motor("Beat");
        System.out.println(beat.getName());
        Motor.Bensin bensin = beat.new Bensin();
        bensin.setLiter(7);
        System.out.println(bensin.getLiter());
        System.out.println(bensin.getNamaMotor());


    }
}
