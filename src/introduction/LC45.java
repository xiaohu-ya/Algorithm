package src.introduction;


/**
 * @PROJECT_NAME: algorithm
 * @USER: xiaohu
 * @DESCRIPTION： 二叉树的最大深度
 * @DATE: 2021/2/8 13:50
 */

public class LC45 {
    /**
     * 求给定二叉树的最大深度，
     * 最大深度是指树的根结点到最远叶子结点的最长路径上结点的数量。
     *
     * 输入
     * {1,2,3,4,#,#,5}
     * 返回值
     * 3
     */

//    public int maxDepth (TreeNode root) {
//        // write code here
//        if(root == null)return 0;
//        Queue<TreeNode> q = new LinkedList<TreeNode>();
//        q.add(root);
//        int n = 0;
//        int res = 0;
//        while(!q.isEmpty()){
//            n = q.size();
//            for(int i = 0;i<n;i++){
//                TreeNode node = q.poll();
//                if(node.left != null)q.add(node.left);
//                if(node.right != null)q.add(node.right);
//            }
//            res++;
//        }
//        return res;
//    }
}
