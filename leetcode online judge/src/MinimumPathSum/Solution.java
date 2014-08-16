package MinimumPathSum;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       Solution solution=new Solution();
       int grid[][]={{1,2,5},{3,2,1}};
       System.out.println(solution.minPathSum(grid));
	}
	public int minPathSum(int[][] grid)
	{
       int c[][]=new int[grid.length][grid[0].length];
       for(int i=0;i<c[0].length;i++)
       {
    	   if(i==0)
    	   {
    		   c[0][i]=grid[0][i];
    	   }
    	   else
    	   {
    		   c[0][i]=c[0][i-1]+grid[0][i];
    	   }
       }
       for(int j=1;j<c.length;j++)
       {
    	   c[j][0]=c[j-1][0]+grid[j][0];
       }
       for(int i=1;i<c.length;i++)
       {
    	   for(int j=1;j<c[i].length;j++)
    	   {
    		   c[i][j]=Math.min(c[i-1][j], c[i][j-1])+grid[i][j];
    	   }
       }
       System.out.println();
       for(int i=0;i<c.length;i++)
       {
    	   for(int j=0;j<c[i].length;j++)
    	   {
    		   System.out.print(c[i][j]+" ");
    	   }
    	   System.out.println();
       }
        return c[grid.length-1][c[0].length-1];
    }
}
