package mod1.lev16.stream.task3;

/*
Программа считывает из консоли строку и выводит список букв, из которых состоит
введенная строка.
Не меняя функциональности программы, перепиши код с использованием
Scanner для чтения из консоли.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        try (InputStream stream = System.in;
             Scanner buff = new Scanner(System.in)
        ) {
            String line = buff.nextLine();
            char[] chars = line.toCharArray();
            Set<Character> characters = new HashSet<>();
            for (char aChar : chars) {
                if (Character.isAlphabetic(aChar)) {
                    characters.add(Character.toLowerCase(aChar));
                }
            }
            System.out.println(characters);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
