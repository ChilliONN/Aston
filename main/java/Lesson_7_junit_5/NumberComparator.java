package Lesson_7_junit_5;

public class NumberComparator {
    public static String compareNumbers() {
        int a = 14;
        int b = 15;
        if (a > b) {
            return "a > b";
        } else {
            return "a <= b";
        }
    }
}