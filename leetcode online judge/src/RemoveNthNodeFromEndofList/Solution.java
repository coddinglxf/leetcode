package RemoveNthNodeFromEndofList;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     List l=new List();
     l.add(12);
     l.add(14);
     l.add(14);
     l.add(124);
     l.add(12314);
     l.print(l.head);
	}

	public ListNode removeNthFromEnd(ListNode head, int n)
	{
	  int sum=1;
	  ListNode temp=head;
	  while(temp.next!=null)
	  {   
		  sum++;
		  temp=temp.next;
	  }
	  ListNode ret=null;
      if(n==sum)//删除第一个节点
      {
    	 if(sum==1)
    	 {
    		 ret=null;
    	 }
    	 else
    	 {
    		 head=head.next;
    		 ret=head.next;
    	 }
      }
      else if(n==1)//删除最后一个节点
      {
    	  
      }
	  return ret;
	}
}
class List
{
	ListNode head;
	public List()
	{
		head=null;
	}
	public void add(int val)
	{
		ListNode node=new ListNode(val);
		if(head==null)
		{
			head=node;
		}
		else
		{
			ListNode temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	public void print(ListNode head)
	{
		ListNode temp=new ListNode();
		temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println(temp.val);
	}
}
class ListNode 
{
	int val;
	ListNode next;
    ListNode(){}
	ListNode(int x) 
	{
		val = x;
		next = null;
	}
}