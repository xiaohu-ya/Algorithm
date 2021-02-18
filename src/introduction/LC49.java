package src.introduction;

import src.Tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @PROJECT_NAME: algorithm
 * @USER: xiaohu
 * @DESCRIPTION： 判断二叉树是否相等
 * @DATE: 2021/2/18 15:14
 */
public class LC49 {

    /**
     *
     * 题目描述
     * 给出两个二叉树，请写出一个判断两个二叉树是否相等的函数。
     * 判断两个二叉树相等的条件是：两个二叉树的结构相同，并且相同的节点上具有相同的值。
     * 示例1
     * 输入
     * 复制
     * {1},{1}
     * 返回值
     * true
     * 示例2
     * 输入
     * {1,2},{1,#,2}
     * 返回值
     * false
     * @param p TreeNode类
     * @param q TreeNode类
     * @return bool布尔型
     */

//    public boolean isSameTree (Tree.TreeNode p,Tree.TreeNode q) {
//        // 两棵树相等的条件是 根节点的值相同，同时左右子树也相同
//        if(p == null && q == null)  return true;
//        if(p == null || q == null)  return false;
//        if (p.val != q.val) return false;
//        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        int[] a = new int[]{1,2,3,4,5,6,7,8,9};
        int[] b = new int[]{1,2,3,4,5,6,7,8,9};
        List<Tree.TreeNode> list1 = new LinkedList<>();
        tree.createTree(a,list1);
        Tree.TreeNode treeNode1 = list1.get(0);
        List<Tree.TreeNode> list2 = new LinkedList<>();
        tree.createTree(b,list2);
        Tree.TreeNode treeNode2 = list1.get(0);
        tree.preOrderTraversal(treeNode2);
    }
}
