package ss12_map;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import static ss12_map.ProductManagement.sc;

public class Repository {
    final static String PRODUCT_FILE="ss12_map/product.dat";

    public List<Product> getAll(){
        List<Product> productLinkedList;
        productLinkedList= ReadAndWriteFile.readBinaryFile(PRODUCT_FILE);
        return productLinkedList;
    }

    public void display() {
        List<Product> productList=getAll();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void addProduct(Product temp) {
        List<Product> productList=getAll();
        productList.add(temp);
        ReadAndWriteFile.writeProductListToBinaryFile(PRODUCT_FILE,productList);
    }

    public Product findProduct(String name) {
        List<Product> productList=getAll();
        for (Product product : productList) {
            if (Objects.equals(product.getName(), name)) {
                return product;
            }
        }
        return null;
    }

    public void sortProduct() {
        List<Product> productList=getAll();
        productList.stream().sorted((a, b) -> (int) (a.getPrice() - b.getPrice()))
                .forEach(System.out::println);
    }

    public void deleteProduct(String id) {
        List<Product> productList=getAll();
        for (Product product : productList) {
            if (Objects.equals(product.getId(), id)) {
                productList.remove(product);
                break;
            }
        }
        ReadAndWriteFile.writeProductListToBinaryFile(PRODUCT_FILE,productList);
    }

    public void edit(String id) {
        List<Product> productList=getAll();
        for (Product product : productList) {
            if (Objects.equals(product.getId(), id)) {
                System.out.println("Nhập tên muôốn sửa ");
                product.setName(sc.nextLine());
            }
        }
        ReadAndWriteFile.writeProductListToBinaryFile(PRODUCT_FILE,productList);
    }




}
