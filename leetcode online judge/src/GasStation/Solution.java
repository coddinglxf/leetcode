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
    	  //��i��ʼ�ģ��ж���û�п����ܹ����
    	  int temp=0;
    	  int key=i;//��i��ǰ����ֵ��¼����
    	  int gassum=0;
    	  while(temp<sum)
    	  {
    		  
    		  key=key%sum;//��������ķ�ʽ��ã���Ϊi�п������ջ��gas.length�����ǿ�������
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
