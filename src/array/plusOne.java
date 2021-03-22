package src.array;

/**
 * @PROJECT_NAME: algorithm
 * @USER: xiaohu
 * @DESCRIPTION： 加一
 * @DATE: 2021/3/22 14:04
 */
public class plusOne {

    /**
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。你可以假设除了整数 0 之外，这个整数不会以零开头。
     * 示例 1:
     * 输入: [1,2,3]
     * 输出: [1,2,4]
     * 解释: 输入数组表示数字 123。
     * 示例 2:
     * 输入: [4,3,2,1]
     * 输出: [4,3,2,2]
     * 解释: 输入数组表示数字 4321。
     *
     * 解析：
     * 普通情况，除9之外的数字加1。
     * 特殊情况，9加1。（因为9加1需要进位）
     * 如果是[9,9]类似的情况，需继续进位，数组变成[1,0,0]
     */

    public int[] solution(int[] a){
        int temp =0;
        for (int i = a.length-1;i >= 0;i--){
            a[i]++;
            if (a[i] % 10 != 0){
                return a;
            }else if (a[i] % 10 == 0){
                a[i] = 0;
            }
            temp = i;
        }
        if (a[temp] == 0){
            int[] b = new int[a.length+1];
            b[0] = 1;
            for (int i = 1,j=0;i<a.length+1;i++,j++){
                b[i] = a[j];
            }
            return b;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[]{9,9};
        a = new plusOne().solution(a);
        for (int x:a){
            System.out.print(x+" ");
        }
    }
}
