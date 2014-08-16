package PalindromeNumber;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution s=new Solution();
        int k=(int)Math.pow(2, 31);
        System.out.println(" k=  "+k);
        System.out.println(32111/(int)Math.pow(10, 4));
        System.out.println(s.isPalindrome(-2147447412));
	}

    public boolean isPalindrome(int x) 
    {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	if(x<0)
    		return false;
    	x=Math.abs(x);
    	int tempk=x;
    	int sum=1;
    	boolean flags=true;
    	while(x/10>0)
    	{
    		x=x/10;
    		sum++;
    	}
    	System.out.println("sum位数= "+sum);
    	int i=sum/2;
    	System.out.println("i= "+i);
    	sum--;
    	x=tempk;
    	System.out.println("!!!!!!!!!!!!!");
    	for(int j=1;j<=i;j++)//代表迭代次数
    	{
    		//取出最高位
    		System.out.println("j iter "+j);
    		int temp=x;//先把当前的数据保留下来
    		System.out.println(Math.pow(10, sum));
    		int pre=x/(int)Math.pow(10, sum);
    		System.out.println("pre= "+pre);
    		int later=x%10;
    		System.out.println("later= "+later);
    		if(pre!=later)
    		{
    			flags=false;
    			break;
    		}
    		//更新x的数值
    	
    		x=temp/(int)Math.pow(10,sum);
    		x=x/10;
    		sum=sum-2;
    		System.out.println("sum= "+sum);
    		System.out.println("update x= "+x);
    		System.out.println("!!!!!!!!!!!!");
    	}
    	System.out.println("sum= "+sum);
        return flags;
    }

}
