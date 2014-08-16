package MergeIntervals;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Solution solution=new Solution();
         Interval in1=new Interval(1,3);
         Interval in2=new Interval(2,6);
         Interval in3=new Interval(8,10);
         Interval in4=new Interval(15,18);
         ArrayList<Interval> intervals=new ArrayList<Interval>();
         intervals.add(in1);
        
         intervals.add(in3);
         intervals.add(in2);
         intervals.add(in4);
         solution.merge(intervals);
	}

	public ArrayList<Interval> merge(ArrayList<Interval> intervals)
	{
	  Interval temp[]=new Interval[intervals.size()];
	  int ki=0;
	  for(Interval inter:intervals)
	  {
		  temp[ki]=inter;
		  ki++;
	  }
	  //按照start部分开始进行排序这个数组
//	  for(int i=0;i<temp.length;i++)
//	  {
//		  for(int j=i+1;j<temp.length;j++)
//		  {
//			  if(temp[j].start<=temp[i].start)
//			  {
//				  Interval tempk=temp[i];
//				  temp[i]=temp[j];
//				  temp[j]=tempk;
//			  }
//		  }
//	  }
	  QuickSortRandomSortTest qsort=new QuickSortRandomSortTest();
	  qsort.sort(temp, 0, temp.length-1);
	  Stack<Interval>stack=new Stack<Interval>();
	  for(int i=0;i<temp.length;i++)
	  {
		  if(i==0)
		  {
			  stack.push(temp[i]);
		  }
		  else
		  {
			  Interval ins=stack.peek();
			  if(ins.end>=temp[i].start)
			  {  
				  Interval tempk=new Interval();
				  if(ins.end<=temp[i].end)
				  {
					  tempk =new Interval(ins.start,temp[i].end);
				  }
				  else
				  {
					  tempk=new Interval(ins.start,ins.end);
				  }
				  stack.pop();
				  stack.push(tempk);
			  }
			  else
			  {
				  stack.push(temp[i]);
			  }
		  }
	  }
	  
	  Stack<Interval>tempstack=new Stack<Interval>();
	  while(!stack.isEmpty())
	  {
		  tempstack.push(stack.pop());
	  }
	  
	  
	  ArrayList<Interval>list=new ArrayList<Interval>();
	  while(!tempstack.isEmpty())
	  {
		  list.add(tempstack.pop());
	  }
	  
	  for(Interval i:list)
	  {
		  System.out.print(i.start+" "+i.end+"  ;");
	  }
      return list;
	}
}
class QuickSortRandomSortTest
{
	public void sort(Interval a[], int p, int r)
	{
		if (p < r) {
			int q = this.position(a, p, r);
			this.sort(a, p, q - 1);
			this.sort(a, q + 1, r);
		}
	}
	public int position(Interval a[], int p, int r)
	{
		//随机化主元，将主元一定放在第一个的位置上，通过交换实现
		int radomnumber=GetRadom(p, r);
		//System.out.println();
		//System.out.println(radomnumber+"   "+a[radomnumber]);
		exchange(a, p, radomnumber);
		//////////////////////////////////////////////
		int key=a[p].start;
		int i=p;
		for(int j=p+1;j<=r;j++)
		{
			if(a[j].start<=key)
			{
				i=i+1;
				//exchange
				exchange(a, i, j);
			}
		}
		exchange(a,i,p);
	    return i;
	}
	public void exchange(Interval a[],int i, int j)
	{
		Interval temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public int GetRadom(int p,int r)
	{
		int i=(int)((r-p)*Math.random())+p+1;
		return i;
	}
}
class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}