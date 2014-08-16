package BinaryTreeZigzagLevelOrderTraversal;

import java.util.ArrayList;
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
{
   Solution s=new Solution();
   TreeNode root=new TreeNode(1);
   root.left=new TreeNode(2);
   root.right=new TreeNode(3);
   root.left.left=new TreeNode(4);
   root.right.right=new TreeNode(5);
   s.zigzagLevelOrder(root);
	}
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root)
    {

		ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
		if(root==null)
		{
			return list;
		}
		ArrayList<TreeNode>temp1=new ArrayList<TreeNode>();
		temp1.add(root);
		ArrayList<TreeNode>temp2=new ArrayList<TreeNode>();
		boolean flags=true;
		while(temp1.size()>0)
		{
			ArrayList<Integer>intlist=new ArrayList<Integer>();
			
			if(flags)
			{   
				for(int i=0;i<temp1.size();i++)
				{
					intlist.add(temp1.get(i).val);
				}
				flags=false;
			}
			else
			{
				for(int i=temp1.size()-1;i>=0;i--)
				{
					intlist.add(temp1.get(i).val);
				}
				flags=true;
			}
//			for(Integer index:intlist)
//			{
//				System.out.print(index+" ");
//			}
//			System.out.println("!!!!!!!!!!!");
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
			temp1=temp2;//指向了temp2的引用。
			temp2=new ArrayList<TreeNode>();//重新开辟了一个内存，相当于将原来的内存让出来了，所以对于temp2的操作不会影响其他
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