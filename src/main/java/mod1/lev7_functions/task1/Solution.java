package mod1.lev7_functions.task1;

/*
Напишем утилиту для работы с массивами. Основная часть функционала готова: метод printArray() выводит в консоли
 все элементы массива.
Тебе осталась мелочь: реализовать метод reverseArray(). Он должен менять порядок элементов массива на обратный.
Метод должен работать только с массивами целочисленных значений (int[]).
 */

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int count = array.length;
        int[] newArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            array[i] = newArray[count-1];
            count--;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
