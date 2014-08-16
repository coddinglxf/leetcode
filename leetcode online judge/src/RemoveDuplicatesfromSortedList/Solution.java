package RemoveDuplicatesfromSortedList;

import java.util.Stack;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Solution solution=new Solution();
       MyList ml=new MyList();
       ml.add(1);
//       ml.add(1);
//       ml.add(1);
//       ml.add(1);
//       ml.add(1);
//       ml.add(2);
//       ml.add(2);
//       ml.add(2);
//       ml.add(2);
//       ml.add(3);
 //      ml.add(3);
      // ml.print(ml.head);
      // System.out.println();
       ml.print(solution.deleteDuplicates(ml.head));
	}
	 public ListNode deleteDuplicates(ListNode head)
	 {
	        // IMPORTANT: Please reset any member data you declared, as
	        // the same Solution instance will be reused for each test case.
		   Stack<Integer>stack=new Stack<Integer>();
	       if(head==null)
	       {
	    	  return null;
	       }
	       else
	       {
	    	   ListNode temp=head;
	    	   while(temp!=null)
	    	   {
                  if(stack.isEmpty())
                  {
                	  stack.push(temp.val);
                	  //System.out.println("in "+temp.val);
                  }
                  else
                  {
                	  if(stack.peek()==temp.val)
                	  {
                		  stack.pop();
                		 // System.out.println("out "+temp.val);
                		  stack.push(temp.val);
                		 // System.out.println("in "+temp.val);
                	  }
                	  else
                	  {
                		  stack.push(temp.val);
                		 // System.out.println("in "+temp.val);
                	  }
                  }
                  temp=temp.next;
	    	   }
	    	   //剩下最后一个数字处理	
        		   
	    	   
	       }
	       
	       Stack<Integer>tempstack=new Stack<Integer>();
	       while(!stack.isEmpty())
	       {
	    	   tempstack.push(stack.pop());
	       }
	       
	       MyList mylist=new MyList();
	       while(!tempstack.isEmpty())
	       {
	    	   mylist.add(tempstack.pop());
	       }
	       return mylist.head;
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
 class MyList
{
	    ListNode head;
	    public MyList()
	    {
	    	this.head=null;
	    }
	    public void add(int val)
	    {
	    	ListNode temp=new ListNode(val);
	    	if(head==null)
	    	{
	    		head=temp;
	    	}
	    	else
	    	{
	    		ListNode temp2=new ListNode(10);
	    		temp2=head;
	    		while(temp2.next!=null)
	    		{
	    			temp2=temp2.next;
	    		}
	    		temp2.next=temp;
	    	}
	    }
	    public void print(ListNode head)
	    {
			ListNode temp2=new ListNode(10);
  		temp2=head;
  		while(temp2!=null)
  		{
  			System.out.println(temp2.val);
  			temp2=temp2.next;
  		}
	    }
}