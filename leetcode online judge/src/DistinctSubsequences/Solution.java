package DistinctSubsequences;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

	public int numDistinct(String S, String T)
	{
		// IMPORTANT: Please reset any member data you declared, as
		// the same Solution instance will be reused for each test case.
        int dp[][]=new int[T.length()+1][S.length()+1];
        dp[0][0]=1;
        for(int i=1;i<dp[0].length;i++)
        {
        	dp[0][i]=1;
        }
        for(int j=1;j<dp.length;j++)
        {
        	dp[j][0]=0;
        }
        for(int i=1;i<=T.length();i++)
        {
        	for(int j=1;j<=S.length();j++)
        	{
        		dp[i][j]=dp[i][j-1];
        		if(T.charAt(i-1)==S.charAt(j-1))
        		{
        			dp[i][j]+=dp[i-1][j-1];
        		}
        	}
        }
        return dp[T.length()][S.length()];
	}
}
