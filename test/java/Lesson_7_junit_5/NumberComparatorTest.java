package Lesson_7_junit_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberComparatorTest {

    @Test
    public void testCompareNumbers() {
        String result = NumberComparator.compareNumbers();
        assertEquals("a <= b", result);
    }
}