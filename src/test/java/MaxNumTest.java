import org.junit.jupiter.api.Test;

class MaxNumTest {

    @Test
    public static void main(String[] args) {

        Integer expected = 15;
        Integer result = FindMax.findMax(15, 10, 7, 12, 5, 18);
        assert result.equals (expected);


        float expected2 = 15.0f;
        float result2 = FindMax.findMax(15.0f, 10.0f, 7.0f, 12.0f, 5.0f, 18.0f);
        assert result2 == (expected2);

        String expected3 = "Orange";
        String result3 = FindMax.findMax("Apple", "Peach", "Banana", "Orange", "Grape");
        assert result3.equals (expected3);
    }
}