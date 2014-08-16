package DecodeWays;

import java.util.ArrayList;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="1214";
         Solution solution=new Solution();
         solution.numDecodings(s);
         System.out.println(solution.num);
	}

    public int numDecodings(String s)
    {
    	list.clear();
    	DFS(s, s, "");
    	return this.num;
    }
    int num=0;
    ArrayList<String>list=new ArrayList<String>();
    public void DFS(String s,String ks,String cur)
    {
    	if(cur.equals(s))
    	{
    		num++;
    		//处理
    		//System.out.println("list size= "+list.size());
    		for(String string:list)
    		{
    			System.out.print(string+" ");
    		}
    		System.out.println();
    		return;
    	}   	
    	ArrayList<String>temp=getlist(ks);
    	//System.out.println();
    	//System.out.println("temp size= "+temp.size());
    	for(int i=0;i<temp.size();i++)
    	{
          if(istrue(ks))
          {
      		list.add(temp.get(i));
    		DFS(s, ks.substring(temp.get(i).length(),ks.length()), cur+temp.get(i));
    		list.remove(list.size()-1);
          }
    	}
    	return;
    }
    public boolean istrue(String ks)//判断ks是否合理，用来剪枝
    {
    	if(ks.substring(0,1).equals("0"))
    	{
    		return false;
    	}
    	for(int i=2;i<=ks.length();i++)
    	{
    		if(ks.substring(i-1,i).equals("0")&&Integer.parseInt(ks.substring(i-2,i-1))>=3)
    		{
    			return false;
    		}
    	}
    	return true;
    }
    public ArrayList<String> getlist(String s)//开头返回合理的数据
    {
    	ArrayList<String>temp=new ArrayList<String>();
    	if(s.subSequence(0, 1).equals("0"))
    		return temp;
    	for(int i=1;i<=s.length()&&i<=2;i++)
    	{
    		String st=s.substring(0,i);
    		if(Integer.parseInt(st)<=26)
    		{
    			temp.add(s.substring(0,i));
    		}  		
    	}
//    	System.out.print("temp=");
//    	for(String thiss:temp)
//    	{
//    		System.out.print(thiss+" ");
//    	}
    	return temp;
    }
}
