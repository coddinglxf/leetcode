package PlusOne;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution solution=new Solution();
        int digits[]={9,8,9,9,9,3};
        solution.plusOne(digits);
	}

	public int[] plusOne(int[] digits) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		int count[] = new int[digits.length];
		int one[] = new int[digits.length];
		one[digits.length-1] = 1;
		boolean flags = false;
		for (int i = digits.length-1; i>=0 ; i--) {
			int a = digits[i];
			int b = one[i];
			if (flags == true) {
				if (a + b + 1 >= 10) {
					System.out.println("case 1");
					count[i] = a + b + 1 - 10;
					flags = true;
					continue;
				} else {
					System.out.println("case 2");
					count[i] = a + b + 1;
					flags = false;
					continue;
				}
			}

			if (flags == false) {
				if (a + b >= 10) {
					System.out.println("case 3");
					count[i] = a + b - 10;
					flags = true;
					continue;
				} else {
					System.out.println("case 4");
					count[i] = a + b;
					flags = false;
					continue;
				}
			}
			
			System.out.println(count[i]+" ");
		}
		System.out.println("!!!!!!!");
        int ret[];
		if (flags) 
		{			
			ret=new int[count.length+1];
			ret[0]=1;
			for(int k=0;k<count.length;k++)
				ret[k+1]=count[k];
		} else 
		{
			
			ret=new int[count.length];
			for(int k=0;k<ret.length;k++)
				ret[k]=count[k];
		}
		for(int i=0;i<ret.length;i++)
		{
			System.out.print(ret[i]+" ");
		}
		System.out.println();
		return ret;
	}
}
