package mod1.lev12_static.task3;

/*
В классе Outer есть внутренний (Inner) и вложенный (Nested) классы. В методе main класса
Solution создай по одному объекту каждого из них.
 */

public class Solution {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Nested outer2 = new Outer.Nested();
    }
}
