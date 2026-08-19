package mod1.lev17.Date.task2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    static Date birthDate;

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        /* Можно так

        date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, d MMMM yyyy");
        return formatter.format(date);
         */

        String result = "";
        int day = date.getDay();
        switch (day) {
            case 0:
                return "воскресенье";
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
        }
        return result;
    }
}
