package mod1.lev5_arrays.task6;

/*
Создай треугольный массив, где значение каждого элемента — это сумма его индексов. Например:
array[7][3] = 7 + 3 = 10,
array[3][0] = 3 + 0 = 3.

0
1 2
2 3 4
3 4 5 6
4 5 6 7 8
5 6 7 8 9 10


Задать треугольный массив можно следующим образом:
int[][] array = new int[10][];
array[0] = new int[1];
array[1] = new int[2];
array[2] = new int[3];
 */

public class Solution {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
        }

        for (int i = 0; i < result.length; i++) {
            int count = 0;
            for (int j = 0; j < i + 1; j++) {
                result[i][j] = count + i;
                System.out.print(result[i][j]);
                System.out.print(" ");
                count++;
            }
            System.out.println(" ");
        }
    }


}
