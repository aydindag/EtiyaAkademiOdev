package Odev1;

import java.util.Arrays;

public class Odev3 {

    public static void main(String[] args) {
        int[] dizi = new int[]{1, 6, 37, 33, 65, 23, 45, 67};
        int temp;
        System.out.println(Arrays.toString(dizi));

        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] > dizi[i]) {
                    temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
        System.out.println("Büyükten küçüğe " + Arrays.toString(dizi));
    }
}
