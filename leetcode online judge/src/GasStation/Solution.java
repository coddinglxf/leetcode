package GasStation;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	}
    public int canCompleteCircuit(int[] gas, int[] cost)
    {
      int sum=gas.length;
      int val=0;
      for(int i=0;i<gas.length;i++)
      {
    	  //从i开始的，判断有没有可能能够到达。
    	  int temp=0;
    	  int key=i;//把i当前的数值记录下来
    	  int gassum=0;
    	  while(temp<sum)
    	  {
    		  
    		  key=key%sum;//利用求余的方式获得，因为i有可能最终会比gas.length大，这是可以理解的
    		  gassum=gassum+gas[key]-cost[key];
    		  if(gassum<0)
    		  {
    			  break;
    		  }
    		  key++;
    		  temp++;
    	  }
    	  if(temp==gas.length)
    	  {
    		  val=i+1;
    	  }
      }
       return val;
    }
}
