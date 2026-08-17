import java.util.Scanner;

public class unboxing_auto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String value1 = sc.nextLine();

        System.out.print("Enter second number: ");
        String value2 = sc.nextLine();

        // Converting String values into integers
        Integer num1 = Integer.valueOf(value1);
        Integer num2 = Integer.valueOf(value2);

        System.out.println("\nInput Numbers");
        System.out.println("First Number  : " + num1);
        System.out.println("Second Number : " + num2);

        int add = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;

        System.out.println("\nCalculation");
        System.out.println("Addition       = " + add);
        System.out.println("Subtraction    = " + subtract);
        System.out.println("Multiplication = " + multiply);

        if (num2 != 0) {
            double divide = (double) num1 / num2;
            int remainder = num1 % num2;

            System.out.println("Division       = " + divide);
            System.out.println("Remainder      = " + remainder);
        } else {
            System.out.println("Division is not possible by zero.");
        }

        // Autoboxing
        int basicValue = 100;
        Integer boxedValue = basicValue;

        System.out.println("\nAutoboxing");
        System.out.println("Primitive Value : " + basicValue);
        System.out.println("Wrapper Value   : " + boxedValue);

        // Unboxing
        Integer boxedNumber = 250;
        int normalNumber = boxedNumber;

        System.out.println("\nUnboxing");
        System.out.println("Wrapper Value   : " + boxedNumber);
        System.out.println("Primitive Value : " + normalNumber);

        sc.close();
    }
}
