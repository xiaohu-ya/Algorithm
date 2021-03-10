package src.array;

/**
 * @PROJECT_NAME: algorithm
 * @USER: xiaohu
 * @DESCRIPTION： 旋转数组
 * @DATE: 2021/3/10 15:38
 */

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 示例 1:
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 */
public class RotateArray {

    //方法一：
    /*
    若我们需要将数组中的元素向右移动 k 个位置，
    那么 k%l (l为数组长度) 的尾部元素会被移动到头部，
    剩下的元素会被向后移动。
    那么只需要将所有元素反转，
    然后反转前 k 个元素，再反转后面l-k个元素，
    就能得到想要的结果。*/
    public void rotate(int[] a,int k,int l){
        int temp = 0;
        for (int i = 0;i<k/2;i++){
            temp = a[i];
            a[i] = a[k-1];
            a[k-1] = temp;
        }
        int temp2 = 0;
        int length = l-k;
        for (int i = l/2;i<=length;i++,l--){
            temp2 = a[i];
            a[i] = a[l-1];
            a[l-1] = temp2;
        }
        for (int x : a){
            System.out.print(x+" ");
        }
    }

    //将数组中的元素倒置
    public static int[] invertArray(int[] a,int l){
        int temp = 0;
        for (int i = 0;i<=l/2;i++,l--){
            temp = a[i];
            a[i] = a[l-1];
            a[l-1] = temp;
        }
        return a;
    }


    //方法二：
    //使用额外的数组来将每个数组放到对应位置，n 表示数组的长度，
    // 我们遍历原数组，将原数组下标为i的元素放至新数组下标为 (i+k) mod n的位置，
    // 最后将新数组拷贝至原数组即可。
    public void solution(int[] a,int k,int l){
        int[] arr = new int[l];
        for (int i = 0;i < l;i++){
            arr[(i+k)%l] = a[i];
        }
        System.out.println();
        for (int x : arr){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{-1,-100,3,99};
        int k =2;
        int l =a.length;
//        a = RotateArray.invertArray(a,l);
//        new RotateArray().rotate(a,k,l);
        new RotateArray().solution(a,k,l);
    }

}
