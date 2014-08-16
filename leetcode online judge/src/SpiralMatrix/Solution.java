package SpiralMatrix;

import java.util.ArrayList;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    // int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
      Solution solution=new Solution();
      solution.spiralOrder(matrix);
	}
	public ArrayList<Integer> spiralOrder(int[][] matrix)
	{
      int weight=matrix.length;
      ArrayList<Integer>list=new ArrayList<Integer>();
      int i=0;
      int sum=0;
      if(weight%2==0)
      {
    	  sum=weight/2-1;
      }
      else
      {
    	  sum=(weight-1)/2;
      }
      while(i<=sum)
     {
    	  
    	  int duijiao=i+weight-1;
    	  System.out.println();
    	  System.out.println("duijiao="+duijiao);
    	  System.out.println("weight="+weight);
    	  System.out.println("i= "+i);
    	  for(int j=i;j<=duijiao;j++)
    	  {
    		  System.out.println("1中情况");
    		  list.add(matrix[i][j]);
    	  }
    	  for(int j=i;j<i+weight-1;j++)
    	  {
    		  System.out.println("2中情况");
    		  list.add(matrix[j][duijiao]);
    	  }
    	  for(int j=duijiao;j>i;j--)
    	  {
    		  System.out.println("3中情况");
    		  list.add(matrix[duijiao][j]);
    	  }
    	  for(int j=duijiao;j>i;j--)
    	  {
    		  System.out.println("4中情况");
    		  list.add(matrix[j][i]);
    	  }
    	  for(Integer index:list)
    	  {
    		  System.out.print(index+" ");
    	  }
    	  
    	  i++;
    	  weight=weight-2;
      }
      return list;
    }
}
