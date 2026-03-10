package mod1.lev18_oop.interfaces.task3__Comparator_with_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");
        Collections.sort(list, new StringLengthComparator());
    }
}

class StringLengthComparator implements Comparator<String> {
    public int compare(String obj1, String obj2) {
        return obj1.length() - obj2.length();
    }
}

/*
public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList < String > ();
        Collections.addAll(list, "Привет", "как", "дела?");
        Comparator<String> comparator = new Comparator < String > () {
            public int compare(String obj1, String obj2) {
                return obj1.length() - obj2.length();
            }
        };
        Collections.sort(list, comparator);
    }
}
 */

/* with lambda 1
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");
        Comparator<String> comparator = (obj1, obj2) -> obj1.length() - obj2.length();
        Collections.sort(list, comparator);
 */

/* with lambda 2
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");
        Comparator<String> comparator = Comparator.comparingInt(String::length);
        Collections.sort(list, comparator);
 */
