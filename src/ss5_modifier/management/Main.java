package ss5_modifier.management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }

    public static boolean showMenu() {
        Management students = new Management();
        Scanner sc = new Scanner(System.in);
        final int DISPLAY = 1;
        final int ADD = 2;
        final int DELETE = 3;
        final int EXIT = 4;

        while (true) {
            Input.runMenu();
            int choice;
            System.out.println();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case DISPLAY -> students.displayStudent();
                case ADD -> students.addStudent(Input.inputInfo());
                case DELETE -> students.deleteStudent(Input.inputID());
                case EXIT -> {
                    return false;
                }
            }
        }

    }

}
