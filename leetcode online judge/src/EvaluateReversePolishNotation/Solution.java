package EvaluateReversePolishNotation;

import java.util.ArrayList;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Solution s=new Solution();
		String tokens[]={"2", "1", "+", "3", "*"};
		s.evalRPN(tokens);
	}


    public int evalRPN(String[] tokens)
    {
    	ArrayList<String>list=new ArrayList<String>();
    	for(int i=0;i<tokens.length;i++)
    	{
    		list.add(tokens[i]);
    	}
    	while(list.size()>1)
    	{
    		for(int i=0;i<list.size()-2;i++)
    		{
    			if("+-*/".contains(list.get(i+2)))
    			{
    				int first=Integer.parseInt(list.get(i));
    				int second=Integer.parseInt(list.get(i+1));
    				int temp=operate(first, second, list.get(i+2));
    				list.remove(i);
    				list.remove(i);
    				list.remove(i);
    				list.add(i,String.valueOf(temp));
    				break;
    			}
    		}
    	}
    	System.out.println(list.get(0));
    	return Integer.parseInt(list.get(0));
    }
    public int operate(int f,int s,String letter)
    {
    	if(letter.equals("+"))
    	{
    		return f+s;
    	}
    	else if(letter.equals("-"))
    	{
    		return f-s;
    	}
    	else if(letter.equals("*"))
    	{
    		return f*s;
    	}
    	else
    	{
    		return f/s;
    	}
    }
}
