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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        postorder(root, result);
        return result;
    }
    public void postorder(TreeNode node, List<Integer> res){
        if(node==null) return ;
        postorder(node.left, res);
        postorder(node.right, res);
        res.add(node.val);
    }
}

// //postorder>> left->right->root
// // root->right->left then reverse the list
// //so we have to do in stack is root->left->right  because of LIFO rule

// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> result =new ArrayList<>();
//         if(root==null) return result;
//         Stack<TreeNode> stack= new Stack<>();
//         stack.push(root);
//         while(!stack.isEmpty()){
//             TreeNode node= stack.pop();
//             result.add(node.val);
//             if(node.left!=null){
//                 stack.push(node.left);
//             }
//             if(node.right!=null){
//                 stack.push(node.right);
//             }
//         }
//         Collections.reverse(result); // preorder to postorder by doing reverse the list
//         return result;
//     } 
// }