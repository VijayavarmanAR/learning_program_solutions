import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Footwear"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "T-shirt", "Clothing"),
            new Product(105, "Mobile", "Electronics")
        };

        System.out.println("Linear Search Result:");
        Product result1 = SearchUtils.linearSearch(products, "Watch");
        System.out.println(result1 != null ? result1 : "Product not found");
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\nBinary Search Result:");
        Product result2 = SearchUtils.binarySearch(products, "Watch");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
