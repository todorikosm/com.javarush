package mod1.lev10.task9;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
Используя StringTokenizer раздели query на части по разделителю delimiter.

Пример:
getTokens("java.util.stream", "\\.")
возвращает массив строк
{"java", "util", "stream"}

Hint: решить задачу поможет метод countTokens().
 */

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        int count = stringTokenizer.countTokens();
        String[] array = new String[count];
        if (stringTokenizer.hasMoreTokens()) {
            for (int i = 0; i < array.length; i++) {
                array[i] = stringTokenizer.nextToken();
            }
        }
        return array;
    }
}
