package CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Solution solution=new Solution();
       int candidates[]={10,1,2,7,6,1,5,11,12,12,12,12,12,12,12,12,21,23,23,23,23,23,23,23,23};
       solution.combinationSum(candidates, 8);
	}
    ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
    int a[];
    int cur;
	public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates,int target)
	{
		// IMPORTANT: Please reset any member data you declared, as
		// the same Solution instance will be reused for each test case.
         this.init(candidates,target);
         
         return this.list;
	}
	public void init(int candidates[],int target)
	{
		list.clear();
		this.a=new int[candidates.length];
		this.cur=0;
		Arrays.sort(candidates);
		backtrack(0, candidates,target);
	}
	public boolean istrue(ArrayList<ArrayList<Integer>>list,ArrayList<Integer>temp)
	{
		for(ArrayList<Integer>mylist:list)
		{
			if(mylist.size()!=temp.size())
				continue;
			int i=0;
			for( i=0;i<temp.size();i++)
			{
				if(mylist.get(i)!=temp.get(i))
				{
					break;
				}				
			}
			if(i==temp.size())
			{
				return false;
			}
		}
		return true;
	}
	public void backtrack(int i,int candidates[],int target)
	{
		if(i>this.a.length-1)
		{
			ArrayList<Integer>temp=new ArrayList<Integer>();
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==1)
				{
					sum=sum+candidates[j];
					temp.add(candidates[j]);
				}
			}
            if(sum==target)
            {
            	if(istrue(this.list, temp))
            	{
                	for(Integer index:temp)
                	{
                		System.out.print(index+" ");
                	}
                	System.out.println();
            		list.add(temp);
            	}
            	
            }
			return;
		}
//		for(int x=0;x<=1;x++)
//		{
//			a[i]=x;
//			backtrack(i+1, candidates,target);
//		}
		//还是不要用树的方式去思考。。。。
		if(cur+candidates[i]<=target)//这种用来剪枝是很有必要，这个比直接将所有情况求出来的效果要好
		{
			a[i]=1;
			cur=cur+candidates[i];
			backtrack(i+1, candidates,target);//跳过，遍历子树
			cur=cur-candidates[i];
		}

//		    if(i<a.length-2&&a[i+1]>target-cur)
//		    {
//		    	i=a.length;
//		    }
			a[i]=0;
			backtrack(i+1, candidates,target);			
	}
}
