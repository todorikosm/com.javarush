package mod1.lev11_objects.task1;

/*
В методе main создаются два айфона с одинаковыми параметрами.
В консоли выводится результат их сравнения. Разберись, почему сейчас результат отрицательный и сделай так,
чтобы он был положительным. Для этого тебе нужно переопределить метод equals(Iphone), который будет учитывать
все параметры.
У двух равных объектов значения полей должны быть одинаковыми. Метод main не участвует в проверке.
 */

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public boolean equals(Iphone iphone) {
        boolean result = false;
        if (this.model == iphone.model &&
                this.color == iphone.color &&
                this.price == iphone.price) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
