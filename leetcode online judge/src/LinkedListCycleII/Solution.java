package LinkedListCycleII;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int nil = (int) Math.pow(2, 31);

	public ListNode detectCycle(ListNode head) {

		if (head == null)
			return null;
		ListNode temp = head;
		temp.val = nil;
		while (temp.next != null) 
		{
			temp = temp.next;
			if (temp.val == nil)
			{
				return temp;
			} else 
			{
				temp.val = nil;
			}
		}
		return null;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}