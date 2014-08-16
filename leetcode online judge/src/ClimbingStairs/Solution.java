package ClimbingStairs;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         Solution s=new Solution();
         for(int i=0;i<45;i++)
         System.out.print(s.climbStairs(i)+" ");
	}
	//ÇóµÝ¹é f(n)=f(n-1)+f(n-2);
	 public int climbStairs(int n)
	 {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
	   int first=1;
	   int second=2;
	   int key=0;
	   for(int i=3;i<=n;i++)
	   {
		   key=first+second;
		   first=second;
		   second=key;	   
	   }
	   return key;
	 }
}
