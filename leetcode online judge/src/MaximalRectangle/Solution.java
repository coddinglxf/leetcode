package MaximalRectangle;

public class Solution 
{
	 public int maximalRectangle(char[][] matrix)
	 {
	        // Note: The Solution object is instantiated only once and is reused by each test case.
		     int nil=(int)Math.pow(2, 23);
	        int f[][]=new int[matrix.length][matrix.length];
	        for(int i=0;i<matrix.length;i++)
	        {
	        	f[0][i]=matrix[0][i]=='1'?1:0;
	        }
	        for(int i=0;i<matrix.length;i++)
	        {
	        	for(int j=0;j<matrix[i].length;j++)
	        	{
	        		f[i][j]=matrix[i][j]=='1'?1+f[i][j-1]:0;
	        	}
	        }
	        int ret=0;
	        for(int i=0;i<matrix.length;i++)
	        {
	        	for(int j=0;j<matrix[i].length;j++)
	        	{
	        		int k=i;
	        		int weight=nil;
	        		while(k>=0)
	        		{
	        			if(f[k][j]=='0')break;
	        			weight=Math.min(weight, f[k][j]);
	        			ret=Math.max(ret, weight*(i-k+1));
	        			k--;
	        		}
	        	}
	        }
	        
	        return ret;
	 }
}
