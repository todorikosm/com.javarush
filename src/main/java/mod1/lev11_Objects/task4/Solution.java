package mod1.lev11_Objects.task4;

/*
Рассмотрим аналог памяти компьютера на примере массива строк.
Если удалить некоторые элементы, то в массиве появятся так называемые "дыры" - то есть элементы равные null.
Метод executeDefragmentation(String[]), принимающий массив строк, выполняет его "дефрагментацию",
то есть перемещает все объекты в начало массива в таком же порядке, передвинув все "дыры" (элементы равные null)
в конец массива. В этой задаче тебе нужно реализовать метод executeDefragmentation(String[]).
Метод main() можешь использовать для проверки результата работы метода executeDefragmentation(String[]).
 */

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        int count1 = 0;
        int count2 = array.length - 1;

        String[] arrayCopy = new String[array.length];
        arrayCopy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            if (arrayCopy[i] != null) {
                array[count1] = arrayCopy[i];
                count1++;
            } else if (arrayCopy[i] == null) {
                array[count2] = arrayCopy[i];
                count2--;
           }
        }
    }
}
