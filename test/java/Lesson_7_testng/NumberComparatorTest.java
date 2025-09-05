package Lesson_7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberComparatorTest {

    @Test
    public void testCompareNumbers() {
        String result = NumberComparator.compareNumbers();
        Assert.assertEquals(result, "a <= b");
    }
}