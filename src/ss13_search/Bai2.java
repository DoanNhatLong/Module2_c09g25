package ss13_search;

public class Bai2 {
    public static void main(String[] args) {
        String test = "abcabcdgabxy";
        String temp = "" + test.charAt(0);
        String result = "";
        for (int i = 0; i < test.length() - 1; i++) {
            if (test.charAt(i) < test.charAt(i + 1)) {
                temp += test.charAt(i + 1);
            } else {
                if (temp.length() > result.length()) {
                    result = temp;
                }
                temp = "" + test.charAt(i + 1);
            }
        }
        if (temp.length() > result.length()) {
            result = temp;
        }
        System.out.println(result);
    }

}
