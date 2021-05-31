package konsepobject;

public class PertukaranNilai {
    private Object dataSatu;
    private Object dataDua;

    public Object getDataSatu() {
        return dataSatu;
    }

    public void setDataSatu(Object dataSatu) {
        this.dataSatu = dataSatu;
    }

    public Object getDataDua() {
        return dataDua;
    }

    public void setDataDua(Object dataDua) {
        this.dataDua = dataDua;
    }

    public void swapData(){
        Object temp;
        temp = dataSatu;
        dataSatu = dataDua;
        dataDua = temp;
    }
}
