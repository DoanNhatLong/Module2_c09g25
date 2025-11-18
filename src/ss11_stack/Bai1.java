package ss11_stack;

import java.util.Arrays;
import java.util.Stack;

public class Bai1 {
    static Stack<String> test = new Stack<>();
    static String str = "Dai Hoc Back Khoa";

    public static void main(String[] args) {

        String[] arr = str.split("\\s+");
        for (String s : arr) {
            test.push(s);
        }
        int temp = test.size();
        String[] result = new String[temp];
        while (!test.isEmpty()) {
            for (int i = 0; i < temp; i++) {
                result[i] = test.pop();
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
