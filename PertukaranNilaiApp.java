package konsepobject;

public class PertukaranNilaiApp {
    public static void main(String[] args) {
        PertukaranNilai p = new PertukaranNilai();
        p.setDataSatu(10);
        p.setDataDua(20);
        System.out.println("Seblum data diubah " + p.getDataSatu());
        System.out.println("Seblum data diubah " + p.getDataDua());
        p.swapData();
        System.out.println("Sesudah data diubah " + p.getDataSatu());
        System.out.println("Sesudah data diubah " + p.getDataDua());





    }
}
