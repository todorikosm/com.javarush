package mod1.lev24_InputOutput2.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
    Напиши программу, которая будет считывать с клавиатуры строки, и если данная строка — это путь к существующему файлу, выводить в консоли "<введенная строка> - это файл". Если путь к существующей директории, выводить в консоли "<введенная строка> - это директория".
    Если строка не является путем к файлу или директории, то выходим из программы. Треугольные скобки и кавычки выводить не нужно.
    Для проверки файлов и директорий используй методы isRegularFile() и isDirectory() класса Files.

    Пример вывода:
    C:\javarush\text.txt - это файл
    C:\javarush\ - это директория
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        } else if (Files.notExists(fileNewPath)) {
            Files.move(filePath, fileNewPath);
        } else {
            Files.delete(filePath);
        }
    }
}
