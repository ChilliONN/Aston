package Geometry;

public class Maina {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Geometry.Circle area: " + circle.getArea());
        System.out.println("Geometry.Circle perimeter: " + circle.getPerimeter());

        System.out.println("Geometry.Rectangle area: " + rectangle.getArea());
        System.out.println("Geometry.Rectangle perimeter: " + rectangle.getPerimeter());

        System.out.println("Geometry.Triangle area: " + triangle.getArea());
        System.out.println("Geometry.Triangle perimeter: " + triangle.getPerimeter());
    }
}