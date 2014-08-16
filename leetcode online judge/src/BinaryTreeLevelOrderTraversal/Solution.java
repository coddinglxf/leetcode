package BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Solution solution=new Solution();
      TreeNode root=new TreeNode(12);
      root.right=new TreeNode(13);
      root.left=new TreeNode(14);
      solution.levelOrder(root);
	}

	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) 
	{
		ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
		if(root==null)
		{
			return null;
		}
		ArrayList<TreeNode>temp1=new ArrayList<TreeNode>();
		temp1.add(root);
		ArrayList<TreeNode>temp2=new ArrayList<TreeNode>();
		while(temp1.size()>0)
		{
			ArrayList<Integer>intlist=new ArrayList<Integer>();
			for(TreeNode node:temp1)
			{
				intlist.add(node.val);
			}
			System.out.println("add");
			list.add(intlist);
			for(TreeNode node:temp1)
			{
				if(node.left!=null)
				{
					temp2.add(node.left);
				}
				if (node.right!=null)
				{
					temp2.add(node.right);
				}
			}
			System.out.println(temp2.size());
			temp1=temp2;
			temp2=new ArrayList<TreeNode>();
		}
		return list;
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