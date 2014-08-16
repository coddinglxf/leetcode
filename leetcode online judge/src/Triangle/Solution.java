package Triangle;

import java.util.ArrayList;
import java.util.Iterator;
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>>intlist=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer>int1=new ArrayList<Integer>();
		ArrayList<Integer>int2=new ArrayList<Integer>();
		ArrayList<Integer>int3=new ArrayList<Integer>();
		int1.add(1);
		int2.add(2);
		int2.add(3);
		int3.add(1);
		int3.add(2);
		int3.add(3);
		intlist.add(int1);
		intlist.add(int2);
		intlist.add(int3);
		Solution s=new Solution();
	    System.out.println(s.minimumTotal(intlist));
	}
	public int minimumTotal(ArrayList<ArrayList<Integer>> triangle)
	{
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int index=triangle.size()-1;
        if(index==-1)
        {
        	return 0;
        }
        if(index==0)//只有一个元素情况
        {
        	return getarraybyindex(triangle, 1)[0];
        }
        int b[]=new int[1];
        int a[]=new int[1];
        while(index>0)
        {

        	    if(index==triangle.size()-1)
        	    {
        	    	b=getarraybyindex(triangle, index+1);//倒数第一行
        	    }
                a=getarraybyindex(triangle, index);//倒数第二行
            	for(int i=0;i<a.length;i++)
            	{
            		if(b[i]<b[i+1])
            		{
            			a[i]=a[i]+b[i];
            		}
            		else
            		{
            			a[i]=a[i]+b[i+1];
            		}
            	}
            	b=new int[a.length];
            	for(int i=0;i<a.length;i++)b[i]=a[i];
        	    index--;
        }
		
        return a[0];
    }
	public int[] getarraybyindex(ArrayList<ArrayList<Integer>> triangle,int n)
	{
		Iterator<ArrayList<Integer>>it=triangle.iterator();
		ArrayList<Integer>lastlist=new ArrayList<Integer>();
		int i=0;
		while(i<n)
		{
			lastlist=it.next();
			i++;
		}
		i=0;
		Iterator<Integer>intit=lastlist.iterator();
		int a[]=new int[lastlist.size()];
		while(intit.hasNext())
		{
			a[i]=intit.next();
			i++;
		}
		return a;
	}
}
