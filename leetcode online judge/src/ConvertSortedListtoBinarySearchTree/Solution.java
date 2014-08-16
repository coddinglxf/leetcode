package ConvertSortedListtoBinarySearchTree;
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   public TreeNode sortedListToBST(ListNode head) {
	        // IMPORTANT: Please reset any member data you declared, as
	        // the same Solution instance will be reused for each test case.
	        return getroot(head, 1, getlength(head));
	    }
	   public TreeNode  getroot(ListNode head,int i,int j)
	   {
		   if(i>j)
			   return null;
		   int mid=(i+j)/2;
		   TreeNode node=new TreeNode(getmid(head, mid));
		   if(i==j)
		   {
			   return node;
		   }
		   node.left=getroot(head, i, mid-1);
		   node.right=getroot(head, mid+1, j);
		   return node;
	   }
	   public int getlength(ListNode head)
	   {
		   ListNode temp=head;
		   int sum=0;
		   while(temp!=null)
		   {
			   sum++;
			   temp=temp.next;
		   }
		   return sum;
	   }
	   public int getmid(ListNode head,int mid)
	   {
		   int i=1;
		   ListNode temp=head;
		   while(i<mid)
		   {
			   i++;
			   temp=temp.next;
		   }
		   return temp.val;
	   }
}
class TreeNode
{
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	      
}
 class ListNode {
	     int val;
	      ListNode next;
	      ListNode(int x) { val = x; next = null; }
	  }