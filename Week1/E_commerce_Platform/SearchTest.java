package Week1.E_commerce_Platform;

public class SearchTest {
     public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shampoo", "Personal Care"),
            new Product(103, "Chair", "Furniture"),
            new Product(104, "Notebook", "Stationery"),
            new Product(105, "Phone", "Electronics")
        };

        String searchItem1 = "Chair";
        String searchItem2 = "Notebook";
        String searchItem3 = "Tablet";

        
        System.out.println("Linear Search: Searching for '" + searchItem1 + "'");
        long startLinear = System.nanoTime();
        Product result1 = SearchService.linearSearch(products, searchItem1);
        long endLinear = System.nanoTime();
        System.out.println(result1 != null ? result1 : "Product not found.");
        System.out.println("Time taken: " + (endLinear - startLinear) + " nanoseconds");
        System.out.println("Time Complexity: O(n)\n");

        
        System.out.println("Binary Search: Searching for '" + searchItem2 + "'");
        long startBinary = System.nanoTime();
        Product result2 = SearchService.binarySearch(products, searchItem2);
        long endBinary = System.nanoTime();
        System.out.println(result2 != null ? result2 : "Product not found.");
        System.out.println("Time taken: " + (endBinary - startBinary) + " nanoseconds");
        System.out.println("Time Complexity: O(log n)\n");

        
        System.out.println("Binary Search: Searching for '" + searchItem3 + "'");
        long startBinary2 = System.nanoTime();
        Product result3 = SearchService.binarySearch(products, searchItem3);
        long endBinary2 = System.nanoTime();
        System.out.println(result3 != null ? result3 : "Product not found.");
        System.out.println("Time taken: " + (endBinary2 - startBinary2) + " nanoseconds");
        System.out.println("Time Complexity: O(log n)\n");
    }
}
