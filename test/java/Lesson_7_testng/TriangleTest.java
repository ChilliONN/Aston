package Lesson_7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {

    @Test
    public void testValidTriangle() {
        Assert.assertTrue(Triangle.isValidTriangle(3, 4, 5));
        Assert.assertFalse(Triangle.isValidTriangle(1, 2, 3));
        Assert.assertFalse(Triangle.isValidTriangle(-1, 2, 3));
        Assert.assertFalse(Triangle.isValidTriangle(0, 2, 3));
    }

    @Test
    public void testGetAreaStatic() {
        double area = Triangle.getArea(3, 4, 5);
        Assert.assertEquals(area, 6.0, 0.0001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetAreaInvalidTriangle() {
        Triangle.getArea(1, 2, 3);
    }

    @Test
    public void testTriangleInstance() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertEquals(triangle.getPerimeter(), 12.0, 0.0001);
        Assert.assertEquals(triangle.getArea(), 6.0, 0.0001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTriangleConstructorInvalid() {
        new Triangle(1, 2, 3);
    }
}