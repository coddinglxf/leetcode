package BestTimetoBuyandSellStock;
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Solution solution=new Solution();
		int prices[]={1,2,4};
		solution.getmax(prices);
	}

    public int maxProfit(int[] prices)
    {
    	if(prices.length==0)
    		return 0;
    	if(prices.length==1)
    	{
    		return -prices[0];
    	}
    	int num[]=new int[prices.length-1];
    	int j=prices.length-1;
    	for(int i=0;i<num.length;i++)
    	{
    		num[i]=prices[j]-prices[j-1];
    		j--;
    	}
    	int max=num[0];
    	int cur=0;
    	for(int i=0;i<num.length;i++)
    	{
    		cur=cur+num[i];
    		if(max<cur)
    		{
    			max=cur;
    		}
    		if(cur<0)
    		{
    			cur=0;
    		}
    	}
    	if(max<0)
    		return 0;
    	return max;
    }
   
    
    public int getmax(int[] prices)
    {
    	if(prices.length==0||prices.length==1)
    		return 0;
    	int maxnum=prices[prices.length-1];
    	int maxret=maxnum-prices[prices.length-2];
    	for(int i=prices.length-3;i>=0;i--)
    	{
    		maxnum=Math.max(maxnum, prices[i+1]);
    		maxret=Math.max(maxret, maxnum-prices[i]);
    	}
    	if(maxret<0)
    		return 0;
    	return maxret;
    }
}
