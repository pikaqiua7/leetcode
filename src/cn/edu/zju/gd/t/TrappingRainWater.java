package cn.edu.zju.gd.t;

/*
 * https://leetcode.com/problems/trapping-rain-water/#/description
 * 
 * 42. Trapping Rain Water
 * 
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

   For example, 
   Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 * 
 */
public class TrappingRainWater {

    static int sum = 0;

    public static void main(String[] args) {
	int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
	System.out.println(trap(height));
    }

    public static int trap(int[] height) {
	if (height.length == 2)
	    return 0;

	int max = 0;
	int leftmax = 0;
	int rightmax = 0;
	int left_index = 0;
	int right_index = height.length - 1;
	while (left_index < right_index) {
	    leftmax = Math.max(height[left_index], leftmax);
	    rightmax = Math.max(height[right_index], rightmax);

	    if (leftmax < rightmax) {
		if (height[left_index] < leftmax)
		    max += leftmax - height[left_index];
		left_index++;
	    } else {
		if(height[right_index] < rightmax)
		    max += rightmax - height[right_index];
		right_index--;
	    }

	}

	return max;
    }
}
