import java.util.Arrays;

public class Odev2 {

    public static void main(String[] args) {
        int[] dizi = new int[]{1, 2, 3, 4, 5, 6, 5, 5, 3, 3, 2, 1, 4, 7, 8};


        int[] yeniDizi = new int[dizi.length - findDublicateCount(dizi)]; // kac tane aynı sar var ise
        int count = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (isExist(yeniDizi, dizi[i])) {
                yeniDizi[count] = dizi[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(yeniDizi));
    }

    private static Boolean isExist(int[] dizi, int deger) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == deger) {
                return false;
            }
        }
        return true;
    }

    private static int findDublicateCount(int[] dizi) {
        int count = 0;

        for (int i = 0; i < dizi.length; i++) {
            for (int k = i + 1; k < dizi.length; k++) {
                if (dizi[i] == dizi[k]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
