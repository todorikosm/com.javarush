package mod1.lev18_oop.interfaces.task7_foreach;

import java.util.ArrayList;
import java.util.Collections;

/*
В классе Solution публичный метод print(ArrayList<Integer>) выводит в консоли все элементы
списка по порядку.
Сейчас метод реализован с использованием оператора for. Необходимо переписать реализацию
метода print(ArrayList<Integer>), используя метод списка forEach(), принимающий лямбда-выражение.
Логику работы метода print(ArrayList<Integer>) менять не нужно.

Метод main() не принимает участие в тестировании.
 */

public class Solution {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach((i) -> System.out.println(i));
        // или numbers.forEach(System.out::println);
    }
}
