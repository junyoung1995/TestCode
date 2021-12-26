package testCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test9 {
	public static void main(String[] args) throws IOException {
		//���� �ۼ� �κ�
		PrintWriter pw = new PrintWriter("D:/DoitJava/DoitJava/TestCode/src/testCode/Text8.txt");
		String[] data = {"I", "am", "a", "boy"};
		
		for(int i = 0; i < data.length; i++) {
			pw.print(data[i] + " ");
			System.out.print(data[i] + " ");
		}
		pw.close();
		System.out.println();
		//���� �б� �κ�
		BufferedReader brStr // brStr�� ������ ��ġ�� �ּ� ��
		= new BufferedReader(new FileReader("D:/DoitJava/DoitJava/TestCode/src/testCode/Text8.txt"));
		System.out.println(brStr);
		String str = brStr.readLine();
		brStr.close();
		
		//���� ��� �κ�
		String[] strResult = str.split(" "); //������ �������� String �迭�� ������ - ���� �˻����� ã��
		PrintWriter pwResult = new PrintWriter("D:/DoitJava/DoitJava/TestCode/src/testCode/Text8Result.txt");
		Arrays.sort(strResult, String.CASE_INSENSITIVE_ORDER);
		for(int i = 0; i < strResult.length; i++) {
			pwResult.print(strResult[i] + " ");
			System.out.print(strResult[i] + " ");
		}
		pwResult.close();
	}
}
