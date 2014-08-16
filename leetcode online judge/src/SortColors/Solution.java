package SortColors;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Solution solution=new Solution();
      int A[]={0,1,2,0,1,2,2};
      solution.sortColors(A);
	}

	public void sortColors(int[] A) {
		int b[]=new int[A.length];
		int c[]=new int[3];
		for(int i=0;i<A.length;i++)
		{
			c[A[i]]++;
		}
		for(int i=1;i<c.length;i++)
		{
			c[i]=c[i]+c[i-1];
		}
		for(int j=A.length-1;j>=0;j--)
		{
			b[c[A[j]]-1]=A[j];
			c[A[j]]--;
		}
		for(int i=0;i<b.length;i++)
		{
			A[i]=b[i];
		}
	}
	

}
