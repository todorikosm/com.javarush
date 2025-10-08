package mod1.lev4_Cycles.task5;

/*
еденных чисел
Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
например, строка или символ. Выведи на экран максимальное четное число из введенных.
Если введено несколько таких чисел, необходимо вывести любое из них.
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int maxValue = Integer.MIN_VALUE;

        while (console.hasNextInt()) {
            int value = console.nextInt();
            if (value % 2 == 0) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }
        }
        System.out.println(maxValue);
    }
}
