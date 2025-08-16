import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PrintThreeWords();
        CheckSum();
        printColor();
        compareNumbers();
        compareNumbers2();
        checkNumber(5);
        isNegative(-3);
        printStringMultipleTimes("Привет Леонид", 3);
        isLeapYear(2024);
        MassiveChange();
        Massive();
        PrintMatrix();
        Print();
    }

    public static void PrintThreeWords() {
        System.out.println("Orange");
        System.out.println("banana");
        System.out.println("apple");
    }

    public static void CheckSum() {
        int a = 14;
        int b = -13;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная или равна нулю");
        }
    }

    public static void printColor() {
        int value = 30;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 14;
        int b = 15;
        if (a > b) {
            System.out.println("a>b");
        } else {
            System.out.println("a<=b");
        }
    }

    public static void compareNumbers2() {
        int a = 14;
        int b = 5;
        if (a + b >10 && a + b <=20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("Передано положительное число");
        } else {
            System.out.println("Передано отрицательное число");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStringMultipleTimes(String str, int count) {
        for (int i=0; i<count; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    public static void MassiveChange() {
        int[] array = {1,1,0,0,1,0,1,1,0,0};

        for (int i=0; i<array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }

        System.out.print("Итог: ");

        for(int num: array){
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void Massive() {
        int[] array=new int[100];
        for(int i=0;i<array.length;i++){
            array[i]=i+1;
        }
        for(int num:array){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void PrintMatrix() {
        int n=5;
        int[][] matrix=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    matrix[i][j]=1;
                }else{
                    matrix[i][j]=0;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void Print() {
        int length=10;
        int value=7;
        int[] array=new int[length];
        Arrays.fill(array,value);
        for(int num:array){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}