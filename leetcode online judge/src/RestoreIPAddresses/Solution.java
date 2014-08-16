package RestoreIPAddresses;

import java.util.ArrayList;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution=new Solution();
		String s="2104524071";
		solution.restoreIpAddresses(s);
	}
    ArrayList<String>list=new ArrayList<String>();
    int x[];
    public ArrayList<String> restoreIpAddresses(String s) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        list.clear();
        x=new int[4];//用来记录当前数据
        backtack(0, s);
        return list;
    }
    public void backtack(int i,String s)
    {
    	if(i>3)
    	{
    		int sum=0;
    		String line="";
    		boolean flags=true;
    		for(int k=0;k<x.length;k++)
    		{
    			sum=sum+x[k];
    		}
    		if(sum==s.length())
    		{
    			sum=0;
    			for(int k=0;k<x.length;k++)
    			{
    			   String tempstring=s.substring(sum,sum+x[k]);
    			   if(tempstring.substring(0,1).equals("0")&&tempstring.length()>1)   				   
    			   {
    				   flags=false;
    				   break;
    			   }
    			   int tempx=Integer.parseInt(tempstring);
    			   if(tempx>255)
    			   {
    				   flags=false;
    				   break;
    			   }
    			   line=line+String.valueOf(tempx)+".";
    			   sum=sum+x[k];
    			}  			
    			if(flags)
    			{
    				System.out.println(line);
    				list.add(line.substring(0,line.length()-1));
    			}   			
    		}
    		return;
    	}
    	for(int j=1;j<=3;j++)
    	{
    		x[i]=j;
    		backtack(i+1,s);
    	}
    	return;
    }
}
