package PathSum;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      TreeNode root=new TreeNode(1);
      //root.left=new TreeNode(2);
      Solution s=new Solution();
      System.out.println( s.hasPathSum(root, 0));;
	}
	public static int nil=(int)Math.pow(2, 31);
	int val;
	public boolean hasPathSum(TreeNode root, int sum)
	{
		if(root==null)
		{
			return false;
		}
		val=nil;
		backtrack(root, 0, sum);
		return this.val==sum;
	}
	public void backtrack(TreeNode root,int cur,int sum)
	{
		if(root==null)
		{
			return;
		}
		if(root.left==null&&root.right==null)
		{
			if(cur+root.val==sum)
			{
				val=sum;
			}
			return;
		}
		if(root.left!=null)
		{
			backtrack(root.left, cur+root.val, sum);
		}
		if(root.right!=null)
		{
			backtrack(root.right, cur+root.val, sum);
		}
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
