package RemoveDuplicatesfromSortedArray;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int A[]={1,1,2,2,3};
    Solution solution=new Solution();
    System.out.println(solution.removeDuplicates(A));
	}
	public static int nil=(int)Math.pow(2, 31);
	public int removeDuplicates(int[] A) 
    {
        int sum=A.length;
        for(int i=0;i<A.length-1;i++)
        {
        	if(A[i]==A[i+1])
        	{
        		A[i]=nil;
        		sum--;
        	}
     
        }
        System.out.println();
        for(int i=0;i<A.length;i++)
        {
        	System.out.print(A[i]+" ");
        }
        int ki=0;
        int j=0;
        while(ki<A.length)
        {
        	if(A[ki]!=nil)
        	{
        		A[j]=A[ki];
        		j++;
        	}
        	ki++;
        }
        System.out.println();
        for(int i=0;i<A.length;i++)
        {
        	System.out.print(A[i]+" ");
        }
        return sum;
    }
}
