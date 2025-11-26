package ss19_string;

import java.util.regex.Pattern;

import static ss12_map.ProductManagement.sc;

public class Bai2 {
    public static void main(String[] args) {
        String test="C0223K";
        boolean temp= Pattern.matches("^[CAP]\\d{4}[GHIK]$",test);
        System.out.println(temp);
    }
}
