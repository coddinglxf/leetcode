package WordBreakII;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		String s = "aaaaaaaaaaaaaaaaaaaa";
		Set<String> dict = new HashSet<String>();
		dict.add("a");
		dict.add("aa");
		dict.add("aaa");
		dict.add("aaaa");
		dict.add("aaaaa");
		dict.add("aaaaaa");
		dict.add("aaaaaaa");

		System.out.println(solution.iswordBreak(s, dict));
		System.out.println(s);
        solution.wordBreak(s, dict);
	}

	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> res = new ArrayList<String>();

	public ArrayList<String> wordBreak(String s, Set<String> dict) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		list.clear();
		res.clear();
		DFS(s, dict, "", s);
		return list;
	}
   
	public void DFS(String ks, Set<String> dict, String cur, String s) {
		if (cur.equals(s)) {
			// 怎么处理
			
			String line = "";
			//System.out.print("add :");
			for (String thiss : res) {
				line = line + thiss + " ";
				System.out.print(thiss + " ");
			}
			list.add(line.substring(0, line.length() - 1));
			System.out.println();
			return;
		}
		ArrayList<String> temp = getlist(ks, dict);
		for (int i = 0; i < temp.size(); i++) {
			if(iswordBreak(ks, dict))
			{
				res.add(temp.get(i));
				DFS(ks.substring(temp.get(i).length()),dict,cur+temp.get(i),s);
				res.remove(res.size() - 1);
			}
			
		}
		return;
	}

	public ArrayList<String> getlist(String s, Set<String> dict) {
		ArrayList<String> list = new ArrayList<String>();
		// 获得s开头中，使得有词出现在list中
		for (int i = 1; i <= s.length(); i++) {
			String temp = s.substring(0, i);
			if (dict.contains(temp)) {
				list.add(temp);
			}
		}
		return list;
	}
    
	
	public boolean iswordBreak(String s, Set<String> dict) {
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
		if (list.isEmpty()) {
			return false;
		} else {
			Integer index = list.get(list.size() - 1);
			return index == 0;
		}

	}
}
