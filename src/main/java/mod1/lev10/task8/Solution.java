package mod1.lev10.task8;

import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {


        String str = "Good news everyone!";

        StringTokenizer tokenizer = new StringTokenizer(str, "ne");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
