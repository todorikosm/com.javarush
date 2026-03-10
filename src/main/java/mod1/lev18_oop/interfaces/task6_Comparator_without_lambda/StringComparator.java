package mod1.lev18_oop.interfaces.task6_Comparator_without_lambda;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
