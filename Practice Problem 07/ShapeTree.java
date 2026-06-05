public class ShapeTree {
    static abstract class Shape {
        String color;

        Shape(String color) {
            this.color = color;
        }

        abstract double calculateArea();

        abstract double calculatePerimeter();

        void displayInfo() {
            System.out.println("Shape: " + getClass().getSimpleName() + ", Color: " + color);
            System.out.println("Area: " + calculateArea());
            System.out.println("Perimeter: " + calculatePerimeter());
        }
    }

    static class Circle extends Shape {
        double radius;

        Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Rectangle extends Shape {
        double length;
        double width;

        Rectangle(String color, double length, double width) {
            super(color);
            this.length = length;
            this.width = width;
        }

        @Override
        double calculateArea() {
            return length * width;
        }

        @Override
        double calculatePerimeter() {
            return 2 * (length + width);
        }
    }

    static class Triangle extends Shape {
        double base;
        double height;
        double sideA;
        double sideB;
        double sideC;

        Triangle(String color, double base, double height, double sideA, double sideB, double sideC) {
            super(color);
            this.base = base;
            this.height = height;
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        @Override
        double calculateArea() {
            return 0.5 * base * height;
        }

        @Override
        double calculatePerimeter() {
            return sideA + sideB + sideC;
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Red", 5);
        shapes[1] = new Rectangle("Blue", 4, 6);
        shapes[2] = new Triangle("Green", 3, 4, 3, 4, 5);

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].displayInfo();
            System.out.println();
        }
    }
}
