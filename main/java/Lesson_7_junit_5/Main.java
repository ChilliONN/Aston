package Lesson_7_junit_5;

public class Main {
    public static void main(String[] args) {
        // Вызов метода сравнения
        System.out.println(NumberComparator.compareNumbers());

        // Вызов метода вычисления факториала
        long fact = Factorial.factorial(5);
        System.out.println("Факториал 5 равен " + fact);

        // Вызов арифметических операций
        System.out.println("Сумма: " + ArithmeticOperations.add(-3, 7));
        System.out.println("Разность: " + ArithmeticOperations.subtract(-3, 7));
        System.out.println("Произведение: " + ArithmeticOperations.multiply(-3, 7));
        System.out.println("Деление: " + ArithmeticOperations.divide(-3, 7));

        // Создание треугольника и вычисление площади
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Площадь треугольника: " + triangle.getArea());
    }
}