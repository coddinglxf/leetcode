package BinaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
		// IMPORTANT: Please reset any member data you declared, as
		// the same Solution instance will be reused for each test case.
		Stack<ArrayList<Integer>> stack = new Stack<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
		if(root==null)
		{
			return list;
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
			stack.push(intlist);
			for(TreeNode node:temp1)
			{
				if(node.left!=null)
				{
					temp2.add(node.left);
				}	
				 if(node.right!=null)
				{
					temp2.add(node.right);
				}
			}
			temp1=temp2;
			temp2=new ArrayList<TreeNode>();
		}
		while(!stack.isEmpty())
		{
			list.add(stack.pop());
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