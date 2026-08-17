class Vehicle {
    String model;
    String company;
    int maxSpeed;

    Vehicle(String model, String company, int maxSpeed) {
        this.model = model;
        this.company = company;
        this.maxSpeed = maxSpeed;
    }

    class VehicleDetails {
        void display() {
            System.out.println("Model Name: " + model);
            System.out.println("Company: " + company);
            System.out.println("Maximum Speed: " + maxSpeed + " km/h");
        }
    }
}

class Action {
    void execute() {
    }
}

public class assignment6_vehicle {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Bike", "Yamaha", 180);

        Vehicle.VehicleDetails info = vehicle.new VehicleDetails();
        info.display();

        Action move = new Action() {
            void execute() {
                System.out.println(vehicle.model + " has started.");
            }
        };

        move.execute();
    }
}
