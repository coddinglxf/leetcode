package WordLadder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> dict = new HashSet<String>();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		String start = "cog";
		String end = "cog";
		Solution2 solution = new Solution2();
		solution.ladderLength(start, end, dict);
	}

	public static int nil = Integer.MAX_VALUE;
//原因可能是由于matrix造成的，试试不用邻接矩阵而是用邻接表来表示问题
	public int ladderLength(String start, String end, HashSet<String> dict) {
		ArrayList<ele> dictlist = getele(dict, start, end);
		boolean matrix[][] = getmatrix(dictlist);
		Queue<ele> queue = new LinkedList<ele>();
		queue.add(dictlist.get(0));
		while (!queue.isEmpty()) {
			ele node = queue.poll();
			int num = node.id;
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[num][i] == true && dictlist.get(i).color == 1) {
					dictlist.get(i).dist = node.dist + 1;
					dictlist.get(i).color = 2;
					queue.add(dictlist.get(i));
				}
			}
			node.color = 3;
		}
		for(int i=0;i<dictlist.size();i++)
			
		{
			ele e=dictlist.get(i);
			System.out.println(e.id+" "+e.content+" "+e.dist);
		}
		if(dictlist.get(dictlist.size() - 1).dist==Integer.MAX_VALUE)
			return 0;
		return dictlist.get(dictlist.size() - 1).dist;
	}
	public ArrayList<ele> getele(HashSet<String> dict, String start, String end) {

		ArrayList<ele> ret = new ArrayList<ele>();
		int num = 1;
		ret.add(new ele(start, 0,1,2));
		Iterator<String> it = dict.iterator();
		while (it.hasNext()) {
			ret.add(new ele(it.next(), num,nil,1));
			num++;
		}
		ret.add(new ele(end, num,nil,1));
		return ret;
	}

	public boolean[][] getmatrix(ArrayList<ele> ret) {
		boolean matrix[][] = new boolean[ret.size()][ret.size()];
		for (int i = 0; i < ret.size(); i++) {
			for (int j = i + 1; j < ret.size(); j++) {
				if (istrue(ret.get(i).content, ret.get(j).content)) {
					matrix[i][j] = matrix[j][i] = true;
				}
				else{
					matrix[i][j] = matrix[j][i] = false;
				}
			}
		}
		return matrix;
	}

	public boolean istrue(String s1, String s2) {
		int sum = 0;
		if (s1.length() != s2.length()) {
			return false;
		} else {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					sum++;
				}
			}
		}
		return sum == 1;
	}
}

class ele {
	String content;
	int color;
	int dist = 0;
	int id;

	public ele(String content, int id,int dist,int color) {
		this.color=color;
		this.dist=dist;
		this.id = id;
		this.content = content;
		this.color = 1;
	}
}