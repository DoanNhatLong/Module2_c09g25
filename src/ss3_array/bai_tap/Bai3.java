package ss3_array.bai_tap;

import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 7};
        int[] array3 = new int[array1.length + array2.length];
//        for (int i = 0; i < array1.length; i++) {
//            array3[i] = array1[i];
//        }
//        for (int j = 0; j < array2.length; j++) {
//            array3[array1.length + j] = array2[j];
//        }
        System.arraycopy(array1,0,array3,0,array1.length);
        System.arraycopy(array2,0,array3,array1.length,array2.length);
        System.out.println(Arrays.toString(array3));
    }
}
