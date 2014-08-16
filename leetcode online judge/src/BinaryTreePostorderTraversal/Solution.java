package BinaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.Stack;

;
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		Stack<TreeNode>stack=new Stack<TreeNode>();
		TreeNode cur;
		TreeNode pre=null;
		if(root==null)
		{
			return list;
		}
		stack.push(root);
		while(!stack.isEmpty())
		{
			cur=stack.peek();
			if((cur.left==null&&cur.right==null)||(pre!=null&&(pre==cur.left||pre==cur.right)))
			{
				list.add(stack.pop().val);//没有左右孩子打印结果。。。。。已经访问了左右孩子的情况
				pre=cur;
			}
			else
			{
				if(cur.right!=null)//这个方向不要搞混了。。。先右边后左边，防止出现
				{
					stack.push(cur.right);
				}
				if(cur.left!=null)
				{
					stack.push(cur.left);
				}
			}
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