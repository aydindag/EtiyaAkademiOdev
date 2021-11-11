package Odev2;

import java.util.Arrays;

public class MyList {

    String[] arr = new String[0];

    public MyList() {
    }

    public void add(String value) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
    }

    public Boolean contains(String value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void remove(String value) {
        boolean varMı = false;
        if (arr.length > 0) {
            String[] tmp = new String[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    int k = 0;
                    for (int j = 0; j < arr.length; j++) {
                        if (i == j) {
                            continue;
                        }
                        tmp[k] = arr[j];
                        k++;
                    }
                    varMı = true;
                    break;
                }
            }
            if (!varMı) {
                System.out.printf("Silmek İstediğiniz eleman listede yok.");
            }
            arr = tmp;
        } else {
            System.out.printf("Listede eleman yok ");
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Dizinin boyutundan fazla değer girdiniz ");
            return;
        }

        String[] temp = new String[arr.length - 1];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            temp[k] = arr[i];
            k++;
        }
        arr = temp;
    }


    public void list() {
        for (String string : arr) {
            System.out.println(string);
        }
    }
}
