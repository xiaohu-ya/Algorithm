package src.array;

import java.util.LinkedList;

/**
 * @PROJECT_NAME: algorithm
 * @USER: xiaohu
 * @DESCRIPTION： 删除链表第N个节点
 * @DATE: 2021/3/22 15:56
 */

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * 给定的 n 保证是有效的。
 */
public class removeNthFromEnd {

    public void solution(int m,int[] a){
        LinkedList<Integer> list  = new LinkedList<>();
        for (int x : a){
            list.add(x);
        }
        list.remove(m);
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6};
        int m = 2;
        new removeNthFromEnd().solution(a.length-m,a);
    }
}
