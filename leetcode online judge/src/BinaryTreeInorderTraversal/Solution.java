package BinaryTreeInorderTraversal;

import java.util.ArrayList;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeNode root=new TreeNode(1);
      root.right=new TreeNode(2);
      root.right.left=new TreeNode(3);
      ArrayList<Integer>list=new Solution().inorderTraversal(root);
      for(Integer index:list)
      {
    	  System.out.println(index);
      }
	}
	ArrayList<Integer>list=new ArrayList<Integer>();
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		// IMPORTANT: Please reset any member data you declared, as
		// the same Solution instance will be reused for each test case.
         interval(root);
         return list;
	}
	public void interval(TreeNode root)
	{
		if(root==null)
			return;
		interval(root.left);
		list.add(root.val);
		interval(root.right);
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}