package ss11_stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class Bai3 {
    public static String str = "HO k OH";
    static ArrayDeque<Character> deque = new ArrayDeque<>();

    public static void main(String[] args) {
        boolean isTrue = true;
        for (char s : str.toCharArray()) {
            deque.offer(s);
        }
        while (deque.size()>1) {
            if (!deque.pollFirst().equals(deque.pollLast())){
                isTrue = false;
            }
        }
        System.out.println(isTrue ? "Là từ đối xứng" : "Không phải từ đói xứng ");
    }


}
