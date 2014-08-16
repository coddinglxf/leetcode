package AddTwoNumbers;

import java.util.ArrayList;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Solution solution=new Solution();
         ListNode l1=new ListNode(2);
         l1.next=new ListNode(4);
         l1.next.next=new ListNode(3);
         
         ListNode l2=new ListNode(5);
         l2.next=new ListNode(6);
         l2.next.next=new ListNode(9);
         
         solution.addTwoNumbers(l1, l2);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ArrayList<Integer>temp1=new ArrayList<Integer>();
		ArrayList<Integer>temp2=new ArrayList<Integer>();
		ListNode l1temp=l1;
		System.out.println("L1");
		while(l1temp!=null)
		{
			System.out.print(l1temp.val+" ");
			temp1.add(l1temp.val);
			l1temp=l1temp.next;
		}

		System.out.println("!!!!!!!!!!!");
		ListNode l2temp=l2;
		System.out.println("L2");
		while(l2temp!=null)
		{
			System.out.print(l2temp.val+" ");
			temp2.add(l2temp.val);
			l2temp=l2temp.next;
		}

		System.out.println("!!!!!!!!!!!!!!!!");
		int length=Math.max(temp1.size(), temp2.size());
		int a[]=new int[length];
		int b[]=new int[length];
		int c[]=new int[length+1];
		for(int i=0;i<temp1.size();i++)
		{
			a[i]=temp1.get(i);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<temp2.size();i++)
		{
			b[i]=temp2.get(i);
			System.out.print(b[i]+" ");
		}
		System.out.println();
		boolean flags=false;
		for(int i=0;i<a.length;i++)
		{
			if(flags==true)
			{
				if(a[i]+b[i]+1>=10)
				{
					c[i]=a[i]+b[i]+1-10;
					flags=true;
					continue;
				}
				else
				{
					c[i]=a[i]+b[i]+1;
					flags=false;
					continue;
				}
			}
			else
			{
				if(a[i]+b[i]>=10)
				{
					c[i]=a[i]+b[i]-10;
					flags=true;
					continue;
				}
				else
				{
					c[i]=a[i]+b[i];
					flags=false;
					continue;
				}
			}
		}
		if(flags)
		{
			c[c.length-1]=1;
		}
		else
		{
			c[c.length-1]=0;
		}
	    mylist list=new mylist();
	    for(int i=0;i<c.length;i++)
	    {
	    	System.out.print(c[i]+" ");
	    	if(i==c.length-1)
	    	{
	    		if(c[i]!=0)
	    		{
	    		  list.add(c[i]);
	    		}
	    	}
	    	else
	    	{
	    		list.add(c[i]);
	    	}
	    	
	    }
	    return list.head;
	}

}
class mylist
{
	ListNode head;
	public mylist() {
	  head=null;
	}
	public void add(int val)
	{
	  if(head==null)
		  head=new ListNode(val);
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
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}