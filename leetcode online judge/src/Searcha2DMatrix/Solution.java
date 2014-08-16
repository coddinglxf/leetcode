package Searcha2DMatrix;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      Solution solution=new Solution();
      for(int i=1;i<=16;i++)
      {
    	  System.out.println(solution.searchMatrix(matrix, i));
    	  System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
      }
      
      }
	  public boolean searchMatrix(int[][] matrix, int target)
	  {
	        // IMPORTANT: Please reset any member data you declared, as
	        // the same Solution instance will be reused for each test case.
	        boolean flags=false;
	        int i=0;int j=0;
	        while(i<matrix.length&&j<matrix[0].length)
	        {
	        	if(matrix[i][j]==target)
	        	{
	        		flags=true;
	        		break;
	        	}
	        	else
	        	{
	        		if(i<matrix.length-1)
	        		{
	        			if(target>=matrix[i+1][j])
	        			{
	        				//System.out.println("i++");
	        				i++;
	        			}
	        			else
	        			{
	        				//System.out.println("j++");
	        				j++;
	        			}
	        		}
	        		else
	        		{
	        			//System.out.println("j++");
	        			j++;
	        		}
	        	}
	        }
	        return flags;
	 }
}
