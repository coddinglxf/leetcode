package PermutationSequence;
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution solution=new Solution();
		solution.getPermutation(9, 13);
		System.out.println(solution.line);
		System.out.println(solution.num);
	}
    String line;
    String res[];
    int num;
    public String getPermutation(int n, int k) 
    {
    	line="";
    	res=new String[n+1];
    	num=0;
    	DFS(1, n, k);
    	return line;
    }
    public void DFS(int i,int n,int k)
    {
    	if(i>n)
    	{
    		num++;
    		if(num==k)
    		{
        		for(int y=1;y<=n;y++)
        		{
        			line=line+res[y];
        		}  
        		return;
    		}
    			return;
    	}
    	for(int temp=1;temp<=n;temp++)
    	{
    		res[i]=String.valueOf(temp);
    		if(istrue(i))//¼ôÖ¦
    		{
    			DFS(i+1, n, k);
    		}   		
    	}
    }
    public boolean istrue(int i)
    {
    	for(int k=1;k<=i-1;k++)
    	{
    		if(res[k].equals(res[i]))
    		{
    			return false;
    		}
    	}
    	return true;
    }
}
