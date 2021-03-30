package src.dynamicPlanning;

/**
 * @PROJECT_NAME: algorithm
 * @USER: xiaohu
 * @DESCRIPTION： 最大子序和
 * @DATE: 2021/3/30 16:48
 */

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素）,
 * 返回其最大和。
 * 示例:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class maxSubArray {

    public int solution(int[] num){
            if (num.length < 1)
            return 0;
        //定义dp[]数组，dp[i]表示num[i]结尾时为连续数组的最大和
        int[] dp = new int[num.length];
        dp[0] = num[0];
        int result = num[0];
        for (int i = 1; i < num.length; i++){
            /**如果要得到 dp[i]，那么 nums[i] 一定会被选取。
            /并且 dp[i] 所表示的连续子序列与 dp[i-1] 所表示的连续子序列很可能就差一个 nums[i] 。
            /即：dp[i] = dp[i-1]+nums[i] , if (dp[i-1] >= 0)
            很有可能 dp[i-1] 本身是一个负数。那这种情况的话，如果 dp[i] 通过 dp[i-1]+nums[i] 来推导，
            那么结果其实反而变小了，因为我们 dp[i] 要求的是最大和。所以在这种情况下，
            如果 dp[i-1] < 0，那么 dp[i] 其实就是 nums[i] 的值。即
            dp[i] = nums[i] , if (dp[i-1] < 0)
             **/
            dp[i] = Math.max(dp[i-1]+num[i],num[i]);
            result = Math.max(dp[i],result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new maxSubArray().solution(num));
    }
}
