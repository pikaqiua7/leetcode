package cn.edu.zju.gd.l;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/#/description
 * 
 * 5. Longest Palindromic Substring
 * 
 * Given a string s, find the longest palindromic substring in s. You may assume
 * that the maximum length of s is 1000.
 * 
 * Example:
 * 
 * Input: "babad"
 * 
 * Output: "bab"
 * 
 * Note: "aba" is also a valid answer.
 * 
 * Example:
 * 
 * Input: "cbbd"
 * 
 * Output: "bb"
 * 
 * 
 * @author a592296
 *
 */
public class LongestPalindromicSubstring
{
    private static int start = 0;
    private static int maxlen = 0;

    public static void main(String[] args)
    {
	String s = "babad";
	System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s)
    {
	int len = s.length();

	if (len < 2)
	    return s;

	for (int i = 0; i < len; i++)
	{
	    palindromeSingleString(s, i, i);
	    palindromeSingleString(s, i, i+1);
	}

	return s.substring(start, start + maxlen - 1 );
    }
    
    public static void palindromeSingleString(String s, int i, int j)
    {
	System.out.println("i: "+ i + ", j:" + j);
	while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j))
	{
	    i--;
	    j++;
	}
	
	System.out.println("i: "+ i + ", j:" + j);
	if(maxlen < j - i + 1)
	{
	    start = i + 1;
	    maxlen = j - i;
	    System.out.println("start: "+ start + ", maxlen:" + maxlen);
	}
    }
}
