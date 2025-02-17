package mod1.lev25_Date.task2;

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
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        String result = null;

        switch (day) {
            case 1:
                result = "Воскресенье";
                break;
            case 2:
                result = "Понедельник";
                break;
            case 3:
                result = "Вторник";
                break;
            case 4:
                result = "Среда";
                break;
            case 5:
                result = "Четверг";
                break;
            case 6:
                result = "Пятница";
                break;
            case 7:
                result = "Суббота";
                break;
        }
        return result;
    }
}
