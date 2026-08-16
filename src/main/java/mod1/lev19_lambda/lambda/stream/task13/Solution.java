package mod1.lev19_lambda.lambda.stream.task13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Solution {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Этот элемент равен null";
        list.forEach(s -> System.out.println(Optional.ofNullable(s).orElse(text)));
    }
}
