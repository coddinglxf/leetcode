package UniquePathsII;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       int obstacleGrid[][]={{0}};
       Solution solution=new Solution();
       System.out.println(solution.uniquePathsWithObstacles(obstacleGrid));;
	}
	//dp ¸ã¶¨
	public int uniquePathsWithObstacles(int[][] obstacleGrid)
	{
		int m[][]=new int[obstacleGrid.length][obstacleGrid[0].length];
		for(int i=0;i<m.length;i++){
			if(i==0){
				if(obstacleGrid[i][0]==0)
				{
					m[i][0]=1;
				}	
				else
				{
					m[i][0]=0;
				}
			}else{
				if(m[i-1][0]==1&&obstacleGrid[i][0]==0){
					m[i][0]=1;
				}else{
					m[i][0]=0;
				}
			}
		}
		
		for(int j=1;j<m[0].length;j++){
			if(m[0][j-1]==1&&obstacleGrid[0][j]==0){
				m[0][j]=1;
			}else{
				m[0][j]=0;
			}
		}
			
		
//		System.out.println("!!!!!!!!!");
//		for(int i=0;i<m.length;i++){
//			for(int j=0;j<m[0].length;j++)
//			{
//				System.out.print(m[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		
		for(int i=1;i<m.length;i++)
		{
			for(int j=1;j<m[i].length;j++)
			{
				if(obstacleGrid[i][j]==1)
				{
					m[i][j]=0;
				}
				else
				{
					if(obstacleGrid[i-1][j]==0&&obstacleGrid[i][j-1]==0)
					{
						m[i][j]=m[i-1][j]+m[i][j-1];
					}else if(obstacleGrid[i-1][j]!=0&&obstacleGrid[i][j-1]==0)
					{
						m[i][j]=m[i][j-1];
					}else if(obstacleGrid[i-1][j]==0&&obstacleGrid[i][j-1]!=0)
					{
						m[i][j]=m[i-1][j];
					}
					else
					{
						m[i][j]=0;
					}
				}
			}
		}
		
		
			
		
//		System.out.println("WWWWWWWWWWWWWW");
//		for(int i=0;i<m.length;i++){
//			for(int j=0;j<m[0].length;j++)
//			{
//				System.out.print(m[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println(m[x-2][y-1]+m[x-1][y-2]);
		return m[m.length-1][m[0].length-1];
	}
}
