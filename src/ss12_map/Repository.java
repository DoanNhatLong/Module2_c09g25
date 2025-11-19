package ss12_map;

import java.util.LinkedList;
import java.util.Objects;

import static ss12_map.ProductManagement.sc;

public class Repository {
    public static final LinkedList<Product> repo = new LinkedList<>();

    static {
        repo.add(new Product("1", "pen", 10000));
        repo.add(new Product("2", "book", 12000));
        repo.add(new Product("3", "pencil", 5000));
    }

    public void display() {
        for (Product product : repo) {
            System.out.println(product);
        }
    }

    public void addProduct(Product temp) {
        repo.add(temp);
    }

    public Product findProduct(String name) {
        for (Product product : repo) {
            if (Objects.equals(product.getName(), name)) {
                return product;
            }
        }
        return null;
    }

    public void sortProduct() {
        repo.stream().sorted((a, b) -> (int) (a.getPrice() - b.getPrice()))
                .forEach(System.out::println);
    }

    public void deleteProduct(String id) {
        for (Product product : repo) {
            if (Objects.equals(product.getId(), id)) {
                repo.remove(product);
                break;
            }
        }
    }

    public void edit(String id) {
        for (Product product : repo) {
            if (Objects.equals(product.getId(), id)) {
                System.out.println("Nhập tên muôốn sửa ");
                product.setName(sc.nextLine());
            }
        }
    }
}
