package SumRoottoLeafNumbers;
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	    int sum=0;
		public int sumNumbers(TreeNode root) 
		{
	      sumK(root);
	      interval(root);
	      return sum;
	    }
		public void interval(TreeNode root)
		{
			if(root==null)
			{
				return;
			}
			interval(root.left);
			if(root.left==null&&root.right==null)
			{
				sum=sum+root.val;
			}
			interval(root.right);
		}
	   public void sumK(TreeNode root)
	   {
	       if(!(root.left==null&&root.right==null))
	       {
	    	   return;
	       }
	       else if(root.left==null&&root.right!=null)
	       {
	    	   root.right.val=root.right.val+root.val*10;
	       }
	       else if(root.left!=null&&root.right==null)
	       {
	    	   root.left.val=root.left.val+root.val*10;
	       }
	       else
	       {
	    	   root.right.val=root.right.val+root.val*10;
	    	   root.left.val=root.left.val+root.val*10;
	    	   sumK(root.right);
	    	   sumK(root.left);
	       }
	   }
		public class TreeNode {
			int val;
			TreeNode left;
			TreeNode right;
			TreeNode(int x) {
				val = x;
			}
		}
}
