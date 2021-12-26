package testCode;

import java.util.Arrays;

public class Test8 {
	 public static void main(String[] args) {
		String[] str = {"I", "am", "a", "boy"};
		Arrays.sort(str, String.CASE_INSENSITIVE_ORDER );
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
	 }
}