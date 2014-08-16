package MergeTwoSortedLists;
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(3);
        ListNode l2=new ListNode(2);
        l2.next=new ListNode(4);
        Solution solution=new Solution();
        solution.mergeTwoLists(l1, l2);
	}
	   public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
	   {
	        // Note: The Solution object is instantiated only once and is reused by each test case.
	        
	        mylist list=new mylist();
	        ListNode temp1=l1;
	        ListNode temp2=l2;
	        while(temp1!=null&&temp2!=null)
	        {
	        	if(temp1.val<=temp2.val)
	        	{
	        		System.out.println("case 1");
	               list.add(temp1.val);
	               temp1=temp1.next;
	        	}
	        	else
	        	{
	        		System.out.println("case 2");
	        		list.add(temp2.val);
                   temp2=temp2.next;
	        	}
	        }
	        while(temp1!=null)
	        {
	        	System.out.println("case 1.1");
	        	list.add(temp1.val);
	              temp1=temp1.next;
	        }
	        while(temp2!=null)
	        {
	        	System.out.println("case 2.2");
	        	list.add(temp2.val);
                temp2=temp2.next;
	        }
	        print(list.head);
	        return list.head;
	   }
	   public void print(ListNode head)
	   {
		   ListNode temp=head;
		   while(temp!=null)
		   {
			   System.out.print(temp.val);
			   temp=temp.next;
		   }
		   System.out.println();
	   }
	   public void add(ListNode  head, int val)
	   {
		   if(head==null)
		   {
			   head=new ListNode(val);
		   }
		   else
		   {
			   ListNode temp=head;
			   while(temp.next!=null)
			   {
				   temp=temp.next;
			   }
			   temp.next=new ListNode(val);
		   }
	   }
}
class mylist
{
	ListNode  head;
	public mylist()
	{
		head=null;
	}
	 public void add( int val)
	   {
		   if(head==null)
		   {
			   head=new ListNode(val);
		   }
		   else
		   {
			   ListNode temp=head;
			   while(temp.next!=null)
			   {
				   temp=temp.next;
			   }
			   temp.next=new ListNode(val);
		   }
	  }
}
 class ListNode
 {
	      int val;
	      ListNode next;
	      ListNode(int x)
	      {
	          val = x;
	          next = null;
	      }
}