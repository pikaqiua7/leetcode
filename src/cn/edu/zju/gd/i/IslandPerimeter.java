package cn.edu.zju.gd.i;

/**
 * https://leetcode.com/problems/island-perimeter/#/description
 * 
 * 463. Island Perimeter
 * 
 * You are given a map in form of a two-dimensional integer grid where 1
 * represents land and 0 represents water. Grid cells are connected
 * horizontally/vertically (not diagonally). The grid is completely surrounded
 * by water, and there is exactly one island (i.e., one or more connected land
 * cells). The island doesn't have "lakes" (water inside that isn't connected to
 * the water around the island). One cell is a square with side length 1. The
 * grid is rectangular, width and height don't exceed 100. Determine the
 * perimeter of the island.
 * 
 * Example: [[0,1,0,0], [1,1,1,0], [0,1,0,0], [1,1,0,0]]
 * 
 * Answer: 16
 * 
 * @author a592296
 *
 */
public class IslandPerimeter
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	int[][] grid = {{1,0}};
	System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid)
    {
	int count = 0;
	
	if(null == grid || grid[0].length == 0 || grid.length == 0) return count;

	for (int i = 0; i < grid.length; i++)
	    for (int j = 0; j < grid[0].length; j++)
		if (grid[i][j] == 1){
		    count += 4;
		    if(i > 0 && grid[i-1][j] == 1) count -= 2;
		    if(j > 0 && grid[i][j-1] == 1) count -= 2;
		}

	return count;
    }
}
