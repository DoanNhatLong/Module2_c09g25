package ss14_sort;

import java.util.Arrays;

public class Bai2 {
    static int [] array={3,4,8,1,9,1,2};

    public static void main(String[] args) {
        insertSort(array);
    }

    public static void insertSort(int [] list){
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i - 1;
            while (j >= 0)
                if (list[j] > temp) {
                    list[j + 1] = list[j];
                    j--;
                } else break;
            list[j + 1] = temp;
        }
        System.out.println(Arrays.toString(list));

    }
}
