package mod1.lev5_Arrays.task7;

/*
Считывает из консоли число N — количество строк массива (считай, что это число будет больше 0, можно не проверять).
Считывает N чисел из консоли (любые числа, которые будут больше 0, можно не проверять).
Инициализирует двумерный массив multiArray:
количеством строк N;
строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).

Пример:
Введено число 5.
Введены числа 1, 7, 5, 9, 3.
Получаем такой массив:
[]
[][][][][][][]
[][][][][]
[][][][][][][][][]
[][][]
 */

import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        multiArray = new int[console.nextInt()][];

        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[console.nextInt()];
        }
    }
}
