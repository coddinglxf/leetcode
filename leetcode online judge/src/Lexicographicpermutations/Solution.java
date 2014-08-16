package Lexicographicpermutations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;

import java.io.IOException;

import java.io.OutputStreamWriter;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 0, 1, 2, 3, 4 };
		Solution s = new Solution();
		s.per(a, 0, a.length-1);
	}

	int num = 0;

	public void per(int a[], int start, int end) {
		if (start == end) {
			num++;
			System.out.print(num + ":" );
			for (int i = 0; i < a.length; i++)
			{
				System.out.print (a[i] + " ");
			}
//			if(num<=1010000)
//			{
//				write(num, a);
//			}
			System.out.println();
			return;
		}

		for (int j = start; j <= end; j++) {
			int temp = a[start];
			a[start] = a[j];
			a[j] = temp;

			per(a, start + 1, end);// 递归还原

			temp = a[start];
			a[start] = a[j];
			a[j] = temp;
		}
	}
	
	public void write(int num,int a[])
	{
		BufferedWriter bw=null;
		File f=null;
	    try 
	    {
			f=new File("E:\\1.txt");
			if(!f.exists())
			{
				f.createNewFile();
			}
			bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f,true)));//追加文件
			bw.write(num+":");
			for(int i=0;i<a.length;i++)
			{
				bw.write(a[i]+" ");
			}
			bw.write("\r\n");
		} catch (Exception e) {
			e.printStackTrace();
		}finally
		{
			try
			{
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
