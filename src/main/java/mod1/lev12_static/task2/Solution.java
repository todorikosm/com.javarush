package mod1.lev12_static.task2;

/*
В методе main конвертируй строку string в тип double с помощью статического метода parseDouble класса Double.
Затем округли полученное значение, используя статический метод round класса Math.
Результат выведи на экран.
 */

import mod1.lev11_objects.task2.Man;

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        double number = Double.parseDouble(string);
        System.out.println(Math.round(number));
    }


}
