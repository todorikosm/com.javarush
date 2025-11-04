package mod1.lev14_collections.task17;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int ordinal = month == Month.DECEMBER ? 0 : month.ordinal() + 1;
        return Month.values()[ordinal];
    }
}
