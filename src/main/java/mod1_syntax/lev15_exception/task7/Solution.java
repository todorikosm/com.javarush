package mod1_syntax.lev15_exception.task7;

public class Solution {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("мясо"));
        lion.eat(null);
    }
}
