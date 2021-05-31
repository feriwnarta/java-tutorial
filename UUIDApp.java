package UUID;

import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {

        // menghasilkan random angka unik

        UUID uid = UUID.randomUUID();
        for(int i = 1; i <= 10; i++) {
            System.out.println(uid);
            uid = UUID.randomUUID();
        }
    }
}
