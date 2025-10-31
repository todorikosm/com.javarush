package mod1.lev14_collections.task10;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(7);
        numbers.add(-2);
        numbers.add(-7);
        numbers.add(1);
        numbers.add(2);
        numbers.add(15);
        System.out.println(numbers);

        Set<Integer> copyNumbers = new HashSet<>(numbers);
        for (Integer i : copyNumbers) {
            if (i < 0) {
                numbers.remove(i); // Выполняю удаление в массиве, который не задействован в итераторе
            }
        }
        System.out.println(numbers);

    }
}
