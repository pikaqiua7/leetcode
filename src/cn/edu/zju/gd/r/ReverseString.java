package cn.edu.zju.gd.r;

/*
 * https://leetcode.com/problems/reverse-string/#/description
 * 
 * 344 Reverse String
 * 
 * example: Given s = "hello", return "olleh".
 * 
 */
public class ReverseString {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverseString(s));
	}

	public static String reverseString(String s) {
		if(s == null)
			return null;
		
		char[] chars = s.toCharArray();
		StringBuffer stemp = new StringBuffer();
		
		for(int i = chars.length-1 ; i>=0; i--)
		{
			stemp.append(chars[i]);
		}
		
		return stemp.toString();
	}
}
