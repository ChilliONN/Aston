package Lesson_7_junit_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void testFactorial() {
        assertEquals(120, Factorial.factorial(5));
        assertEquals(1, Factorial.factorial(0));
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-1);
        });
    }
}