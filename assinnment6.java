class Order {
    String product;
    String buyer;
    int amount;

    Order(String product, String buyer, int amount) {
        this.product = product;
        this.buyer = buyer;
        this.amount = amount;
    }

    class OrderInfo {
        void showDetails() {
            System.out.println("Product: " + product);
            System.out.println("Customer: " + buyer);
            System.out.println("Total Bill: " + amount);
        }
    }
}

class DeliveryStatus {
    void updateStatus() {
    }
}

public class assignment6_delivery {
    public static void main(String[] args) {

        Order order = new Order("Burger", "Rahul", 250);

        Order.OrderInfo info = order.new OrderInfo();
        info.showDetails();

        DeliveryStatus delivery = new DeliveryStatus() {
            void updateStatus() {
                System.out.println("Order has been dispatched for delivery.");
            }
        };

        delivery.updateStatus();
    }
}
