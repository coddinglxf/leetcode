package WordBreak;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//     ArrayList<Integer>it=new ArrayList<Integer>();
//     it.add(1);
//     it.add(11);
//     it.add(111);
//     it.add(1111);
//     for(Integer index: it)
//     {
//    	 System.out.println(index);
//     }
		String s="leetdogcode";
	    Set<String>dict=new HashSet<String>();
	    dict.add("leet");
	    dict.add("code");
	    dict.add("dog");
	    Solution ss=new Solution();
	    ss.wordBreak(s, dict);
	    System.out.println(ss.wordBreak(s, dict));
	}

	public boolean wordBreak(String s, Set<String> dict) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = s.length() - 1; i >= 0; i--) {
			String sub = s.substring(i);
			if (dict.contains(sub)) {
				list.add(i);
			} else {
				for (Integer index : list) {
					sub = s.substring(i, index);
					if (dict.contains(sub)) {
						list.add(i);
						break;
					}
				}
			}
		}
		  for(Integer index:list)
		    {
		  	  System.out.print(index+" ");
		    }
		
		if (list.isEmpty()) {
			return false;
		} else {
			Integer index = list.get(list.size()-1);
			return index == 0;
		}
	
	}
  
}
