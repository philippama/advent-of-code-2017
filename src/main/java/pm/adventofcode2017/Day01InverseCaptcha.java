package pm.adventofcode2017;

import java.util.stream.IntStream;

public class Day01InverseCaptcha {
    public static long nextDigitMatchCount(String digits) {
        String[] chars = digits.split("");
        return IntStream.range(0, digits.length())
                        .filter(i -> chars[i].equals(chars[(i + 1) % chars.length]))
                        .map(i -> Integer.valueOf(chars[i]))
                        .sum();
    }

    public static void main(String[] args) {
        System.out.println(nextDigitMatchCount("1234"));
    }
}
