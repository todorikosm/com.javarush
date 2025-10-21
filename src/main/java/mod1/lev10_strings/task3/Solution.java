package mod1.lev10_strings.task3;

/*
Проинициализируй статические переменные следующими значениями:

partyFace — "\uD83E\uDD73"
balloon — "\uD83C\uDF88"
gift — "\uD83C\uDF81"
partyPopper — "\uD83C\uDF89"
cake — "\uD83C\uDF82"
Чтобы посмотреть поздравление, запусти метод main().
 */

public class Solution {
    public static String partyFace = "";
    public static String balloon = "";
    public static String gift = "";
    public static String partyPopper = "";
    public static String cake = "";

    public static void main(String[] args) {
        printCongratulation();
    }

    public static void printCongratulation() {
        String happyBirthday = "С днем рождения!";
        String congratulation = partyFace + balloon + partyPopper + cake + gift;
        System.out.println(happyBirthday + congratulation);
    }
}
