package 代码随想录._01数组;

/**
 * 27.移除元素
 *
 * @author wuzexin
 * @created 2022/4/11 10:46
 */

public class _27_移除元素 {

    public static int removeElement(int[] nums, int val) {

        // 给出的数据范围是 0<=nums.length<=100 ， 先处理边界
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 用index记录当前位置
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[ans++] = nums[i];
            }
        }

        // 返回数组移除元素后数组的长度
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
