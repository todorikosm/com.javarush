package mod1.lev4_cycles.task8;

/*
В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
Допиши программу, чтобы на экран выводилась сумма чисел от start (включительно) до end (не включительно),
кратных multiple.
Для этого используй цикл for.
Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i % multiple == 0) {
                sum = sum + i;
            } else {
                continue;
            }
        }
        System.out.println(sum);
    }
}
