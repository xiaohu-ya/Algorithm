package src.array;

/**
 * @PROJECT_NAME: algorithm
 * @USER: xiaohu
 * @DESCRIPTION： 移除元素
 * @DATE: 2021/3/10 18:38
 */


/**
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，
 * 返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 示例 1:
 * 给定 nums = [3,2,2,3], val = 3,
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {

    public int remove(int[] a,int val){
        int i = 0;
        for (int j = 0;j<a.length;j++){
            if (a[j] != val){
                a[i] = a[j];
                i++;
            }
        }
        return i;
    }

    /**
     *删除排序数组中的重复项
     *给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次。
     * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
     * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
     */
    public int solution(int[] a){
        int i = 0;
        for (int j = 1;j<a.length;j++){
            if (a[j] != a[i]){
                i++;
                a[i] = a[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0,0,1,1,1,2,2,3,3,4};
//        int val = 3;
//        int length = new RemoveElement().remove(a,val);
        int length = new RemoveElement().solution(a);
        System.out.println(length);
    }
}
