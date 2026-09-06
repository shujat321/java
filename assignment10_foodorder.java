abstract class FoodOrder {
    abstract void calculateBill();
}

class RestaurantOrder extends FoodOrder {
    void calculateBill() {
        double foodBill = 850;
        double serviceCharge = 50;
        double total = foodBill + serviceCharge;

        System.out.println("Restaurant Order Bill: " + total);
    }
}

class DeliveryOrder extends FoodOrder {
    void calculateBill() {
        double foodBill = 450;
        double deliveryCharge = 40;
        double total = foodBill + deliveryCharge;

        System.out.println("Delivery Order Bill: " + total);
    }
}

public class assignment10_foodorder {
    public static void main(String[] args) {
        RestaurantOrder restaurant = new RestaurantOrder();
        DeliveryOrder delivery = new DeliveryOrder();

        restaurant.calculateBill();
        delivery.calculateBill();
    }
}
