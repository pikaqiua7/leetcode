package cn.edu.zju.gd.m;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/#/description
 * 
 * 4. Median of Two Sorted Arrays
 * 
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * 
 * Find the median of the two sorted arrays. The overall run time complexity
 * should be O(log (m+n)).
 * 
 * Example 1:
 * 
 * nums1 = [1, 3] nums2 = [2]
 * 
 * The median is 2.0
 * 
 * Example 2:
 * 
 * nums1 = [1, 2] nums2 = [3, 4]
 * 
 * The median is (2 + 3)/2 = 2.5
 * 
 * 
 * @author a592296
 *
 */
public class MedianofTwoSortedArrays
{

    //1, 3, 4, 6, 9, 12    2, 7, 8, 10, 13
    public static void main(String[] args)
    {
	int[] num1 =
	{ 1, 2 };
	int[] num2 =
	{ 3, 4 };

	System.out.println(findMedianSortedArrays(num1, num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
	if(nums1.length == 0 && nums2.length == 0) 
	    return 0;
	    
	double median = 0;

	int[] merge = new int[nums1.length + nums2.length];

	for (int index = 0, i = 0, j = 0; index < nums1.length + nums2.length; index++)
	{
	    if (i < nums1.length && j < nums2.length)
	    {
		if (nums1[i] <= nums2[j])
		{
		    merge[index] = nums1[i];
		    i++;
		}
		else
		{
		    merge[index] = nums2[j];
		    j++;
		}
	    }
	    else if (i >= nums1.length && j < nums2.length)
	    {
		merge[index] = nums2[j];
		j++;
	    }
	    else if (i < nums1.length && j >= nums2.length)
	    {
		merge[index] = nums1[i];
		i++;
	    }
	}

	if (merge.length % 2 == 0)
	{
	    median = (merge[merge.length/2] + merge[merge.length/2 - 1])/2.0;
	}
	else{
	    median = merge[(merge.length - 1)/2];
	}

	return median;
    }
}
