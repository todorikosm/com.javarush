package mod1.lev9.task8;

public class Solution {
    public static void main(String[] args) {
        int a = 3;
        int b = a++ + (--a * a++);

        System.out.println(b);
        //System.out.println(--a * a++); // 4
        //System.out.println(a++); // 4
    }
}
