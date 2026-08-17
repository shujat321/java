interface ProductInfo {
    void display();
}

class Product {
    String productName;
    double cost;

    Product(String productName, double cost) {
        this.productName = productName;
        this.cost = cost;
    }
}

class Electronic extends Product implements ProductInfo {
    int warranty;

    Electronic(String productName, double cost, int warranty) {
        super(productName, cost);
        this.warranty = warranty;
    }

    public void display() {
        System.out.println("Electronic Product: " + productName);
        System.out.println("Cost: Rs " + cost);
        System.out.println("Warranty Period: " + warranty + " years");
    }
}

class Clothing extends Product implements ProductInfo {
    String clothingSize;

    Clothing(String productName, double cost, String clothingSize) {
        super(productName, cost);
        this.clothingSize = clothingSize;
    }

    public void display() {
        System.out.println("Clothing Product: " + productName);
        System.out.println("Cost: Rs " + cost);
        System.out.println("Available Size: " + clothingSize);
    }
}

class Grocery extends Product implements ProductInfo {
    String expiry;

    Grocery(String productName, double cost, String expiry) {
        super(productName, cost);
        this.expiry = expiry;
    }

    public void display() {
        System.out.println("Grocery Product: " + productName);
        System.out.println("Cost: Rs " + cost);
        System.out.println("Expiry: " + expiry);
    }
}

public class assignment7_products {
    public static void main(String[] args) {

        Electronic laptop = new Electronic("Laptop", 65000, 3);
        Clothing jeans = new Clothing("Jeans", 1499, "L");
        Grocery juice = new Grocery("Fruit Juice", 120, "20-09-2026");

        laptop.display();

        System.out.println("==========");

        jeans.display();

        System.out.println("==========");

        juice.display();
    }
}
