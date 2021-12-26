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
		//파일 작성 부분
		PrintWriter pw = new PrintWriter("D:/DoitJava/DoitJava/TestCode/src/testCode/Text8.txt");
		String[] data = {"I", "am", "a", "boy"};
		
		for(int i = 0; i < data.length; i++) {
			pw.print(data[i] + " ");
			System.out.print(data[i] + " ");
		}
		pw.close();
		System.out.println();
		//파일 읽기 부분
		BufferedReader brStr // brStr은 파일이 위치한 주소 값
		= new BufferedReader(new FileReader("D:/DoitJava/DoitJava/TestCode/src/testCode/Text8.txt"));
		System.out.println(brStr);
		String str = brStr.readLine();
		brStr.close();
		
		//파일 출력 부분
		String[] strResult = str.split(" "); //공백을 기준으로 String 배열에 저장함 - 구글 검색으로 찾음
		PrintWriter pwResult = new PrintWriter("D:/DoitJava/DoitJava/TestCode/src/testCode/Text8Result.txt");
		Arrays.sort(strResult, String.CASE_INSENSITIVE_ORDER);
		for(int i = 0; i < strResult.length; i++) {
			pwResult.print(strResult[i] + " ");
			System.out.print(strResult[i] + " ");
		}
		pwResult.close();
	}
}
