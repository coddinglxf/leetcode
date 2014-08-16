package InsertionSortList;


public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public ListNode insertionSortList(ListNode head)
    {

		ListNode cur=head;
		while(cur!=null)
		{
			ListNode run=cur.next;//Ïàµ±ÓÚj=i+1£»
			while(run!=null)
			{
				if(cur.val>run.val)
				{
					int temp=run.val;
					run.val=cur.val;
					cur.val=temp;
				}
				run=run.next;
			}
			cur=cur.next;
		}
        return head;
    }
    class ListNode
    {
    	int val;
    	ListNode next;
    	public ListNode(int data) {
    		this.val=data;
    		this.next=null;
    	}
    }
}
