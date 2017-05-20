package cn.edu.zju.gd.c;

/**
 * https://leetcode.com/problems/climbing-stairs/#/description
 * 
 * 70. Climbing Stairs
 * 
 * You are climbing a stair case. It takes n steps to reach to the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 * 
 * Note: Given n will be a positive integer.
 * 
 * 
 * @author a592296
 *
 */
public class ClimbingStairs
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	int count = 20;
	for (int i = 1; i <= count; i++)
	    System.out.println("i: " + i + ", climb stairs: " + climbStairs(i));
    }

    public static int climbStairs(int n)
    {
	if (n == 1 || n == 2)
	    return n;

	int step1 = 1;
	int step2 = 2;
	int steps = 0;
	for (int i = 3; i <= n; i++)
	{
	    steps = step1 + step2;
	    step1 = step2;
	    step2 = steps;
	}

	return steps;
    }
}
