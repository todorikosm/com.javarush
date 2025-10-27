package mod1.lev13_generics.task4;

/*
Реализуй методы countDigits(String), countLetters(String), countSpaces(String), которые должны возвращать
количество цифр, букв и пробелов в строке.
Метод main не принимает участия в проверке.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }


    public static int countSpaces(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
