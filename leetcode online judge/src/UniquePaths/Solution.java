package UniquePaths;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Solution solution=new Solution();
        solution.uniquePaths(3, 4);
	}
	public int uniquePaths(int m, int n) 
	{
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int c[][]=new int[m][n];
        for(int i=0;i<c.length;i++)
        {
        	c[i][0]=1;
        }
        for(int j=0;j<c[0].length;j++)
        {
        	c[0][j]=1;
        }
        for(int i=1;i<c.length;i++)
        {
        	for(int j=1;j<c[i].length;j++)
        	{
        		c[i][j]=c[i-1][j]+c[i][j-1];
        	}
        }
       
//        for(int i=0;i<c.length;i++)
//        {
//        	for(int j=0;j<c[i].length;j++)
//        	{
//        		System.out.print(c[i][j]+" ");
//        	}
//        	System.out.println();
//        }
//        System.out.println(c[c.length-1][c[0].length-1]);
        return c[c.length-1][c[0].length-1];
    }

}
