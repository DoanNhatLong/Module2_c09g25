package ss17_binaryfile;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tệp nguồn: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Nhập tệp đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.out.println("Tệp không tồn tại");
            return;
        }

        if (targetFile.exists()) {
            System.out.println("Tệp đã tồn tại!");
            return;
        }

        int byteCount = 0;

        try (FileInputStream temp1 = new FileInputStream(sourceFile);
             FileOutputStream temp2 = new FileOutputStream(targetFile)) {

            int b;
            while ((b = temp1.read()) != -1) {
                temp2.write(b);
                byteCount++;
            }

            System.out.println("Số byte trong tệp: " + byteCount);

        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
}}
