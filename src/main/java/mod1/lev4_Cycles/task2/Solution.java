package mod1.lev4_Cycles.task2;

public class Solution {
    public static void main(String[] args) {
        int i = 5;

        while(i > 0) {
            int k = 10;
            while(k > 0) {
                System.out.print("Q");
                k--;
            }
            System.out.println(" ");
            i--;
        }
    }
}
