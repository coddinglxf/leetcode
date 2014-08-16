package PermutationsII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Solution solution=new Solution();
    int num[]={-1,2,-1,2,3};
    solution.permuteUnique(num);
	}
	ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
	ArrayList<String>stringlist=new ArrayList<String>();
	HashSet<String>hash=new HashSet<String>();
	public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
		list.clear();
		hash.clear();
		stringlist.clear();
		per(0, num.length-1, num);//获得hash
		getlist(hash);//处理hash
		return list;
    }
    
	public void getlist(HashSet<String>hash)
	{
	  Iterator<String>it=hash.iterator();
	  while(it.hasNext())
	  {
		  String line=it.next();
		  list.add(getint(line));
	  }
	}
	public ArrayList<Integer> getint(String line)
	{
		ArrayList<Integer>temp=new ArrayList<Integer>();
	    String string[]=line.split("@");
	    for(int i=0;i<string.length;i++)
	    {
	    	temp.add(Integer.parseInt(string[i]));
	    }
	    for(Integer index:temp)
	    {
	    	System.out.print(index+" ");
	    }
	    System.out.println();
		return temp;
	}
	public void per(int start,int end,int num[])
	{
		if(start==end)
		{
			String line="";
		  for(int i=0;i<num.length;i++)
		  {
			line=line+String.valueOf(num[i])+"@";  
		  }
		  if(!this.hash.contains(line))
		  {
			  System.out.println(line);
			  this.hash.add(line);
		  }
		  return;
		}
		for(int i=start;i<=end;i++)
		{
			int temp=num[i];
			num[i]=num[start];
			num[start]=temp;
			
			per(start+1, end, num);
			
		    temp=num[i];
			num[i]=num[start];
			num[start]=temp;
		}
		
	}
}
