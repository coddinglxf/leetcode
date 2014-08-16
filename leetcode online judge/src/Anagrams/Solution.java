package Anagrams;

import java.util.*;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String strs[]={"aat","eat","ate","tea","tta"};
         Solution solution=new Solution();
         solution.anagrams(strs);
	}

	public ArrayList<String> anagrams(String[] strs) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		ArrayList<ele> elelist = new ArrayList<ele>();
		ArrayList<String> list = new ArrayList<String>();
		elelist.clear();
		list.clear();
		for (int i = 0; i < strs.length; i++) {
			String temp = strs[i];
			char c[] = temp.toCharArray();
			int a[] = new int[26];
			ele e = new ele();
			for (int j = 0; j < c.length; j++) {
				a[(int) c[j] - 97]++;
			}
			e.id = i;
			e.a = a;
			elelist.add(e);
		}

		for (int i = 0; i < elelist.size(); i++) {
			for (int j = i + 1; j < elelist.size(); j++) {
				ele e1 = elelist.get(i);
				ele e2 = elelist.get(j);
				if (istrue(e1.a, e2.a)) {
					if (e1.flags != true) {
						System.out.println(strs[e1.id]);
						list.add(strs[e1.id]);
						elelist.get(i).flags = true;
					}
					if (e2.flags != true) {
						System.out.println(strs[e2.id]);
						list.add(strs[e2.id]);
						elelist.get(j).flags = true;
					}
				}
			}
		}
		return list;
	}

	public boolean istrue(int a[], int b[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	class ele {
		boolean flags = false;
		int id;
		int a[];
	}
}
