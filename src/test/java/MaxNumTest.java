import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumTest {

    @Test
   public static void findMax() {
        Integer num1 = 15;
        Integer num2 = 10;
        Integer num3 = 7;
        Integer expected = 15;
        Integer result = MaxNum.findMax(num1, num2, num3);
        assert result.equals(expected);

        num1 = 7;
        num2 = 15;
        num3 = 10;
        expected = 15;
        result = MaxNum.findMax(num1, num2, num3);
        assert result.equals(expected);

        num1 = 10;
        num2 = 7;
        num3 = 15;
        expected = 15;
        result = MaxNum.findMax(num1, num2, num3);
        assert result.equals(expected);

    }
}