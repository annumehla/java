public abstract class Shape {
    public abstract double area();
}

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.00, 20.00);
        System.out.println("Area: " + rectangle.area());
    }
}

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * (radius * radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.00);
        System.out.println("Area: " + circle.area());
    }
}