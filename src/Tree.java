package src;

import java.util.LinkedList;
import java.util.List;

/**
 * @PROJECT_NAME: algorithm
 * @USER: xiaohu
 * @DESCRIPTION：
 * @DATE: 2021/2/18 15:20
 */
public class Tree {

    public class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }

    public void  createTree(int[] a,List<TreeNode> nodeList){
        //将数组变成node节点
        for(int index=0;index<a.length;index++){
            if (a[index] != 0){
                TreeNode node = new TreeNode(a[index]);
                nodeList.add(node);
            }
        }
        //给所有父节点设定子节点
        for(int index=0;index<nodeList.size()/2-1;index++){
            //编号为n的节点他的左子节点编号为2*n 右子节点编号为2*n+1 但是因为list从0开始编号，所以还要+1
            //这里父节点有1（2,3）,2（4,5）,3（6,7）,4（8,9） 但是最后一个父节点有可能没有右子节点 需要单独处理
            if (a[index] != 0){
                nodeList.get(index).setLeft(nodeList.get(index*2+1));
                nodeList.get(index).setRight(nodeList.get(index*2+2));
            }
        }
        //单独处理最后一个父节点  因为它有可能没有右子节点
        int index = nodeList.size()/2-1;
        nodeList.get(index).setLeft(nodeList.get(index*2+1)); //先设置左子节点
        if(nodeList.size() % 2 == 1) { //如果有奇数个节点，最后一个父节点才有右子节点
            nodeList.get(index).setRight(nodeList.get(index * 2 + 2));
        }
    }

    public void checkCurrentNode(TreeNode node) {
        System.out.print(node.getVal() + " ");
    }

    //先序遍历
    public void preOrderTraversal(TreeNode node) {
        if (node == null)  //很重要，必须加上 当遇到叶子节点用来停止向下遍历
            return;
        checkCurrentNode(node);
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
    }

//    public static void main(String[] args) {
//        int[] a = new int[]{1,2,3,4,5,6,7,8,9};
//        Tree tree = new Tree();
//        List<TreeNode> nodeList = new LinkedList<>();
//        tree.createTree(a,nodeList);
//        TreeNode treeNode = nodeList.get(0);
//        tree.preOrderTraversal(treeNode);
//    }
}
