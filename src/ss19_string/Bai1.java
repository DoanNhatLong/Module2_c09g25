package ss19_string;

import java.util.regex.Pattern;

import static ss12_map.ProductManagement.sc;

public class Bai1 {
    public static void main(String[] args) {
        String test="08-(012345678)";
        boolean temp= Pattern.matches("^\\(\\d{2}\\)-\\(0\\d{8}\\)$",test);
        System.out.println(temp);
    }
}
