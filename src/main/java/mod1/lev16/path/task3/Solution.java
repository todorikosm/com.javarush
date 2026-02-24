package mod1.lev16.path.task3;

/*

Напиши код, который будет считывать с клавиатуры путь и выводить его в консоли,
при этом если путь не абсолютный, то перед выводом его нужно преобразовать к таковому.
 */

import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (Path.of(str).isAbsolute()) {
            System.out.println(str);
        } else {
            System.out.println(Path.of(str).toAbsolutePath());
        }
    }
}
