package 代码随想录._01数组;

/**
 * 704.二分查找
 *
 * @author wuzexin
 * @created 2022/4/11 10:16
 */
public class _704_二分查找 {

    public static int search (int[] nums, int target) {

        if (nums[0] > target || nums[nums.length - 1] < target) {
            return -1;
        }

        // 所给的数组nums为有序的(升序)
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            // int mid = (right + left) >> 1;
            // 用下面这种方式可以防止数据过大是溢出
            int mid = left + ((right - left) >> 1);

            // 如果mid下标对应的数大于target, 则目标数字在mid左边
            if (nums[mid] > target) {
                right = mid - 1;
                // 如果mid下标对应的数小于target，则目标数在mid右边
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return  -1;
    }

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        int target = 3;

        int ans = search(nums, target);
        System.out.println(ans);
    }
}
