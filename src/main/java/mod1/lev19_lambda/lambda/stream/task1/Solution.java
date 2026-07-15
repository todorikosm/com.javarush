package mod1.lev19_lambda.lambda.stream.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        stream1();
        System.out.println("=============================");
        stream2();
    }

    public static void stream1() {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");
        String max = list.stream().max((s1, s2)-> s1.length()-s2.length()).get();
        System.out.println(max);
    }

    public static void stream2() {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");
        Stream<String> stream = list.stream();
        Optional<String> optional = stream.max((s1, s2)-> s1.length()-s2.length());
        String max = optional.get();
        System.out.println(max);
    }
}
