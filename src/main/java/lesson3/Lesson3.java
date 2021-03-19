package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    static Random rand = new Random();
    static int r = rand.nextInt(10);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        1. Написать программу, которая загадывает случайное число от 0 до 9
//        и пользователю дается 3 попытки угадать это число.
//        При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
//        чем загаданное, или меньше. После победы или проигрыша выводится запрос –
//        «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        numbertronic();
    }
    public static void numbertronic() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 9");

        for (int i = 0; i < 3; i++) {  // цикл for
            System.out.println(i + 1 + " попытка");
            int x = scan.nextInt();
            System.out.print("случайное число "); { // процесс внутри итерации цикла
                if (r < x) {
                    System.out.println("меньше, не угадали ");
                }
                else  if (r > x) {
                    System.out.println("больше, не угадали ");
                } else {
                    System.out.println("<" + r + ">" + " Вы угадали! ");
                    System.out.println("\n" + "Повторить игру еще раз? 1 – да / 0 – нет");
                    int yn = scan.nextInt();
                    if (yn == 1) numbertronic();
                    else if (yn == 0) {
                        return;
                    }

                }
            }           // процесс внутри итерации цикла --end--
        }               // цикл for --end--
        System.out.println("\n" + "Повторить игру еще раз? 1 – да / 0 – нет");
        int yn = scan.nextInt();
        if (yn == 1) numbertronic();
        else {
            System.out.println("G A M E" + "\n" + "O V E R");
            return;
        }
    }                   // numbertronic --end--
}                       // class Lesson3 --end--














