package 代码随想录._01数组;

import java.util.Arrays;

/**
 * 59.螺旋矩阵II
 *
 * @author wuzexin
 * @created 2022/4/11 11:51
 */
public class _59_螺旋矩阵II {
    /*
        top/right/bottom/left
        1 2 3
        8 9 4
        7 6 5
     */
    public static int[][] generateMatrix (int n) {

        int[][] ans = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int index  = 1;

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                ans[top][i] = index++;
            }
            top ++;

            for (int i = top; i <= bottom; i++) {
                ans[i][right] = index ++;
            }
            right --;

            for (int i = right; i >= left; i--) {
                ans[bottom][i] = index ++;
            }
            bottom --;

            for (int i = bottom; i >= top; i-- ) {
                ans[i][left] = index ++;
            }
            left ++;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] ans = generateMatrix(3);

        for (int[] arr : ans) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
