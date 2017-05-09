package leetcode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SubjectSelect {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream(new File("record.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
