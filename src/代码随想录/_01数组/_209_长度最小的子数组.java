package 代码随想录._01数组;

/**
 * 209.长度最小的子数组
 *
 * @author wuzexin
 * @created 2022/4/11 11:12
 */
public class _209_长度最小的子数组 {

    public static int minSubArrayLen(int target, int[] nums) {

        // 1 2 3 4 5
        // 1 3 6 10 15
        // 算出数组前缀和
        int[] arr = new int[nums.length + 1];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = nums[i - 1] + arr[i - 1];
        }

        if (arr[arr.length - 1] < target) {
            return 0;
        }

        int left = 0;
        int right = 1;

        int ans = arr.length - 1;

        while (right < arr.length) {

            if (arr[right] - arr[left] >= target) {
                ans = right - left < ans ? right - left : ans;
                left ++;
            } else {
                right ++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int target = 11;
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(minSubArrayLen(target, nums));
    }
}
