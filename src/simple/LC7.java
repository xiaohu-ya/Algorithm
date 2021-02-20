package src.simple;

import src.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @PROJECT_NAME: algorithm
 * @USER: xiaohu
 * @DESCRIPTION： 求二叉树的前序遍历
 * @DATE: 2021/2/20 21:47
 */
public class LC7 {

    /**
     * 树：{1,2,3,4,5,6,7,8,9}
     * 先序遍历：
     * 1 2 4 8 9 5 3 6 7
     * 中序遍历：
     * 8 4 9 2 5 1 6 3 7
     * 后序遍历：
     * 8 9 4 5 2 6 7 3 1
     * 广度优先遍历：
     * 1 2 3 4 5 6 7 8 9
     * 深度优先遍历：
     * [[1, 2, 4, 8], [1, 2, 4, 9], [1, 2, 5], [1, 3, 6], [1, 3, 7]]
     */
    public void preorderTraversal (Tree.TreeNode treeNode) {
        // write code here
        if (treeNode == null){
            return ;
        }
        System.out.println("先序遍历：");
        Stack<Tree.TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        while (!stack.isEmpty()){
            Tree.TreeNode node = stack.pop();
            System.out.print(node.val+" ");
            if (node.right != null){//栈先进后出
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        int[] a = new int[]{1,0,2,3};//数组形式输入树的节点元素
        List<Tree.TreeNode> list = new LinkedList<>();//定义节点类型的list集合，用来存储树的节点
        tree.createTree(a,list);//创建树
        Tree.TreeNode treeNode = list.get(0);//将集合的首元素，赋给根节点（树）
        new LC7().preorderTraversal(treeNode);
    }
}
