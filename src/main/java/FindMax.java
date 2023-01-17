import java.util.Arrays;
public class FindMax {
    public static <T extends Comparable<T>> T  findMax(T... nums ) {
        Arrays.sort(nums);
        return nums[nums.length - 1];
        }
}
