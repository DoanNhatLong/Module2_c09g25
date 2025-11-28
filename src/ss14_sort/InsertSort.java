package ss14_sort;

import java.util.Arrays;

public class InsertSort {
    static int[] list = {4, 1, 5, 9, 3, 5};

    public static void main(String[] args) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i - 1;
            while (j >= 0)
                if (list[j] > temp) {
                    list[j + 1] = list[j];
                    j--;
                } else break;
            list[j + 1] = temp;
            System.out.println("Sau lần lặp" + i + Arrays.toString(list));
        }
    }
}
