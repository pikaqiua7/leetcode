package cn.edu.zju.gd.f;

/**
 * https://leetcode.com/problems/factorial-trailing-zeroes/#/description
 * 
 * 172. Factorial Trailing Zeroes
 * 
 * Given an integer n, return the number of trailing zeroes in n!.
 * 
 * Note: Your solution should be in logarithmic time complexity.
 * 
 *
 */
public class FactorialTrailingZeroes
{

    public static void main(String[] args)
    {
	System.out.println(trailingZeroes(30));
    }

    public static int trailingZeroes(int n)
    {
	int times = 0;
	int count = 0;
	for(int remain = n; remain != 0; times++)
	    remain = remain/5;

	for(int i = 1; i < times; i++)
	    count += n/Math.pow(5, i);
	
	return count;
    }
    
    public static int best_trailingZeroes(int n)
    {
	return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
