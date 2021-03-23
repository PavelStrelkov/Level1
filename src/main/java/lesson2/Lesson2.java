package lesson2;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        minMax();
        checkBalance();
        shiftArray();
    }
//  Example 1

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("\n"); // insert empty line
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

//  Example 2

    public static void fillArray() {
        int[] arr = new int[8];
        int g = 0;
        for (int i = 0; i < 8; i++, g += 3) {
            arr[i] = g;

            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

//  Example 3

    public static void changeArray() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        System.out.print("[");
        for (int i = 0; i < arr3.length; i++) {

            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
            {
                System.out.print(arr3[i] + "," + " ");

            }

        }

        System.out.print("]");
        System.out.println("\n");
    }


//  Example 4. Создать квадратный двумерный целочисленный массив
// (количество строк и столбцов одинаковое) и
// с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void fillDiagonal() {

        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0, j2 = table[j].length; j < 4; j++, j2--) {
//                int j2 = table[i].length;
                if (i == j || i == (j2 - 1)) table[i][j] = 1;

                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

//  Example 5. ** Задать одномерный массив и найти в нем
//  минимальный и максимальный элементы (без помощи интернета);

    public static void minMax() {
        System.out.println(); // insert empty line
        int[] arr = new int [6];
        arr[0] = 1;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = 3;
        arr[4] = 2;
        arr[5] = 9;

        System.out.println(Arrays.toString(arr));
        int max = 0;
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            } else if (arr[i] < arr[min]) {
                min = i;
            }
        }
        System.out.println("Максимальный элемент " + arr[max] + " " + "\n" + "Минимальный элемент " + arr[min]);
    }
//  Example 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//  метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//  Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
//  граница показана символами ||, эти символы в массив не входят.

    public static boolean checkBalance() {
        System.out.println("\n"); // insert empty line

        int [] arr = {1, 1, 1, 2, 1};
        int left = 0, right = 0;
        for (int i = 0, j = arr.length - 1; i <= j;) { //thank you very much for the idea
            if (left < right) {
                left += arr[i];
                i++;
            } else {
                right += arr[j];
                j--;
            }
        }
        return left == right;
    }


//7. **** Написать метод, которому на вход подается одномерный массив и число n
// (может быть положительным, или отрицательным), при этом метод должен сместить
// все элементы массива на n позиций. Элементы смещаются циклично.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.

    public static void shiftArray() {
        int [] arr = {1, 2 , 3, 4, 5};
        int shift = 1;
        if (shift > 0) {
            for (int i = 0; i < shift; i++) {
                shiftRight1(arr);
            }
        } else {
            for (int i = 0; i < -shift; i++) {
                shiftLeft1(arr);
            }
        }
    }

    public static void shiftRight1(int[] arr) {
        int last = arr[arr.length -1];
        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
            System.out.println(Arrays.toString(arr));

        }
        arr[0] = last;
        System.out.println(Arrays.toString(arr));
    }

    public static void shiftLeft1(int[] arr) {
        int first = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
            System.out.println(Arrays.toString(arr));

        }
        arr[arr.length -1] = first;
        System.out.println(Arrays.toString(arr));
    }

}
