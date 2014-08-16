package SingleNumberII;

import java.util.HashMap;
import java.util.Iterator;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Solution solution=new Solution();
       int A[]={1,1,2,3,3,1,3,2,2,6};
       System.out.println(solution.singleNumber(A));
	}
    public int singleNumber(int[] A)
	{
       int ret=-1;
	   HashMap<Integer, Integer>hash=new HashMap<Integer, Integer>();
	   for(int i=0;i<A.length;i++)
	   {
		   if(hash.containsKey(A[i]))
		   {
			   int index=hash.get(A[i]);
			   index++;
			   hash.put(A[i], index);
		   }
		   else
		   {
			   hash.put(A[i], 1);
		   }
	   }
	   Iterator<Integer>it=hash.keySet().iterator();
	   while(it.hasNext())
	   {
		   int key=it.next();
		   if(hash.get(key)==1)
		   {
			   ret=key;
			   break;
		   }
	   }
	   return ret;
    }
}
