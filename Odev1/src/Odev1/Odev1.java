package Odev1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println(" Kaç kolon oynamak istersiniz? ");
        int kacDefa = scn.nextInt();

        int count = 0 ;
        while(count<kacDefa) {
            int[] dizi = new int[6];
            for(int k = 0 ; k < 6 ; k++) {
                Random r=new Random();
                int uretilenSayi = r.nextInt(49);
                if(isExistsInArray(dizi,uretilenSayi)) {
                    dizi[k] = uretilenSayi;
                }
            }
            count++;
            System.out.println(Arrays.toString(dizi));
        }
    }

    private static Boolean isExistsInArray(int[] dizi, int deger) {
        for(int i = 0 ; i< dizi.length ; i++) {
            if(dizi[i] == deger) {
                return false;
            }
        }
        return true;
    }
}
