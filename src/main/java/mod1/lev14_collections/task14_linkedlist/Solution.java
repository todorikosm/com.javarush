package mod1.lev14_collections.task14_linkedlist;

/*
Пришло время познакомиться с двусвязным списком. Решая эту задачу ты поймешь, как работает двусвязный список
и сможешь добавлять в него элементы. У тебя есть класс StringLinkedList, в котором есть поля first и last,
указывающие на первый и последний элемент соответственно.
Тебе нужно реализовать логику метода add, который будет добавлять элементы в список.
 */

public class Solution {
    public static void main(String[] args) {
        StringLinkedList stringLinkedList = new StringLinkedList();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");
        stringLinkedList.add("6");
        stringLinkedList.add("7");
        stringLinkedList.add("8");
        stringLinkedList.add("9");
        stringLinkedList.printAll();
    }
}
