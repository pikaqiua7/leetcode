package cn.edu.zju.gd.s;

/*
 * https://leetcode.com/problems/search-a-2d-matrix-ii/#/description
 * 
 * 240. Search a 2D Matrix II
 * 
 * For example,
Consider the following matrix:
[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.

Given target = 20, return false.
 * 
 */
public class Searcha2DMatrixII {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

//	int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
//		{ 18, 21, 23, 26, 30 } };
	
	int[][] matrix = {{}};

	System.out.println(matrix.length);
	
	System.out.println(searchMatrix(matrix, 1));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
	    
	for (int i = 0; i < matrix.length; i++) {
	    if(matrix[i].length == 0 ) return false;
		
	    if (matrix[i][matrix[i].length - 1] == target)
		return true;

	    for (int j = 0; j < matrix[i].length - 1; j++) {
		if (matrix[i][j] == target)
		    return true;

		if (matrix[i][j] < target && target < matrix[i][j + 1])
		    break;
	    }
	}
	return false;
    }

}
