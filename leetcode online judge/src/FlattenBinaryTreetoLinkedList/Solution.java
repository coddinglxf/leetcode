package FlattenBinaryTreetoLinkedList;

import java.util.ArrayList;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public void flatten(TreeNode root)
    {
        // Note: The Solution object is instantiated only once and is reused by each test case.
    	if(root==null)
    		return;
        list.clear();
        pretravel(root);
        for(int i=0;i<list.size();i++)
        {
        	if(i==0)
        	{
        		root=list.get(i);
        		root.left=null;
        		if(i+1>=list.size())
        		{
        			root.right=null;
        		}
        		else
        		{
        			root.right=list.get(i+1);
        		}      		
        	}  
        	else if(i==list.size()-1)
        	{
        		list.get(i).right=null;
        		list.get(i).left=null;
        	}
        	else 
        	{
        		list.get(i).left=null;
        		list.get(i).right=list.get(i+1);
        	}
        }
    }
    ArrayList<TreeNode>list=new ArrayList<TreeNode>();
    public void pretravel(TreeNode root)
    {
    	if(root==null)
    	{
    		return;
    	}
    	list.add(root);
    	pretravel(root.left);
    	pretravel(root.right);
    }
}
 
 class TreeNode 
 {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
 }