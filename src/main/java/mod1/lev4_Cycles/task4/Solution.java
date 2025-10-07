package mod1.lev4_Cycles.task4;

/*
Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
например, строка или символ. Выведи на экран минимальное число из введенных.
Если введено несколько таких чисел, необходимо вывести любое из них.
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int minValue = Integer.MAX_VALUE;

        while (console.hasNextInt()) {
            int value = console.nextInt();
            if (value < minValue) {
                minValue = value;
            }
        }
        System.out.println(minValue);
    }
}
