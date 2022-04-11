package 代码随想录._01数组;


import java.util.Arrays;

/**
 * 977.有序数组的平方
 *
 * @author wuzexin
 * @created 2022/4/11 10:55
 */
public class _977_有序数组的平方 {

    public static int[] sortedSquares(int[] nums) {

        // 双指针法
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        int[] ans = new int[nums.length];

        // -4 -1 0 3 10
        // 16 1 0 9 100
        while (left <= right) {
            int leftNum = nums[left] * nums[left];
            int rightNum = nums[right] * nums[right];

            if (leftNum < rightNum) {
                ans[index--] = rightNum;
                right --;
            } else {
                ans[index--] = leftNum;
                left ++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {-4, -1, 0, 3, 10};

        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}
