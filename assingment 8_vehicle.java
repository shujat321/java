class assingment 8_vehicle {
    String vehicleNumber = "MH12AB4521";
    String vehicleType = "Bike";

    void displayVehicle() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class VehicleInsurance extends Vehicle {
    void displayInsurance() {
        System.out.println("Vehicle Insurance Details:");
        System.out.println("Vehicle Number: " + super.vehicleNumber);
        System.out.println("Vehicle Type: " + super.vehicleType);
    }
}

public class assignment8_insurance {
    public static void main(String[] args) {
        VehicleInsurance insurance = new VehicleInsurance();
        insurance.displayInsurance();
    }
}
