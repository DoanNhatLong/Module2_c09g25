package ss13_search;

public class Bai1 {
    public static void main(String[] args) {
        String test="Welcome";
        for (int i = 0; i < test.length()-1; i++) {
            if(test.charAt(i)<test.charAt(i+1)){
                System.out.print(test.charAt(i+1));
            }

        }

    }
}
