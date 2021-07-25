package week3;


// 9-3
/*
public class BalancedBinaryT {

}
class Solution {
    public int height(TreeNode root){
        if(root == null)
            return 0;
        int left_height = height(root.left);
        int right_height = height(root.right);
        return 1 + (left_height > right_height ? left_height : right_height);
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int left_height = height(root.left);
        int right_height = height(root.right);
        if(Math.abs(left_height - right_height) > 1){
            return false;
        }
        else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
}

*/