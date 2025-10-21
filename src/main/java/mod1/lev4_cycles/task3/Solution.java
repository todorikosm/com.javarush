package mod1.lev4_cycles.task3;

/*
Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник (его контур)
размером 10 (высота) на 20 (ширина) из букв 'Б'.
Незаполненная часть состоит из пробелов.
 */

public class Solution {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            int k = 0;
            while (k < 20) {
                if (i == 0 || i == 9) {
                    System.out.print("Б");
                } else if (i > 0 || i < 9) {
                    if (k == 0 || k == 19) {
                        System.out.print("Б");
                    } else {
                        System.out.print(" ");
                    }
                }
                k++;
            }
            System.out.println(" ");
            i++;
        }
    }
}
