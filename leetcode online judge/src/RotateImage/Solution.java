package RotateImage;

public class Solution {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=3;
        int sum=0;
        int matrix[][]=new int[n][n];
     	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			sum++;
    			matrix[i][j]=sum;
    		}
    	}
     	Solution solution=new Solution();
     	solution.rotate(matrix);
     	System.out.println();
     	solution.rotate(matrix);
     	System.out.println();
     	solution.rotate(matrix);
     	System.out.println();
     	solution.rotate(matrix);
	}

    public void rotate(int[][] matrix)
    {
    	int n=matrix.length;
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			System.out.print(matrix[i][j]+"\t");
    		}
    		System.out.println();
    	}
    	
    	for(int i=0;i<n;i++)
    	{
    		for(int j=i+1;j<n;j++)
    		{
    			int temp=matrix[i][j];
    			matrix[i][j]=matrix[j][i];
    			matrix[j][i]=temp;
    		}
    	}
    	
    	for(int j=0;j<n/2;j++)
    	{
    		for(int i=0;i<n;i++)
    		{
    			int temp=matrix[i][j];
    			matrix[i][j]=matrix[i][n-j-1];
    			matrix[i][n-j-1]=temp;
    		}
    	}
    	
    	
    	System.out.println();
      	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			System.out.print(matrix[i][j]+"\t");
    		}
    		System.out.println();
    	}
      	
    }

}
