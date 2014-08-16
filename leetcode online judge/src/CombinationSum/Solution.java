package CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int candidates[]={1,2,3,4,5,6};
        int target=16;
        Solution solution=new Solution();
        solution.init(candidates, target);
	}
	 ArrayList<ArrayList<Integer>>mylist=new ArrayList<ArrayList<Integer>>();
	 public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target)
	 {
		 mylist.clear();
		 init(candidates, target);
		 return this.mylist;
	 }
	int target;
	int candidates[];
	int x[];
	public void init(int candidates[],int target)
	{
		this.target=target;
		this.candidates=candidates;
		this.x=new int[candidates.length];
		Arrays.sort(candidates);
		Dfs(0, 0, target);
	}
    public void Dfs(int i,int cursum,int target)
    {
    	if(i>candidates.length-1)
    	{
    		if(cursum==target)
    		{
    			ArrayList<Integer>list=new ArrayList<Integer>();
    			for(int k=0;k<x.length;k++)
    			{
    				for(int flags=1;flags<=x[k];flags++)
    				{
    					list.add(candidates[k]);
    				}
    			}
    			mylist.add(list);
    			for(Integer index:list)
    			{
    				System.out.print(index+" ");
    			}
    			System.out.println();
    			System.out.println("!!!!!!!!!!!!!!!");
    		}
    		return;
    	}
    	for(int j=0;j<=(target-cursum)/candidates[i];j++)
    	{
    		x[i]=j;
    		Dfs(i+1, cursum+candidates[i]*j, target);
    	}
    	return;
    }
}
