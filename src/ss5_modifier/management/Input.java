package ss5_modifier.management;

import java.util.Scanner;

public class Input {
    public static Student inputInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập ID");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập name");
        String name=sc.nextLine();
        System.out.println("Nhập address");
        String address=sc.nextLine();
        Student student=new Student(id,name,address);
        return student;
    }

    public static int inputID(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập ID");
        int id=Integer.parseInt(sc.nextLine());
        return id;
    }

    public static void runMenu(){
        System.out.println("----------Menu--------");
        System.out.println("""
                1. Hiển thị danh sách
                2. Thêm sinh viên
                3. Xóa sinh viên
                4. Thoát chương trình
                Chọn phương án muốn thực hiện""");
    }
}
