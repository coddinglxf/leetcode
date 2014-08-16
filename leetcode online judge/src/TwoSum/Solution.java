package TwoSum;

import java.util.Arrays;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution solution=new Solution();
		int[] numbers={2, 7, 11, 15};
		int target=9;
		solution.twoSum(numbers, target);
	}

	public int[] twoSum(int[] numbers, int target)
	{
		Arrays.sort(numbers);
		int ret[] = new int[2];
        int i=0;
        int j=numbers.length-1;
        while(i<j)
        {
        	if(numbers[i]+numbers[j]==target)
        	{
        		ret[0]=i+1;
        		ret[1]=j+1;
        		i++;
        		j--;
        		//break;
        	}
        	else if(numbers[i]+numbers[j]>target)
        	{
        		j--;
        	}
        	else
        	{
        		i++;
        	}
        }
		System.out.println("index1= "+ret[0]+" index2= "+ret[1]);
		return ret;
	}
}
