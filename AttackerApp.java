package InnerClassApp;

public class AttackerApp {
    private String nama;
    private int damage;

    public AttackerApp(String nama){
        this.nama = nama;
        damage = 2;
    }

    public void attack(){
        System.out.println(nama + " menyerang dengan demeg tanpa senjata " + damage);
    }
    // inerr class weapon dari attacker app
    public class Weapon {
        private String namaPedang;
        private int damageWeapon;

        public Weapon(String namaPedang) {
            this.namaPedang = namaPedang;
        }

        public void equipWeapon(){
            if(namaPedang.equalsIgnoreCase("butterfly")) {
                damageWeapon = 7;
            } else if(namaPedang.equalsIgnoreCase("anchient sword")){
                damageWeapon = 10;
            } else if(namaPedang.equalsIgnoreCase("saturnus sowrd")) {
                damageWeapon = 15;
            } else {
                damageWeapon = 3;
            }
        }

        public void infoPlayer(){
            System.out.println("Nama : " + nama);
            System.out.println("Senjata : " + namaPedang);
            System.out.println("Total damage : " + (damage + damageWeapon));
        }
        // inner class dari outer weapon
        public class Armor {
            private float armor;

            public Armor(){
                armor = 1;
            }

            public void haveArmor(){
                if(damageWeapon == 7) {
                    armor = 3;
                } else if(damageWeapon == 10) {
                    armor = 2;
                } else if(damageWeapon == 15) {
                    armor = 0;
                } else {
                    armor = 4;
                }
            }

            public void infoPlayer(){
                System.out.println("Nama : " + nama);
                System.out.println("Senjata : " + namaPedang);
                System.out.println("Total damage : " + (damage + damageWeapon));
                System.out.println("armor : " + armor);
            }

        }
    }
}
