package Geometry;

public interface Shape {
    double getArea();

    default double getPerimeter() {
        throw new UnsupportedOperationException("Perimeter calculation not implemented");
    }
}
