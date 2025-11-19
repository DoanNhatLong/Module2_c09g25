package ss12_map;

import ss10_vehicle.view.VehicleView;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductManagement {
    public static final Scanner sc = new Scanner(System.in);
    static final Repository run = new Repository();

    public static void showMenu() {
        final int ADD = 1;
        final int DISPLAY = 2;
        final int DELETE = 3;
        final int FIND = 4;
        final int SORT = 5;
        final int EDIT = 6;
        final int EXIT = 7;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("------Quanr lý sản phẩm---");
            System.out.println("Chọn chức năng");
            System.out.println("""
                    1. Thêm
                    2. Hiển thị
                    3. Xóa
                    4. Tìm kiếm
                    5. Xếp
                    6. Sửa
                    7. Thoát""");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case ADD -> {
                    System.out.println("Nhập thông tin");
                    Product temp = new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
                    run.addProduct(temp);
                }
                case DELETE -> {
                    System.out.println("Nhập id");
                    run.deleteProduct(sc.nextLine());
                }

                case FIND -> {
                    System.out.println("Nhập tên");
                    System.out.println(run.findProduct(sc.nextLine()));
                }

                case SORT -> {
                    run.sortProduct();
                }

                case DISPLAY -> {
                    run.display();
                }

                case EDIT ->{
                    System.out.println("Nhập ID");
                    run.edit(sc.nextLine());
                }
                case EXIT -> {
                    return;
                }
            }
        }

    }
}
