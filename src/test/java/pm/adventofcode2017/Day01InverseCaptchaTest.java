package pm.adventofcode2017;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Day01InverseCaptchaTest {
    @Test
    public void countsNextDigitMatches() {
        assertThat(Day01InverseCaptcha.nextDigitMatchCount("1122")).isEqualTo(3);
        assertThat(Day01InverseCaptcha.nextDigitMatchCount("1234")).isEqualTo(0);
    }

    @Test
    public void countsNextDigitMatchesWhenLastMatchesFirst() {
        assertThat(Day01InverseCaptcha.nextDigitMatchCount("1111")).isEqualTo(4);
        assertThat(Day01InverseCaptcha.nextDigitMatchCount("912121239")).isEqualTo(9);
    }
}
