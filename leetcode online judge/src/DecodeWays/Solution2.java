package DecodeWays;

public class Solution2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution2 solution=new Solution2();
        String s="1214";
        System.out.println(solution.numDecodings(s));
	}

	public int numDecodings(String s) {
		int c[][] = new int[s.length()][s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("0")) {
				c[i][i] = 0;
			} else {
				c[i][i] = 1;
			}
		}
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.substring(i, i + 1).equals("0")) {
				c[i][i + 1] = 0;
			} else {
				if (Integer.parseInt(s.substring(i, i + 2)) > 26) {
					if (s.substring(i + 1, i + 2).equals("0")) {
						c[i][i + 1] = 0;
					} else {
						c[i][i + 1] = 1;
					}
				} else {
					if (s.substring(i + 1, i + 2).equals("0")) {
						c[i][i + 1] = 1;
					} else {
						c[i][i + 1] = 2;
					}
				}
			}
			System.out.print(c[i][i+1]+"  ");
		}
		
		System.out.println("!!!!!!!!!");
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+2;j<s.length();j++)
			{
				int k=i;
				int num=0;
				for(;k<j;k++)
				{
					num=num+c[i][k]*c[k+1][j];
				}
				c[i][j]=num-1;
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		return c[0][s.length()-1];
	}
}
