package mod1.lev13_generics.task10;

/*
В методе main найди и удали язык программирования Pascal из списка programmingLanguages.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static ArrayList<String> programmingLanguages =
            new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        for (int i = 0; i < programmingLanguages.size(); i++) {
            if(programmingLanguages.get(i).equals("Pascal")) {
                programmingLanguages.remove(i);
                break;
            }
        }
    }
}
