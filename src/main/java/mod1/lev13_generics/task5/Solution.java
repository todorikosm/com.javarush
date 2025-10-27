package mod1.lev13_generics.task5;

/*
Бухгалтерия
В классе Solution есть список сотрудников waitingEmployees, которые ждут зарплату, и список сотрудников alreadyGotSalaryEmployees, которые её уже получили. Необходимо реализовать метод paySalary(String), который в качестве аргумента принимает имя сотрудника, желающего получить зарплату.
Метод должен проверить наличие сотрудника в списке waitingEmployees, и если он не получал зарплату, выдать её:

Если параметр метода paySalary(String) равняется null, ничего не нужно делать.
Добавить имя сотрудника в список alreadyGotSalaryEmployees.
В списке waitingEmployees заменить имя сотрудника на null.
 */

import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(name)) { // проверяем весь массив
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(waitingEmployees.indexOf(name), null); // вычисляем под каким индексом находится и меняем его на null
        }
    }
}
