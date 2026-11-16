
class Shape {
    // Base method to be overridden
    public double area() {
        return 0.0;
    }
}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}


class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}


public class shapemain {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];


        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Triangle(3.0, 8.0);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + " Area: " + shapes[i].area());
        }
    }
}
