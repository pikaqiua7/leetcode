package cn.edu.zju.gd.l;

/**
 * https://leetcode.com/problems/longest-absolute-file-path/#/description
 * 
 * 388. Longest Absolute File Path
 * 
 * The string
 * "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
 * represents:
 * 
 * dir 
 *	subdir1 
 *		file1.ext 
 *		subsubdir1 
 *	subdir2 
 *		subsubdir2 
 *			file2.ext
 * 
 * We are interested in finding the longest (number of characters) absolute path
 * to a file within our file system. For example, in the second example above,
 * the longest absolute path is "dir/subdir2/subsubdir2/file2.ext", and its
 * length is 32 (not including the double quotes).
 * 
 * 
 * @author a592296
 *
 */
public class LongestAbsoluteFilePath
{

    public static void main(String[] args) throws InterruptedException
    {
	// TODO Auto-generated method stub
	String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
	System.out.println(lengthLongestPath(input));

    }

    public static int lengthLongestPath(String input)
    {
	if (null == input)
	    return 0;

	int max = 0;

	String[] strs = input.split("\n");
	int[] lens = new int[strs.length + 1];

	for (String str : strs)
	{
	    int index = str.lastIndexOf("\t") + 1;
	    lens[index + 1] = lens[index] + str.length() - index + 1;
	    if (str.contains("."))
		max = Math.max(lens[index + 1] - 1, max);
	}

	return max;
    }

}
