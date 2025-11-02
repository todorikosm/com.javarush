package mod1.lev14_collections.task13_hash_map;

import java.util.HashMap;

/*
В классе Solution есть метод getProgrammingLanguages, который возвращает список языков программирования.
Тебе нужно переписать этот метод, чтобы он возвращал HashMap<Integer, String>.
Ключом в этой коллекции будет индекс элемента в ArrayList.
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Java");
        map.put(1, "Kotlin");
        map.put(2, "Go");
        map.put(3, "Javascript");
        map.put(4, "Typescript");
        map.put(5, "Python");
        map.put(6, "PHP");
        map.put(7, "C++");
        return map;
    }
}
