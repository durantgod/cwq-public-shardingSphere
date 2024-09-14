/**
 * @author Durant
 * @date 2024/9/13/周五
 * @desc 当前类的主要功能
 * @since 1.0.0
 */
public class Test {
    public static int findOdd(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // 累积异或
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 3, 1, 3};
        System.out.println("The odd number is: " + findOdd(nums));
    }
}
