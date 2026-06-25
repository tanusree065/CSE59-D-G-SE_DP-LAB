package lab03;
public class Lab3OCP {
 public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        Shape circle = new Circle(3);
        Shape triangle = new Triangle(4, 6); 
        Shape[] shapes = {rectangle, circle, triangle};
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);

        System.out.println("Total Area: " + totalArea);
    }
}
interface Shape {
    double calculateArea();
}
class Rectangle implements Shape {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
}
class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }
}
class Triangle implements Shape {
    public double base;
    public double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.calculateArea(); 
        }
        return area;
    }
}
