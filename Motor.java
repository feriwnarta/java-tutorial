package InnerClassApp;

public class Motor {
    private String name;

    public Motor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // inner class // mungkin bisa jadi hubungan has a
    public class Bensin {
        private int liter;

        public int getLiter() {
            return liter;
        }

        public void setLiter(int liter) {
            this.liter = liter;
        }

        public String getNamaMotor(){
            return name;
        }
    }
}
