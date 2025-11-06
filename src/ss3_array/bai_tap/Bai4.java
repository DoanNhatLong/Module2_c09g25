package ss3_array.bai_tap;

public class Bai4 {

    public static void main(String[] args) {
        int[] array = {3, 5, 6, 1, 7, 8, 9};
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }
}


//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < array[i - 1]) {
//                min = array[i];
//            }
//        }

//

//        int min= Arrays.stream(array).min().getAsInt();
