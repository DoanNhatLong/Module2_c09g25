package ss9_list;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final String[] array = {"a", "b", "c", "1", "2", null};
        final String[] array1 = {"a", "b", "c", "1"};
        System.out.println(ArrayList.size(array));
        ArrayList.remove(array1, 2);
        System.out.println(Arrays.toString(array1));
    }
}
