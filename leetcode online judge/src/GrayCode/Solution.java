package GrayCode;
import java.util.*;
public class Solution {
	public static void main(String[] args) {
        Solution solution=new Solution();
        solution.grayCode(10);
	}
    public ArrayList<Integer> grayCode(int n) 
    {
        // Note: The Solution object is instantiated only once and is reused by each test case.
       ArrayList<Integer>list=new ArrayList<Integer>();
       if(n==0)
       {
    	   list.add(0);
    	   return list;
       }
       if(n==1)
       {
    	   list.add(0);
    	   list.add(1);
    	   return list;
       }
       list.add(0);
       list.add(1);
       ArrayList<Integer>temp=new ArrayList<Integer>();
       int i=2;
       while(i<=n)
       {
    	   
    	   System.out.println("list size= "+list.size());
    	   int power=(int)Math.pow(2, i-1);
    	   for(int k=1;k<=2;k++)
    	   {
    		   if(k==1)
    		   {
    			   for(int m=0;m<list.size();m++)
        		   {
        			   temp.add(list.get(m));
        		   } 
    		   }
    	       if(k==2)
    	       {
    	    	   for(int m=list.size()-1;m>=0;m--)
        		   {
        			   temp.add(power+list.get(m));
        		   } 
    	       }
    	   }
     	   System.out.println("i= "+i+" "+temp.size());
     	   list=temp;
     	   System.out.println("list size= "+list.size());
     	   for(Integer index:list)
     	   {
     		   System.out.print(index+" ");
     	   }
     	   System.out.println();
     	   System.out.println();
     	   temp=new ArrayList<Integer>();
     	   i++;
       }
       return list;
    }
}
