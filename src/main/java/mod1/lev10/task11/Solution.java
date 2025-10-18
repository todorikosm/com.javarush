package mod1.lev10.task11;

public class Solution {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        boolean result = false;
        String f = first.intern();
        String d = second.intern();
        if (f == d) {
            result = true;
        } else if (first != second) {
        }
        return result;
    }
}
