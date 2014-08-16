package PalindromePartitioning;

import java.util.ArrayList;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
        String s="aabababacaac";
        solution.partition(s);
	}
    ArrayList<ArrayList<String>>list=new ArrayList<ArrayList<String>>();
    ArrayList<String>res=new ArrayList<String>();
    int min=Integer.MAX_VALUE;
    public ArrayList<ArrayList<String>> partition(String s) 
    {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        list.clear();
        res.clear();
        DFS(s, s, "");
        System.out.println("this max= "+this.min);
        return this.list;
    }
    public void DFS(String s,String ks,String cur)
    {
    	if(cur.equals(s))
    	{
    		//处理 
    		ArrayList<String>templist=new ArrayList<String>();
    		for(String thiss:res)
    		{  	
    			templist.add(thiss);
    			System.out.print(thiss+" ");
    		}
    		System.out.println("!!!!!!");
    		list.add(templist);
    		min=Math.min(min, templist.size()-1);
    		return;
    	}
    	ArrayList<String>temp=getlist(ks);
    	for(int i=0;i<temp.size();i++)
    	{
    		res.add(temp.get(i));
    		DFS(s, ks.substring(temp.get(i).length(),ks.length()), cur+temp.get(i));
    		res.remove(res.size()-1);
    	}
    	return;
    }
    public ArrayList<String> getlist(String s)//获得s开头的所有回文
    {
    	ArrayList<String>temp=new ArrayList<String>();
    	for(int i=1;i<=s.length();i++)
    	{
    		String temps=s.substring(0,i);
    		if(istrue(temps))
    		{
    			temp.add(temps);
    		}
    	}
    	return temp;
    }
	public boolean istrue(String s) 
	{
		int i = 0;
		int j = s.length() - 1;
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			else {
				i++;
				j--;
			}
		}
		return true;
	}
}
