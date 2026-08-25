package mod1.lev17.DateApi.task8;

/*
 классе Solution реализуй три метода:

в методе getMaxFromMilliseconds верни максимальный Instant, который можно получить с помощью метода
ofEpochMilli(long milliseconds);

в методе getMaxFromSeconds верни максимальный Instant, который можно получить с помощью метода
ofEpochSecond(long seconds);

в методе getMaxFromSecondsAndNanos верни максимальный Instant, который можно получить с помощью метода
ofEpochSecond(long seconds, long nanos).

 */

import java.time.Instant;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        return Instant.ofEpochMilli(Long.MAX_VALUE);
    }

    static Instant getMaxFromSeconds() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
    }

    static Instant getMaxFromSecondsAndNanos() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), 999999999);
    }
}
