package LongestValidParentheses;
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Solution solution=new Solution();
         System.out.println( solution.longestValidParentheses("()(((((()()(((())())))))))())))())())()()(()))(()))()))((()))))(())(()()))((((())()()())(((()((()(())((()())"));;
	}

	public  int longestValidParentheses(String s)
    {
	    int n = s.length();
	    int[] dp = new int[n];
	    for(int i=0;i<dp.length;i++)
	    	dp[i]=0;
	    int max = 0;
	    for (int i = n - 2; i >= 0; i--) {
	      if (s.charAt(i) == '(') {
	        int j = i + 1 + dp[i + 1];
	        if (j < n && s.charAt(j) == ')') {
	          dp[i] = dp[i + 1] + 2;
	          if (j + 1 < n) {
	            dp[i] += dp[j + 1];
	          }
	          
	        }
	        max = Math.max(max, dp[i]);
	      }
	    }
	    return max;
    }

}
