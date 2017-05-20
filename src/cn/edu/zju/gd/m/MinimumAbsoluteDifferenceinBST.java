package cn.edu.zju.gd.m;

import java.util.ArrayList;

import cn.edu.zju.gd.util.TreeNode;

/**
 * https://leetcode.com/problems/minimum-absolute-difference-in-bst/#/
 * description
 * 
 * 530. Minimum Absolute Difference in BST
 * 
 * Given a binary search tree with non-negative values, find the minimum
 * absolute difference between values of any two nodes.
 * 
 * Example:
 * 
 * Input:
 * 
 * 1 \ 3 / 2
 * 
 * Output: 1
 * 
 * Explanation: The minimum absolute difference is 1, which is the difference
 * between 2 and 1 (or between 2 and 3).
 * 
 * 
 * @author a592296
 *
 */
public class MinimumAbsoluteDifferenceinBST
{
    static ArrayList<Integer> array = new ArrayList<Integer>();
    
    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	int[] nums = {8, 4, 10, 2, 5, 9, 13, 7, 17, 6, 15};
	TreeNode root = TreeNode.insertAsBST(nums);
	System.out.println(getMinimumDifference(root));
    }

    public static int getMinimumDifference(TreeNode root)
    {
	int min = Integer.MAX_VALUE;
	getSortedArray(root);
	
	for (int i = 1; i < array.size(); i++)
	{
	    int diff = array.get(i) - array.get(i - 1);
	    if(diff < min) min = diff;
	}
	
	return min;
    }
    
    public static void getSortedArray(TreeNode root)
    {
	if(null != root.left) getSortedArray(root.left);
	array.add(root.val);
	if(null != root.right) getSortedArray(root.right);
    }
}
