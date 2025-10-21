package mod1.lev4_cycles.task10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;

        Scanner console = new Scanner(System.in);
        boolean value = console.nextBoolean();

        if (value) {
            int result = (int)Math.ceil(glass);
            System.out.println(result);
        } else if (!value) {
            int result = (int)Math.floor(glass);
            System.out.println(result);
        }

    }
}
