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
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        preorder(root, res);
        return res;
        
    }
    public void preorder(TreeNode node, List<Integer> res){
        if(node==null) return;
        res.add(node.val);
        preorder(node.left, res);
        preorder(node.right, res);
    }
}

// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> result= new ArrayList<>();
//         return preorder(root, result);
        
//     }
//     public List<Integer> preorder(TreeNode node, List<Integer> res){
//         if(node==null) return res;
//         res.add(node.val);
//         preorder(node.left, res);
//         preorder(node.right, res);
//         return res;
//     }
// }


// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> res= new ArrayList<>();
//         if(root==null) return res;
//         Stack<TreeNode> stack = new Stack<>();
//         stack.push(root);
//         while(!stack.isEmpty()){
//             TreeNode node= stack.pop();
//             res.add(node.val);
//             if(node.right!=null){
//                 stack.push(node.right);
//             }
//             if(node.left!=null){
//                 stack.push(node.left);
//             }

//         }
//         return res;

//     }
// }