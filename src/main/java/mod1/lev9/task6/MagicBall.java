package mod1.lev9.task6;

/*
В этой задаче тебе предстоит реализовать метод getPrediction() в классе MagicBall, который будет работать как шар
предсказаний.
Он случайным образом возвращает фразу-ответ на заданный вопрос. В методе getPrediction() нужно использовать
метод nextInt(int) класса Random, который должен возвращать значения от 0 до 7 включительно.
В зависимости от результата работы метода nextInt(int) возвращается один из вариантов ответа:
0 -> Бесспорно
1 -> Определённо да
2 -> Вероятнее всего
3 -> Хорошие перспективы
4 -> Спроси позже
5 -> Попробуй снова
6 -> Мой ответ — нет
7 -> Весьма сомнительно
Иначе вернуть null.
 */

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        Random random = new Random();
        String[] array = {CERTAIN,
                DEFINITELY,
                MOST_LIKELY,
                OUTLOOK_GOOD,
                ASK_AGAIN_LATER,
                TRY_AGAIN,
                NO,
                VERY_DOUBTFUL};
        int x = random.nextInt(array.length);
        if (x >= 0 && x <= 7) {
            return array[x];
        } else {
            return null;
        }
    }
}
