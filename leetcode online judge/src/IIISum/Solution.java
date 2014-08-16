package IIISum;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Solution solution=new Solution();
     int num[]={-1,-2,-3,4,1,3,0,3,-2,1,-2,2,-1,1,-5,4,-3};
     solution.threeSum(num);
     
	}
	ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> threeSum(int[] num)
	{
		Arrays.sort(num);
		list.clear();		
		for(int i=1;i<num.length-1;i++)
		{
			int pre=0;
			int later=num.length-1;
			while(pre<i&&later>i)
			{
				if(num[pre]+num[later]==-num[i])
				{
					//System.out.println("case 1");
					ArrayList<Integer>temp=new ArrayList<Integer>();
					temp.add(num[pre]);
					temp.add(num[i]);
					temp.add(num[later]);					
					pre++;
					later--;
					if(this.istrue(temp))
					{
						list.add(temp);
					}	
				}
				else if(num[pre]+num[later]>-num[i])
				{
					later--;
				}
				else
				{
					pre++;
				}
			}
		}
		
		System.out.println(list.size());
		return list;
	}
	public boolean istrue(ArrayList<Integer>temp)
	{
		for(ArrayList<Integer>mylist:this.list)
		{
			int i=0;
			for( i=0;i<mylist.size();i++)
			{
				if(mylist.get(i)!=temp.get(i))
				{
					break;
				}
			}
			if(i==mylist.size())
			{
				return false;
			}
		}
		return true;
	}
}
