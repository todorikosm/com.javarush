package mod1.lev17.Calendar.task1;

/*
Проинициализируй переменную birthDate объектом GregorianCalendar с датой своего рождения.
Реализуй метод getDayOfWeek(Calendar calendar), чтобы он возвращал русское название дня недели аргумента calendar.
Помни, что в григорианском календаре неделя начинается с воскресенья.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {
    static Calendar birthDate = new GregorianCalendar(1988, Calendar.APRIL, 18);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        String day = "";
        switch (i) {
            case 1:
                day = "Воскресенье";
                break;
            case 2:
                day = "Понедельник";
                break;
            case 3:
                day = "Вторник";
                break;
            case 4:
                day = "Среда";
                break;
            case 5:
                day = "Четверг";
                break;
            case 6:
                day = "Пятница";
                break;
            case 7:
                day = "Суббота";
                break;
        }
        return day;
    }
}
