package mod1.lev5_arrays.task3;

import java.util.Scanner;

/*
Считывает с консоли целое число N.
Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int value = console.nextInt();
        int [] array = new int[value];

        if (value > 0) {
            for (int i = 0; i < value; i++) {
                array[i] = console.nextInt();
            }
        }

        if (value % 2 == 1) {
            for (int i = 0; i < value; i++) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = value-1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        }
    }
}
