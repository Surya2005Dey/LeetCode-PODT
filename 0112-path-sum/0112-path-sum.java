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
 * }
 */
 //simple code
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return check(root, 0,targetSum);
    }
    public boolean check(TreeNode node, int sum , int tsum){
        if(node==null) return false;
        if((sum+node.val)==tsum && node.left==null && node.right==null) return true;
        if((sum+node.val)!=tsum && node.left==null && node.right==null) return false;
        return check(node.left, sum+node.val,tsum) || check(node.right, sum+node.val, tsum);
    }
}


//code improve version
// class Solution {
//     public boolean hasPathSum(TreeNode root, int targetSum) {
//         if(root==null) return false;
//          if(root.left==null && root.right==null) return root.val==targetSum;
//         return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
//     }
    
// }