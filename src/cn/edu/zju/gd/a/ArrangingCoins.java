package cn.edu.zju.gd.a;

/**
 * https://leetcode.com/problems/arranging-coins/#/description
 * 
 * 441. Arranging Coins
 * 
 * You have a total of n coins that you want to form in a staircase shape, where
 * every k-th row must have exactly k coins.
 * 
 * Given n, find the total number of full staircase rows that can be formed.
 * 
 * n is a non-negative integer and fits within the range of a 32-bit signed
 * integer.
 * 
 * Example 1: n = 5, Because the 3rd row is incomplete, we return 2.
 * 
 * Example 2: n = 8, Because the 4th row is incomplete, we return 3.
 * 
 * @author pikaqiua7
 *
 */
public class ArrangingCoins {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	for (int i = 0; i < 20; i++)
	    System.out.println("i: "+ i + ", arrange: " + arrangeCoins(i));
	
//	System.out.println(Integer.MAX_VALUE);
	
	// Expected: 60070
	System.out.println("i: 1804289383, arrange: " + arrangeCoins(1804289383));
    }

    public static int arrangeCoins(int n) {
	return (int)(Math.sqrt(2*(long)n+0.25)-0.5);
    }

}
