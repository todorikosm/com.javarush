package mod1.lev13_generics.task6;

/*

Ты видишь рабочую программу, в которой массив int[] numbers заполняется числами в методе init().
Затем в методе reverse() происходит перестановка чисел в обратном порядке.
Твоя задача — переписать код так, чтобы вместо массива int[] numbers использовался список ArrayList<Integer> numbers.
Название методов и переменных не изменяй.
Методы main() и print() не принимают участие в проверке.
 */

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        ArrayList<Integer> numbersCopy = new ArrayList<>();
        numbersCopy.addAll(numbers);

        int count = numbers.size() - 1;
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbersCopy.get(count));
            count--;
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
