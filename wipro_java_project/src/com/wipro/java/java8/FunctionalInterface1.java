package com.wipro.java.java8;

@FunctionalInterface
interface Shape {
    // Single abstract method
    void area(double dimension1, double dimension2);

    // Default method 1
    default String getType() {
        return "Generic Shape";
    }

    // Default method 2
    default String getColor() {
        return "Color not specified";
    }

    // Static method 1
    static String shapeInfo() {
        return "Shapes have area and perimeter.";
    }

    // Static method 2
    static String commonProperty() {
        return "All shapes have dimensions.";
    }
}

class Circle implements Shape {
    @Override
    public void area(double radius, double unused) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

}

class Square implements Shape {
    @Override
    public void area(double side, double unused) {
        System.out.println("Area of Square: " + (side * side));
    }
}

class Rectangle implements Shape {
    @Override
    public void area(double length, double width) {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

class FunctionalInterface1 {
    public static void main(String[] args) {
        Shape square = new Square();
        square.area(4, 0);
        
        Shape rectangle = new Rectangle();
        rectangle.area(4, 6);
        
        Shape circle = new Circle();
        circle.area(1, 0);
        
        // Static methods execution
        System.out.println(Shape.shapeInfo());
        System.out.println(Shape.commonProperty());
    }
}