package src.introduction;

import java.util.ArrayList;

/**
 * @PROJECT_NAME: algorithm
 * @USER: xiaohu
 * @DESCRIPTION： 螺旋矩阵
 * @DATE: 2021/1/11 15:07
 */
public class LC96 {

    /**
     * 本题知识点：数组
     * 题目描述
     * 给定一个m x n大小的矩阵（m行，n列），按螺旋的顺序返回矩阵中的所有元素。
     * 示例
     * 输入：[[1,2,3],[4,5,6],[7,8,9]]
     * 输出：[1,2,3,6,9,8,7,4,5]
     *
     *     left      right
     *      0  1   2  3
     * ***********************
     * 0 *  1  2   3   4    top
     * 1 *  5  6   7   8
     * 2 *  9  10  11  12   bottom
     *
     * 随便举一个m*n的矩阵，图示能够清晰理解
     */

    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int rowNum = matrix.length;
        if (rowNum == 0)
            return list;
        int colNum = matrix[0].length;
        int top = 0,bottom = rowNum-1;
        int left = 0,right = colNum-1;
        while (top < (rowNum+1)/2 && left < (colNum+1)/2){
            //上面，从左到右
            for (int i = top;i <= right;i++){
                 list.add(matrix[top][i]);
            }
            //右边，从上到下
            for (int i = top+1;i <= bottom;i++){
                list.add(matrix[i][right]);
            }
            //下面，从右到左
            for (int i = right-1;i >=left && top!=bottom;i--){
                list.add(matrix[bottom][i]);
            }
            //左边，从下到上
            for (int i = bottom-1;i >= top+1 && left!=right;i--){
                list.add(matrix[i][left]);
            }
            ++top;
            --bottom;
            ++left;
            --right;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] martix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(new LC96().spiralOrder(martix));
    }
}
