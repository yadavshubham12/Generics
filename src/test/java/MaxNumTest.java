import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumTest {

    @Test
   public static void findMax() {
        float num1 = 15.0f;
        float num2 = 10.0f;
        float num3 = 7.0f;
        float expected = 15.0f;
        float result = MaxNum.findMax(num1, num2, num3);
        assert result == (expected);

        num1 = 7.0f;
        num2 = 15.0f;
        num3 = 10.0f;
        expected = 15.0f;
        result = MaxNum.findMax(num1, num2, num3);
        assert result == (expected);

        num1 = 10.0f;
        num2 = 7.0f;
        num3 = 15.0f;
        expected = 15.0f;
        result = MaxNum.findMax(num1, num2, num3);
        assert result == (expected);
    }
}