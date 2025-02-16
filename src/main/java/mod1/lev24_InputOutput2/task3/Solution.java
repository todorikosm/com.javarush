package mod1.lev24_InputOutput2.task3;

/*
    Напиши программу, которая будет считывать с клавиатуры пути к двум директориям и перемещать файлы из одной директории
    в другую (только файлы, директории игнорируй). Используй соответствующие методы класса Files:
    newDirectoryStream(), isRegularFile() или isDirectory(), move().
 */

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишите тут ваш код

        try (DirectoryStream<Path> files1 = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path : files1) {
                if (Files.isRegularFile(path)) {
                    // Строит новый абсолютный путь из абсолютного и относительного.
                    Path resolve = targetDirectory.resolve(path.getFileName());
                    Files.move(path, resolve);
                }
            }
        }
    }
}

