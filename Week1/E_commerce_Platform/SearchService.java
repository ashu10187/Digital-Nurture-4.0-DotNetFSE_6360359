package Week1.E_commerce_Platform;

import java.util.Arrays;
import java.util.Comparator;

public class SearchService {
      public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null; 
    }

    
    public static Product binarySearch(Product[] products, String name) {
        
        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts, Comparator.comparing(p -> p.getProductName().toLowerCase()));

        int left = 0;
        int right = sortedProducts.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            String midName = sortedProducts[mid].getProductName().toLowerCase();
            int comparison = name.toLowerCase().compareTo(midName);

            if (comparison == 0) {
                return sortedProducts[mid]; 
            } else if (comparison < 0) {
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }

        return null;
    }
}
