package mod1.lev10_strings.task1;

/*

Выведи на экран следующий текст в две строки:
It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"

Подсказка:
\” – экранирование двойной кавычки;
\\ – экранирование обратной косой черты (\).


Больше про экранирование символов и Escape-последовательности в Java читай в статье
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"");
        System.out.print("It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"");
    }
}
