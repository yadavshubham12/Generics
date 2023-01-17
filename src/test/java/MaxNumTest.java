import org.junit.jupiter.api.Test;

class MaxNumTest {

    @Test
    public static void main(String[] args) {

        FindMax<Integer> maxInt = new FindMax<Integer>(15, 10, 7);
        Integer expected = 15;
        Integer result = maxInt.testMaximum();
        assert result.equals (expected);

        FindMax<Float> maxFloat = new FindMax<Float>(15.0f, 10.0f, 7.0f);
        float expected2 = 15.0f;
        float result2 = maxInt.testMaximum();
        assert result == (expected);

        FindMax<String> maxString = new FindMax<String>("Apple", "Peach", "Banana");
        String expected3 = "Apple";
        String result3 = maxString.testMaximum();
        assert result3.equals(expected3);
    }
}