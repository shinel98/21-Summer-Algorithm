package week3;

// 9-4
/*
public class MergeTwoBT {

}

class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null) return null;
        TreeNode root = new TreeNode();
        DFS(root,t1);
        DFS(root,t2);
        return root;
    }
    
    public void DFS(TreeNode root, TreeNode t1) {
        if(t1==null) return;
        else root.val += t1.val;
        
        if(t1.left!=null) {
            if(root.left==null){
                root.left=new TreeNode();
            }
            DFS(root.left,t1.left);
        }
        
        if(t1.right!=null){
            if(root.right==null){
                root.right=new TreeNode();
            }
            DFS(root.right,t1.right);
        }
    }
}

*/