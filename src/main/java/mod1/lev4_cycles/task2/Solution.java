package mod1.lev4_cycles.task2;

/*
Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
пока пользователь не введет слово "ENTER".
Вывести на экран полученную сумму и завершить программу.
 */

public class Solution {
    public static void main(String[] args) {
        int i = 5;

        while(i > 0) {
            int k = 10;
            while(k > 0) {
                System.out.print("Q");
                k--;
            }
            System.out.println(" ");
            i--;
        }
    }
}
