package InnerClassApp;

public class MobaApp {
    public static void main(String[] args) {
         AttackerApp player1 = new AttackerApp("dieorlife");
         player1.attack();

         AttackerApp.Weapon haveWeapon = player1.new Weapon("Anchient sword");
         haveWeapon.equipWeapon();
         haveWeapon.infoPlayer();
         AttackerApp.Weapon.Armor haveArmor = haveWeapon.new Armor();
         haveArmor.haveArmor();
         System.out.println("\n");
         haveArmor.infoPlayer();

    }
}
