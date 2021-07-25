package week3;

import java.util.*;


// 10-2
/*
public class IncreaingOrderST {

}

class Solution {
    
    List<Integer> list = new ArrayList<>();
    
    public TreeNode increasingBST(TreeNode root) {
        DFS(root);
        Collections.sort(list);
        
        TreeNode node = new TreeNode(list.get(0));
        list.remove(0);
        makeTree(node, 0);
        return node;
    }
    
    public void makeTree(TreeNode root, int index){
        if(index==list.size()) return;
        TreeNode node = new TreeNode(list.get(index));
        root.right = node;
        makeTree(root.right,index+1);
    }
     
    public void DFS(TreeNode root){
        if(root==null) return;
        else list.add(root.val);
        
        if(root.left!=null) DFS(root.left);
        if(root.right!=null) DFS(root.right);
    }
}
*/