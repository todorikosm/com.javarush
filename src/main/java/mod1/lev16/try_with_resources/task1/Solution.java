package mod1.lev16.try_with_resources.task1;

/*

Программа считывает с консоли строку и выводит ее на экран в нижнем регистре.
Не меняя функциональности программы, перепиши код с использованием try-with-resources.
Вынеси в круглые скобки создание объектов с внешними ресурсами. Не забудь удалить ненужные вызовы метода close().
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            System.out.println(line.toLowerCase());
        } catch (IOException e) {
            System.out.println("Somethink went wrong : " + e);
        }
    }
}
