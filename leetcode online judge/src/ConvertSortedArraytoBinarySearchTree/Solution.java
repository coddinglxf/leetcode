package ConvertSortedArraytoBinarySearchTree;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("fsd");
	}
	public TreeNode sortedArrayToBST(int[] num)
	{
		if(num.length==0)
		{
			return null;
		}
		return get(num, 0, num.length-1);
	}
	public TreeNode get(int num[],int i,int j)
	{
        if(i>j)
        	return null;
        int mid=(i+j)/2;
        TreeNode node=new TreeNode(num[mid]);
        if(i==j)
        {
        	return node;
        }
        node.left=get(num, i, mid-1);
        node.right=get(num, mid+1, j);
		return node;
	}
}
 class TreeNode
 {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	      
 }