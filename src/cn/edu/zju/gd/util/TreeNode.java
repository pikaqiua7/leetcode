package cn.edu.zju.gd.util;

/**
 * Definition for a binary tree node.
 * 
 */
public class TreeNode
{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x)
    {
	val = x;
    }

    public static TreeNode insertAsBST(int[] nums)
    {
	TreeNode root = new TreeNode(nums[0]);
	for (int i = 1; i < nums.length; i++)
	{
	    insertAsBSTForNode(root, nums[i]);
	}

	return root;
    }

    public static void insertAsBSTForNode(TreeNode root, int num)
    {
	if (root.val > num)
	{
	    if (null == root.left)
		root.left = new TreeNode(num);
	    else
		insertAsBSTForNode(root.left, num);
	}
	else {
	    if (null == root.right)
		root.right = new TreeNode(num);
	    else
		insertAsBSTForNode(root.right, num);
	}
    }
    
    public static void printTree(TreeNode root)
    {
	if(null != root.left) printTree(root.left);
	System.out.print(root.val + ", ");
	if(null != root.right) printTree(root.right);
    }
    
    public static void main(String[] args)
    {
	int[] nums = {8, 4, 10, 2, 5, 9, 13, 7, 17, 6, 15};
	printTree(insertAsBST(nums));
    }
}