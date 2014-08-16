package PalindromePartitioningII;

import java.util.*;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		String string = "aabababacaac";
		solution.minCut(string);
	}

	ArrayList<String> res = new ArrayList<String>();
	int min = Integer.MAX_VALUE;

	public int minCut(String s) {
		DFS(s, s, "");
		System.out.println(this.min);
		return this.min;
	}

	public void DFS(String s, String ks, String cur) {
		if (cur.equals(s)) {
			min = Math.min(min, res.size()-1);
			return;
		}
		ArrayList<String> temp = getlist(ks);
		for (int i = 0; i < temp.size(); i++) {
			res.add(temp.get(i));
			DFS(s, ks.substring(temp.get(i).length(), ks.length()), cur+ temp.get(i));
			res.remove(res.size() - 1);
		}
		return;
	}

	public ArrayList<String> getlist(String s)// 获得s开头的所有回文
	{
		ArrayList<String> temp = new ArrayList<String>();
		for (int i = 1; i <= s.length(); i++) {
			String temps = s.substring(0, i);
			if (istrue(temps)) {
				temp.add(temps);
			}
		}
		return temp;
	}

	public boolean istrue(String s) {
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
