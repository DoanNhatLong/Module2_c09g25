package ss12_map;

import ss12_map.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeProductListToBinaryFile(String filePath, List<Product> productList){
        File file = new File(filePath);
        try(FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ){
            objectOutputStream.writeObject(productList);

        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Product> readBinaryFile(String filePath){
        List<Product> productList = new ArrayList<>();
        File file = new File(filePath);
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            productList = (List<Product>) objectInputStream.readObject();
        } catch (IOException e) {
            System.out.println("danh sách đang trống");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }
}
