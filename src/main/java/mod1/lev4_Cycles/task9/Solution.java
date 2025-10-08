package mod1.lev4_Cycles.task9;

/*
Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String word = console.nextLine();
        int number = console.nextInt();

        do {
            if (number <= 0 || number >= 5) {
                System.out.println(word);
                break;
            } else {
                System.out.println(word);
                number--;
            }
        } while (number > 0);
    }
}
