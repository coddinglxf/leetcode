package LongestConsecutiveSequence;
import java.util.HashSet;

public class Solution {
	public static void main(String[] args) {
		int num[] = { 0,2,1};
		Solution solution = new Solution();
		System.out.println(solution.longestConsecutive(num));
	}

	public static int nil = (int) Math.pow(2, 31);

	public int longestConsecutive(int[] num) {
		HashSet<Integer>hash=new HashSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			if (!hash.contains(num[i])) {
				hash.add(num[i]);
			}
		}
		int length = 0;
		for (int i = 0; i < num.length; i++) {

			if (hash.contains(num[i])) {
				int temp = num[i];
				hash.remove(temp);
				int left = temp - 1;
				int templength = 1;
				int right = temp + 1;
				while (hash.contains(left)) {
					templength++;
					hash.remove(left);
					left--;
				}
				while (hash.contains(right)) {
					templength++;
					hash.remove(right);
					right++;
				}
				if (templength >= length) {
					length = templength;
				}
			}

		}
		return length;
	}
}
