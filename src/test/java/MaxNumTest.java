import org.junit.jupiter.api.Test;

class MaxNumTest {

    @Test
    public static void main(String[] args) {

        Integer num1 = 15;
        Integer num2 = 10;
        Integer num3 = 7;
        Integer expected = 15;
        Integer result = FindMax.findMax(num1, num2, num3);
        assert result.equals (expected);

        float num4 = 10.0f;
        float num5 = 15.0f;
        float num6= 7.0f;
        float expected2 = 15.0f;
        float result2 = FindMax.findMax(num1, num2, num3);
        assert result2 == (expected2);

        String str1 = "Apple";
        String str2 = "Peach";
        String str3 = "Banana";
        String expected3 = "Apple";
        String result3 = FindMax.findMax(str1, str2, str3);
        assert result3.equals (expected3);
    }
}