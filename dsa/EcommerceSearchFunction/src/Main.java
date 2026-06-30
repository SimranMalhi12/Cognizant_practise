import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories")
        };

        Product p1 = SearchOperations.linearSearch(products, "Shoes");

        if (p1 != null)
            System.out.println("Linear Search Found : " + p1.productName);

        Arrays.sort(products, Comparator.comparing(product -> product.productName));

        Product p2 = SearchOperations.binarySearch(products, "Watch");

        if (p2 != null)
            System.out.println("Binary Search Found : " + p2.productName);
    }
}