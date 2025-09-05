package Lesson_7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticOperationsTest {

    @Test
    public void testAdd() {
        Assert.assertEquals(ArithmeticOperations.add(2, 3), 5);
        Assert.assertEquals(ArithmeticOperations.add(-3, 7), 4);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(ArithmeticOperations.subtract(5, 3), 2);
        Assert.assertEquals(ArithmeticOperations.subtract(-3, 7), -10);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(ArithmeticOperations.multiply(4, 5), 20);
        Assert.assertEquals(ArithmeticOperations.multiply(-3, 7), -21);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(ArithmeticOperations.divide(10, 2), 5.0);
        Assert.assertEquals(ArithmeticOperations.divide(-3, 7), -3.0 / 7.0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        ArithmeticOperations.divide(5, 0);
    }
}

