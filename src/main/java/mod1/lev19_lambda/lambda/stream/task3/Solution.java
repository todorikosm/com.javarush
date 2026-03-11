package mod1.lev19_lambda.lambda.stream.task3;

import java.util.List;

import static mod1.lev19_lambda.lambda.stream.task3.Selector.initData;

public class Solution {
    public static void main(String[] args) {
        List<Owner> owners = initData();


        final List<String> findNames = owners.stream()
                .flatMap(owner -> owner.getPets().stream())
                .filter(pet -> Cat.class.equals(pet.getClass()))
                .filter(cat -> Color.BLACK == cat.getColor())
                .sorted(((o1, o2) -> o2.getAge() - o1.getAge()))
                .map(Animal::getName)
                .toList();
        findNames.forEach(System.out::println);
    }
}
