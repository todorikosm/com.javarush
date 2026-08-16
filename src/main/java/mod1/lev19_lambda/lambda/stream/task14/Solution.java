package mod1.lev19_lambda.lambda.stream.task14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    static void main() {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");
        System.out.println(list.stream().findFirst().get());

        System.out.println(list.stream().min(Comparator.comparingInt(String::length)).get());
        System.out.println(list.stream().max(Comparator.comparingInt(String::length)).get());


    }
}
