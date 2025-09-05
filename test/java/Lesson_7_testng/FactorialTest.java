package Lesson_7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testFactorial() {
        Assert.assertEquals(Factorial.factorial(0), 1);
        Assert.assertEquals(Factorial.factorial(1), 1);
        Assert.assertEquals(Factorial.factorial(5), 120);
        Assert.assertEquals(Factorial.factorial(10), 3628800);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Factorial.factorial(-1);
    }
}