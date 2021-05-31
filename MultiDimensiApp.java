package MultiDimensi;

import java.util.Arrays;


public class MultiDimensiApp {
    public static void main(String[] args) {
//        Object[] dataObjects = new Object[5];
//        dataObjects[0] = "apapun";
//        dataObjects[1] = 1;
//        dataObjects[2] = 'c';
//        dataObjects[3] = 123.f;
//        dataObjects[4] = true;
//        System.out.println(Arrays.toString(dataObjects));

        int[][] Array2D = new int[5][2];
        Array2D[0][2] = 10;

        System.out.println(Arrays.deepToString(Array2D));

    }
}
