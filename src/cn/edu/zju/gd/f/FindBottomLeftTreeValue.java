package cn.edu.zju.gd.f;

import cn.edu.zju.gd.util.TreeNode;

/*
 * https://leetcode.com/problems/find-bottom-left-tree-value/#/description
 * 
 * 513. Find Bottom Left Tree Value
 * ####Given a binary tree, find the leftmost value in the last row of the tree.###
 * 
 * Example1:  Input:     2
     			/ \
    	               1   3

   	      Output:  1
 * Example2:  Input:     1
       			/ \
      	               2   3
     		      /   / \
    		     4   5   6
       			/
      		       7

   	       Output:  7
    
 * 
 */
public class FindBottomLeftTreeValue {

    private int h = 0;
    private int var = 0;

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	TreeNode node1 = new TreeNode(1);
	node1.left = new TreeNode(2);
	node1.right = new TreeNode(3);

	System.out.println(new FindBottomLeftTreeValue().findBottomLeftValue(node1));

    }

    public int findBottomLeftValue(TreeNode root) {
	findBottomLeftValue(root, 1);
	return var;
    }

    public void findBottomLeftValue(TreeNode node, int depth) {
	if (h < depth) {
	    var = node.val;
	    h = depth;
	}

	if (null != node.left)
	    findBottomLeftValue(node.left, depth + 1);
	if (null != node.right)
	    findBottomLeftValue(node.right, depth + 1);
    }
}
