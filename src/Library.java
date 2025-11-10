import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.function.Function;


    public class Library {
        public static void printArray(Object[] arr) {
            System.out.println(Arrays.toString(arr));
        }

        @SuppressWarnings("all")
        public static boolean checkDate1(String dateStr) {
            String[] parts = dateStr.split("/");
            if (parts.length != 3) return false;
            try {
                int day = Integer.parseInt(parts[0].trim());
                int month = Integer.parseInt(parts[1].trim());
                int year = Integer.parseInt(parts[2].trim());

                Date date = new Date(year - 1900, month - 1, day);

                return (date.getDate() == day && date.getMonth() == month - 1
                        && date.getYear() == year - 1900);
            } catch (NumberFormatException e) {
                return false;
            }
        }

        public static Date inputDate(String str) {
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);

            Date date = null;

            while (date == null) {
                String input = sc.nextLine().trim();

                try {
                    date = sdf.parse(input);
                } catch (ParseException e) {
                    System.out.println("Ngày không hợp lệ, vui lòng nhập lại!");
                }
            }

            return date;
        }

        public static Date checkDate(String dateStr) {
            SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
            sdf.setLenient(false);
            try {
                return sdf.parse(dateStr.trim());
            } catch (ParseException e) {
                throw new IllegalArgumentException("Ngày không hợp lệ: " + dateStr);
            }
        }

        public static <T> T findByField(ArrayList<T> list, String value, Function<T, String> get) {
            for (T obj : list) {
                if (get.apply(obj).equals(value)) {
                    return obj;
                }
            }
            System.out.println("Không tìm thấy");
            return null;
        }

        public static <T> boolean checkByField(ArrayList<T> list, String value, Function<T, String> getField) {
            for (T obj : list) {
                if (getField.apply(obj).equals(value)) {
                    return true;
                }
            }
            return false;
        }
    }

