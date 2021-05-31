package Base64;

import java.util.Base64;

public class BaseApp {
    public static void main(String[] args) {

        // meubah data menjadi base 64, byte
        String query = "Feri Winarta";
        String encoded = Base64.getEncoder().encodeToString(query.getBytes());
        System.out.println(encoded);

        // mengembalikan data asli
        byte[] result = Base64.getDecoder().decode(encoded);
        String decoded = new String(result);
        System.out.println(decoded);
    }
}
