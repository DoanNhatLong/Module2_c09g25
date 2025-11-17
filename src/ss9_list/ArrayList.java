package ss9_list;

import java.sql.Array;

public class ArrayList {
    public static int size(String[] array) {
        int count = 0;
        for (String s : array) {
            if (s != null) {
                count++;
            }
        }
        return count;
    }

    public static void add(String[] arr, String add) {
        boolean full = false;
        for (String s : arr) {
            if (s == null) {
                s = add;
                full = true;
            }
        }
        if (full) {
            String[] newArray = new String[arr.length + 10];
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
            }
            newArray[arr.length] = add;
        }
    }

    public static void remove(String[] arr, int index) {
        arr[index] = null;
        for (int i = index; i < arr.length; i++) {
            arr[index] = arr[index + 1];
        }
        arr[arr.length - 1] = null;
    }
}
