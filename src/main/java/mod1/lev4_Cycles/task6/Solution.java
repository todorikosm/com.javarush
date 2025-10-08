package mod1.lev4_Cycles.task6;

/*
В этой задаче нужно:

Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно,
а программа может быть завершена с ошибкой.
Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры.
Если таких чисел несколько, то необходимо вывести любое из них.
Минимальных чисел тоже может быть несколько.
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        while (console.hasNextInt()) {
            int value = console.nextInt();
            if (value < min) {
                secondMin = min;
                min = value;
            } else if (value > min && value < secondMin) {
                secondMin = value;
            }
        }

        System.out.println(secondMin);
    }
}
