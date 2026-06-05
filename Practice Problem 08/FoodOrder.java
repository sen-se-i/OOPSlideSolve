public class FoodOrder {
    static class Restaurant {
        String name;

        Restaurant(String name) {
            this.name = name;
        }

        double calculateTotalBill(double foodPrice) {
            double tax = foodPrice * 0.10;
            return foodPrice + tax;
        }

        int estimateDeliveryTime() {
            return 40;
        }

        void displayOrderInfo(double foodPrice) {
            System.out.println("Restaurant: " + name);
            System.out.println("Total Bill: $" + calculateTotalBill(foodPrice));
            System.out.println("Estimated Delivery Time: " + estimateDeliveryTime() + " mins");
        }
    }

    static class FastFoodRestaurant extends Restaurant {
        FastFoodRestaurant(String name) {
            super(name);
        }

        @Override
        double calculateTotalBill(double foodPrice) {
            double tax = foodPrice * 0.15;
            return foodPrice + tax;
        }

        @Override
        int estimateDeliveryTime() {
            return 20;
        }
    }

    static class FineDiningRestaurant extends Restaurant {
        FineDiningRestaurant(String name) {
            super(name);
        }

        @Override
        int estimateDeliveryTime() {
            return 60;
        }
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Local Eatery");
        FastFoodRestaurant fastFood = new FastFoodRestaurant("Burger Palace");
        FineDiningRestaurant fineDining = new FineDiningRestaurant("Le Gourmet");

        restaurant.displayOrderInfo(100);
        System.out.println();
        fastFood.displayOrderInfo(100);
        System.out.println();
        fineDining.displayOrderInfo(100);
    }
}
