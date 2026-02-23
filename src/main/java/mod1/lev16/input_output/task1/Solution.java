package mod1.lev16.input_output.task1;

/*

Напиши программу, которая считывает с консоли путь к файлу1 и путь к файлу2.
Далее все байты из файла1 записывает в файл2, но при этом меняет их местами по такому принципу: первый со вторым, третий с четвертым, и т.д.
Если последний байт в файле1 нечетный, то пишем его в файл2 как есть.
Для чтения и записи файлов используй методы newInputStream и newOutputStream класса Files.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            while (inputStream.available() > 0) {
                byte[] buffer = inputStream.readAllBytes();
                int count = 0;

                for (int i = 0; i < buffer.length; i++) {
                    if (i == buffer.length - 1) {
                        byte last = buffer[i];
                        buffer[i] = last;
                        outputStream.write(buffer, i, 1);
                    } else {
                        byte first = buffer[i];
                        byte second = buffer[i + 1];
                        buffer[i] = second;
                        buffer[i + 1] = first;
                        outputStream.write(buffer, count, 2);
                        count = count + 2;
                        i++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
