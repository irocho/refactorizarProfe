public class javaspring {
    // After refactoring
    abstract class ShapeRefactored {
        public abstract double calculateArea();
    }

    class Circle extends ShapeRefactored {
        private static final double PI = Math.PI;
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return PI * radius * radius;
        }
    }

    class Rectangle extends ShapeRefactored {
        double length;
        double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;

    class Cadrado extends ShapeRefactored {
        double lado;

        public Cadrado(double lado) {
            this.lado = lado;
        }

        @Override
        public double calculateArea() {
            return lado * lado;
        }
    
    }

class Triangulo extends ShapeRefactored {
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculateArea() {
        return (base * altura)/2;
    }
    
}
