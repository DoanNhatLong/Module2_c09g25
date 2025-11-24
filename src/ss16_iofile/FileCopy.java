package ss16_iofile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

        FileReader temp1 = null;
        FileWriter temp2 = null;
        int charCount = 0;

        try {
            temp1 = new FileReader(sourceFile);
            temp2 = new FileWriter(targetFile);
            int number;
            while ((number = temp1.read()) != -1) {
                temp2.write(number);
                charCount++;
            }

            System.out.println("Sao chép thành công! Số ký tự trong tệp: " + charCount);

        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        } finally {
            try {
                if (temp1 != null) temp1.close();
                if (temp2 != null) temp2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

