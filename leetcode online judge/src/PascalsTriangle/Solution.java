package PascalsTriangle;

import java.util.ArrayList;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Solution s=new Solution();

			s.getRow(13);
	
	}
	 public ArrayList<ArrayList<Integer>> generate(int numRows)
	 {
	     ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
	     for(int i=1;i<=numRows;i++)
	     {
	    	 list.add(getRow(i));
	     }
	     return list;
	 }
	public ArrayList<Integer> getRow(int rowIndex) 
	{
		
	   ArrayList<Integer>list=new ArrayList<Integer>();
	   int a[]=new int[1];
	   int b[]=new int[1];
	   for(int i=1;i<=rowIndex;i++)
	   {
		   a=new int[i];
		   a[0]=1;a[i-1]=1;
		   if(i>=3)
		   {
			  for(int k=1;k<=i-2;k++)
			  {
				  a[k]=b[k]+b[k-1];
			  }
		   }
		   b=new int[a.length];//给b重新分配
		   for(int j=0;j<a.length;j++)
		   {
			   b[j]=a[j];
		   }
	   }
	  
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.print(a[i]+" ");
		   list.add(a[i]);
	   }
       return list;   
    }
}
