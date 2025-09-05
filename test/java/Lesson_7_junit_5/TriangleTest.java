package Lesson_7_junit_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void testIsValidTriangle() {
        assertTrue(Triangle.isValidTriangle(3, 4, 5));
        assertTrue(Triangle.isValidTriangle(5, 5, 5));
        assertFalse(Triangle.isValidTriangle(1, 2, 3)); // невалидный треугольник
        assertFalse(Triangle.isValidTriangle(0, 4, 5)); // сторона равна 0
        assertFalse(Triangle.isValidTriangle(-1, 4, 5)); // отрицательная сторона
    }

    @Test
    public void testTriangleType() {
        assertEquals("Equilateral", Triangle.getTriangleType(5, 5, 5));
        assertEquals("Isosceles", Triangle.getTriangleType(5, 5, 3));
        assertEquals("Scalene", Triangle.getTriangleType(3, 4, 5));
    }

    @Test
    public void testTriangleArea() {
        // Площадь треугольника со сторонами 3,4,5 равна 6
        assertEquals(6.0, Triangle.getArea(3, 4, 5), 0.0001);

        // Проверка на невалидный треугольник — ожидаем исключение
        assertThrows(IllegalArgumentException.class, () -> {
            Triangle.getArea(1, 2, 3);
        });
    }
}