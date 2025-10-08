package mod1.lev4_Cycles.task7;

/*
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
 */

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("8");
            }
            System.out.println("");
        }
    }
}
