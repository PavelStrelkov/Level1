package lesson1;

public class Lesson1 {
    public static void main(String[] args) {

        System.out.println("lesson1");
        byte b = 1;
        short s = 111;
        int i = 0;
        long a = 1111;
        float f = 0.2f;
        double d = 123.321;
        char c = 'c';
        boolean on = true;

        example3();
        example4();
        example5();
        example6();
        example7();
        example8();
    }

    public static void example3() {
        float a = 4, b = 6, c = 8, d = 2;
        float res = a * (b + (c / d));
        System.out.println(res);
    }

    public static void example4() {
        int a = 10, b = 10;
        if ((a + b) >= 10 && (a + b) <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void example5() {
        int a = 0;
        if (a >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

    public static void example6() {
        int a = 0;
        if (a > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void example7() {
        String name = "Junior";
        System.out.println("Привет, " + name + "!");
        if ( example8() == true) {
        }
    }

    public static boolean example8() {
        int year = 100;
        if (year % 4 != 0) {
            return false;
        }
        return ((year % 400 !=0) || (year % 100 == 0 )) ;
    }
}


