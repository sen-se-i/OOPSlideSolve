public class ProdFilter {
    static void filterProducts(String category) {
        System.out.println("Searching by category: " + category);
    }

    static void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Searching by price range: $" + minPrice + " - $" + maxPrice);
    }

    static void filterProducts(String category, String brand) {
        System.out.println("Searching by category: " + category + " and brand: " + brand);
    }

    static void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Searching by category: " + category + ", price range: $" + minPrice + " - $" + maxPrice);
    }

    static void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Searching by category: " + category + ", price range: $" + minPrice + " - $" + maxPrice + ", brand: " + brand);
    }

    public static void main(String[] args) {
        filterProducts("electronics");
        filterProducts(100, 500);
        filterProducts("fashion", "Nike");
        filterProducts("electronics", 100, 500);
        filterProducts("electronics", 100, 500, "Apple");
    }
}
