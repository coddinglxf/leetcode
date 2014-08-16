package GenerateParentheses;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Solution solution=new Solution();
     solution.generateParenthesis(10);
	}
    ArrayList<String>list=new ArrayList<String>();
    String x[];//记录结果
    int num;
    public ArrayList<String> generateParenthesis(int n) 
    {
    	this.list.clear();
    	this.x=new String[2*n+1];
    	this.num=0;
    	this.DFS(1, 2*n);
    	return this.list;
    }
    public void DFS(int i,int n)
    {
    	if(i>n)//DFS 出结果情况
    	{
    		//处理
    		String line="";
    		for(int k=1;k<=n;k++)
    		{
    			line=line+x[k];
    		}
            if(istrue(line))
            {
            	num++;
        		System.out.println(num+"  "+line);
        		list.add(line);
            }
    		return;
    	}
    	x[i]="(";
    	DFS(i+1, n);
    	x[i]=")";
    	if(cut(x, i))
    	{
    		DFS(i+1, n);
    	}   	
    }
    public boolean cut(String x[],int i)
    {
    	int left=0;
    	int right=0;
    	for(int k=1;k<=i;k++)
    	{
    		if(x[k]=="(")
    			left++;
    		else
    			right++;
    	}
    	return  left>=right;
    }
    public boolean istrue(String s)
    {
    	char c[]=s.toCharArray();
    	Stack<Character>stack=new Stack<Character>();
    	for(int i=0;i<c.length;i++)
    	{
    		if(c[i]=='(')
    		{
    			stack.push('(');
    		}
    		else
    		{
    			if(stack.isEmpty())
    			{
    				return false;
    			}
    			else
    			{
    				stack.pop();
    			}
    		}
    	}
    	return stack.isEmpty();
    }
}
