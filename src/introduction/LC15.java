package introduction;

/**
 * @PROJECT_NAME: algorithm
 * @USER: xiaohu
 * @DESCRIPTION：出现一次的数字
 * @DATE: 2020/11/16 15:13
 */
public class LC15 {

    //现在有一个整数类型的数组，数组中素只有一个元素只出现一次，其余的元素都出现两次
    //tip:你需要给出一个线性时间复杂度的算法，你能在不使用额外内存空间的情况下解决这个问题么？
    /**
     * ^为异或运算，计算时，先将两个数转为二进制，再进行计算，
     * 两个不同的数异或结果为1，两个相同的数异或后结果为0，
     *判断数组中的唯一，就用异或将数组元素进行比较即可
     */

    public void singleNumber (int[] A) {
        // write code here
        int temp = A[0];
//        for(int a:A){
//            temp^=a;
//        }
        for(int i=1;i<A.length;i++){
            temp^=A[i];
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        int a[] = {3,5,3,4,5};
        new LC15().singleNumber(a);
    }
}
