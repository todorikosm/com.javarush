package mod1.lev19_lambda.lambda.stream.task3;

import java.util.List;

public class Selector {
    private static List<Owner> owners;

    public static List<Owner> initData() {

        final Owner owner1 = new Owner("Сергей Тодорико");
        owner1.getPets().addAll(List.of(
                new Cat("Барон", 4, Color.BLACK),
                new Cat("Султан", 4, Color.DARK_GREY),
                new Dog("Эльза", 0, Color.WHITE)
        ));

        final Owner owner2 = new Owner("Дмитрий Васильков");
        owner2.getPets().addAll(List.of(
                new Cat("Рыжик", 7, Color.FOXY),
                new Cat("Барсик", 5, Color.FOXY),
                new Parrot("Адмирал", 3, Color.BLUE)
        ));

        owners = List.of(owner1, owner2);
        return owners;
    }

}
