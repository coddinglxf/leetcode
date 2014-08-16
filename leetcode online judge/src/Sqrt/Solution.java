package Sqrt;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         Solution s=new Solution();
         for(int i=0;i<100;i++)
         {
        	 System.out.println(s.sqrt(i));
        	 System.out.println();
         }
         
         
        // System.out.println(s.search(10000, 100000, 100000000));
	}
	public int sqrt(int x)
	{
        // Note: The Solution object is instantiated only once and is reused by each test case.
		int sum=0;
		int storege=x;
		x=x/10;
		while(x>0)
		{
			sum++;
			x=x/10;
		}
		int temp1=0;
		int temp2=0;
		System.out.println("位数"+sum);
		if(sum%2==0)
		{
			int temp=sum/2;
			temp1=(int)Math.pow(10, temp);
			System.out.println("偶数:"+"temp1="+temp1);
			temp2=(int)Math.pow(10, temp+1);
			System.out.println("偶数:"+"temp2="+temp2);
		}
		else
		{
			double k=(double)sum/2;
			System.out.println(k);
			int aa=(int)Math.floor(k);
			int bb=(int)Math.ceil(k);
			temp1=(int)Math.pow(10,aa);
			System.out.println("奇数:"+"temp1="+temp1);
			temp2=(int)Math.pow(10,bb);
			System.out.println("奇数:"+"temp2="+temp2);
		}
		int T=0;
		if(temp2>46340)
		{
			temp2=46340;
		}
		System.out.println("temp1= "+temp1);
		System.out.println("temp2= "+temp2);
		T=search(temp1, temp2, storege);
        return T;
    }
	public int search(int temp1,int temp2,int storge)
	{

		if(temp1<=temp2)
		{	
			int mid=(temp1+temp2)/2;
            int tempL=mid*mid;
            if(tempL==storge)return mid;
            else if(storge>tempL)
            {
            	if(storge<(long)(mid+1)*(mid+1))
            	{
            		return mid;
            	}
            	else
            	{
            		return search(mid+1, temp2, storge);
            	}
            }
            else
            {
            	if(storge>(mid-1)*(mid-1))
            	{
            		return mid-1;
            	}
            	else
            	{
            		return search(temp1, mid-1, storge);
            	}
            }
		}
		else
		{
			System.out.println("can not find");
			return 0;
		}
	}
}
