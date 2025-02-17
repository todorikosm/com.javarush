package mod1.lev25_Date.task4;

/*
    В классе Solution реализуй 4 метода:
    метод nowExample должен вернуть текущую дату;
    остальные методы должны вернуть дату 12 сентября 2020 года, но разными способами.

    Требования:
•	Метод nowExample должен вернуть текущую дату.
•	Метод ofExample должен вернуть дату 12 сентября 2020 года с помощью метода LocalDate.of.
•	Метод ofYearDayExample должен вернуть дату 12 сентября 2020 года с помощью метода LocalDate.ofYearDay.
•	Метод ofEpochDayExample должен вернуть дату 12 сентября 2020 года с помощью метода LocalDate.ofEpochDay.
 */

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        return LocalDate.now();
    }

    static LocalDate ofExample() {
        return LocalDate.of(2020, 9, 12);
    }

    static LocalDate ofYearDayExample() {
        return LocalDate.ofYearDay(1988, 100);
    }

    static LocalDate ofEpochDayExample() {
        return LocalDate.ofEpochDay(12000);
    }
}
