interface Area {
    double getArea();
}

class Shape {
    String shapeName;

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }
}

class Circle extends Shape implements Area {
    double radiusValue;

    Circle(double radiusValue) {
        super("Circle");
        this.radiusValue = radiusValue;
    }

    public double getArea() {
        return Math.PI * radiusValue * radiusValue;
    }
}

class Rectangle extends Shape implements Area {
    double lengthValue;
    double widthValue;

    Rectangle(double lengthValue, double widthValue) {
        super("Rectangle");
        this.lengthValue = lengthValue;
        this.widthValue = widthValue;
    }

    public double getArea() {
        return lengthValue * widthValue;
    }
}

public class assignment7_shapes {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(8, 12);

        System.out.println(circle.shapeName + " Area: " + circle.getArea());
        System.out.println(rectangle.shapeName + " Area: " + rectangle.getArea());
    }
}
