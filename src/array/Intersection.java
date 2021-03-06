package src.array;

import java.util.*;

/**
 * @PROJECT_NAME: algorithm
 * @USER: xiaohu
 * @DESCRIPTION： 两个数组的交集
 * @DATE: 2021/3/6 15:20
 */
public class Intersection {
    /**
     * 给定两个数组，编写一个函数来计算他们的交集
     * 示例 1:
     * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
     * 输出: [2,2]
     * 示例 2:
     * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * 输出: [4,9]
     * arr1 = [1,2,3,4,4,10]，arr2 = [1,2,3,9,10]
     * 输出：[1,2,3,10]
     */


    /**
     * 统计数字出现的次数
     * Map.getOrDefault(Object key, V defaultValue);
     * 如果在Map中存在key，则返回key所对应的的value。
     * 如果在Map中不存在key，则返回默认值。
     * 例如：
     * map.put(num, map.getOrDefault(num, 0) + 1);
     * 表示：
     * value默认从1开始，每次操作后num对应的value值加1
     */
    //无序的两个数组求交集
    public void solution1(int[] num1,int[] num2){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();//map集合
        for (int num : num1) {//统计出现的数字和相应的次数
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        //建立数组存储交集元素,比较两个数组的长短，以小的建立数组，不浪费空间
        int[] intersection = new int[Math.min(num1.length,num2.length)];
        int index = 0;
        for (int num : num2){//另一个数组中的元素和集合中的元素相比较，求出交集
            int count = map.getOrDefault(num,0);
            if (count > 0){
                intersection[index] = num;
                index++;
                count--;
                if (count > 0){
                    map.put(num,count);
                }else{
                    map.remove(num);
                }
            }
        }
        for (int i = 0; i<index;i++){
            System.out.print(intersection[i] + " ");
        }
    }

    //有序的两个数组求交集,初始时，两个指针分别指向两个数组的头部。
    // 每次比较两个指针指向的两个数组中的数字，如果两个数字不相等，
    // 则将指向较小数字的指针右移一位，如果两个数字相等，将该数字添加到答案，
    // 并将两个指针都右移一位
    public void solution2(int[] num1,int[] num2){
        Arrays.sort(num1);//数组排序
        Arrays.sort(num2);
        int[] intersection = new int[Math.min(num1.length,num2.length)];
        int i = 0,j = 0,index = 0;
        while(i < num1.length && j < num2.length){
            if (num1[i] == num2[j]){
                intersection[index++] = num1[i];
                i++;
                j++;
            }else if (num1[i] < num2[j]){
                i++;
            }else if (num1[i] > num2[j]){
                j++;
            }
        }
        for (int m = 0; m<index;m++){
            System.out.print(intersection[m] + " ");
        }
    }

    public static void main(String[] args) {
//       int[] num1 = {1,2,2,1};
//       int[] num2 = {2,2};
       int[] num1 = {1,2,3,4,4,10};
       int[] num2 = {1,2,3,9,10};
       Intersection intersection = new Intersection();
       intersection.solution1(num1,num2);
        System.out.println();
       intersection.solution2(num1,num2);
    }
}
