public class FindMax<T extends  Comparable<T>> {
    private T num1, num2, num3;

    public FindMax(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public T testMaximum() {
        T max = num1;
        if (num2.compareTo(max) > 0){
            max = num2;
        }
        if (num3.compareTo(max) > 0){
            max = num3;
        }
        return max;
    }
    public static <T extends Comparable<T>> T testMaximum(T num1, T num2, T num3) {

        T max = num1;
        if (num2.compareTo(max) > 0){
            max = num2;
        }
        if (num3.compareTo(max) > 0){
            max = num3;
        }
        return max;
    }
}
