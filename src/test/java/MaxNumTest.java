import org.junit.jupiter.api.Test;

class MaxNumTest {

    @Test
    public static void main(String[] args) {

        String str1 = "Apple";
        String str2 = "Peach";
        String str3 = "Banana";
        String expected = "Apple";
        String result = FindMax.findMax(str1, str2, str3);
        assert result.equals (expected);

        str1 = "Peach";
        str2 = "Apple";
        str3 = "Banana";
        expected = "Apple";
        result = FindMax.findMax(str1, str2, str3);
        assert result.equals (expected);

        str1 = "Peach";
        str2 = "Banana";
        str3 = "Apple";
        expected = "Apple";
        result = FindMax.findMax(str1, str2, str3);
        assert result.equals (expected);
    }
}