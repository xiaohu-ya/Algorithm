package src.dynamicPlanning;

/**
 * @PROJECT_NAME: algorithm
 * @USER: xiaohu
 * @DESCRIPTION： 爬楼梯
 * @DATE: 2021/3/25 10:23
 */

import java.util.Scanner;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ **注意：**给定 n 是一个正整数。
 * 示例 1：
 * 输入： 2   输出： 2  解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 * 输入： 3   输出： 3  解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 * 解析：
 * 上 1 阶台阶：有1种方式。
 * 上 2 阶台阶：有1+1和2两种方式。
 * 上 3 阶台阶：到达第3阶的方法总数就是到第1阶和第2阶的方法数之和。
 * 上 n 阶台阶，到达第n阶的方法总数就是到第 (n-1) 阶和第 (n-2) 阶的方法数之和。
 */
public class climbStairs {

    /**
     *n表示你到达的台阶数，用dp[n]来表示到达第n阶的方法总数
     */
    public void solution(int n){
        int[] dp = new int[50];
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4;i <= n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1;i <= n;i++){
            int m = scanner.nextInt();
            new climbStairs().solution(m);
        }
    }
}
