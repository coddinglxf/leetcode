package SingleNumber;

public class Solution
{
	public static void main(String args[])
	{
		int a[]={1,1,1,2,3,2,2,3,3,4,4,4,5,6,5,6,5,6,7,7,7,8,8,8,9,9,9,0,12,12,12,13,13,13};
		System.out.println(new Solution().singleNumber(a));
	}
	public int singleNumber(int[] A)
	{
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int max=0;
        int T=0;
        for(int i=0;i<A.length;i++)
        {
        	if(max<=A[i])
        	{
        		max=A[i];
        	}
        }
        int temp[]=new int[max+1];
        for(int i=0;i<A.length;i++)
        {
        	temp[A[i]]++;
        }
        for(int i=0;i<temp.length;i++)
        {
        	if(temp[i]!=3&&temp[i]!=0)
        	{
        		T=i;
        	}
        }
        return T;
    }
}
