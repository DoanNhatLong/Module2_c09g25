package ss11_stack;

import java.util.Stack;

public class Bai2 {
    static Integer number = 19;

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        while (number != 0) {
            stack.push(number % 2);
            number /= 2;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
