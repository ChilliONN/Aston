package Lesson_7_testng;

public class Triangle implements Params {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (!isValidTriangle(sideA, sideB, sideC)) {
            throw new IllegalArgumentException("Невалидный треугольник");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    // Статические методы для тестов

    public static boolean isValidTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) return false;
        return a + b > c && a + c > b && b + c > a;
    }


    public static double getArea(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            throw new IllegalArgumentException("Невалидный треугольник");
        }
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}