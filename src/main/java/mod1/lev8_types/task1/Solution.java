package mod1.lev8_types.task1;

/*
В методе main вызови метод div() 2 раза. Первый раз — с такими аргументами,
чтобы вывод в консоли был "Infinity", а второй — "-Infinity".
Код метода div() изменять нельзя.
 */

public class Solution {
    public static void main(String[] args) {
        div( 0.0, 10);
        div( 0.0, -10);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
