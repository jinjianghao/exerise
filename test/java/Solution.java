package test.java;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 *     }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {

        int height = getHeight(root);

        if(height == -1) {
            return false;
        }

        return true;
    }

    int getHeight(TreeNode root) {

        if(root == null) {
            return 0;
        }
        //左子树高度
        int left = getHeight(root.left);
        if(left == -1) {
            return -1;
        }
        //右子树高度
        int right = getHeight(root.right);
        if(right == -1) {
            return -1;
        }
        //左右子树高度差
        int gap = Math.abs(left-right);
        if(gap >1) {
            return -1;
        }
        //计算当前节点的高度=取左右子树中最高高度+1
        return 1 + Math.max(left,right);

    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }


    public void test(){
    }
}
