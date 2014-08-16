package Implementpow;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Solution solution=new Solution();
       System.out.println(-((int)Math.pow(2, 31)+1));
       System.out.println(solution.pow(1.00000, -2147483648));
	}
	 public double pow(double x, int n) 
	 {
	        // Note: The Solution object is instantiated only once and is reused by each test case.
		 if(n<0)
		 {   
			 if(n==-((int)Math.pow(2, 31)+1))
			 return (double)1/pow(x, -(n+1))/x;
			 else
			 {
				 return (double)1/pow(x, -n);
			 }
			 
		 }
		 else
		 {
			   if(n==1)
		    	{
		    		return x;
		    	}
			   else if(n==0)
			   {
				   return 1;
			   }
		    	else
		    	{
		    		if(n%2==0)
		    		{
		    			double k=pow(x, n/2);
		    			return k*k;
		    		}
		    		else
		    		{
		    			double k=pow(x, (n-1)/2);
		    			return k*x*k;
		    		}
		    	}
		  }

	 }
}
