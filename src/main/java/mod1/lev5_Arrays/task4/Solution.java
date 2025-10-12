package mod1.lev5_Arrays.task4;

/*
Считать 6 строк и заполнить ими массив strings.
Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
*/

import java.util.Scanner;

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = console.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String value = strings[i];
            if (strings[i] == null) {
                continue;
            } else {
                for (int j = i + 1; j < strings.length; j++) {
                    if (value.equals(strings[j])) {
                        strings[j] = null;
                        strings[i] = null;
                    }
                }
            }
        }


//            for (int j = i + 1; j < strings.length; j++) {
//                if (strings[i] != null) {
//                    if (i == strings.length - 1) {
//                        break;
//                    } else if (strings[i].equals(strings[j])) {
//                        strings[j] = null;
//                    }
//                }
//            }
//        }

            for (int i = 0; i < strings.length; i++) {
                System.out.print(strings[i] + ", ");
            }
        }
    }
