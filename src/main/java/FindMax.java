import java.util.Arrays;
public class FindMax {
    public static <T extends Comparable<T>> T  findMax(T... nums ) {
        Arrays.sort(nums);
         T max = nums[nums.length - 1];
        printMax(max);
        return max;
        }
        public static<T> void printMax(T max){
            System.out.println("The maximum element is: " + max);
        }
}
