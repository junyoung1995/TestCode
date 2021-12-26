package testCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test10 {
	static String path = "D:/Test10.txt";
	static File file = new File(path);
	static StudentInfo[] studentList;
	static StudentManagement smList = new StudentManagement();
	private static String str;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0; //번호 선택
		System.out.println("----------------------------------------------------");
		while(true) {
			System.out.println("--------메뉴--------");
			System.out.println("1. 파일읽기(입력)");
			System.out.println("2. 이름별 정렬");
			System.out.println("3. 학번별 정렬");
			System.out.println("4. 학과별 정렬");
			System.out.println("5. 성적별 정렬");
			System.out.println("6. 키별 정렬");
			System.out.println("7. 나이별 정렬");
			System.out.println("8. 프로그램 종료");
			System.out.println("----------------------------------------------------");
			System.out.print("입력> ");
			menu = sc.nextInt();
			
			//종료 메소드
			if(menu == 8) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			switch(menu) {
			case 1 : //파일 입력
				inputInfo();
				break;
			case 2 : //이름 순 정렬
				sortName();
				break;
			case 3 :
				sortStudentNum();
				break;
			case 4 :
				sortDepartment();
				break;
			case 5 :
				sortGrade();
				break;
			case 6 :
				sortHeight();
				break;
			case 7 :
				sortAge();
				break;
			default :
				System.out.println("올바른 메뉴 번호를 입력해 주세요");
				break;
			}
		}
	}
	public static void inputInfo() {
		smList.addStudent("홍길동", "2015042360", "수학과", "C+", "174", "27");
		smList.addStudent("박상태", "2012042160", "경영학과", "A+", "180", "30");
		smList.addStudent("김학선", "2000012360", "국어국문학과", "B+", "170", "48");
		smList.addStudent("최미래", "2016042240", "수학교육학과", "D+", "162", "25");
		smList.addStudent("방시우", "2010072360", "경호학과", "F", "157", "39");
		smList.addStudent("염희정", "2014071360", "약학과", "C", "188", "28");
		smList.addStudent("유민희", "2008062360", "의예과", "B", "176", "40");
		smList.addStudent("강시정", "2001022360", "산업디자인과", "A", "192", "49");
		smList.addStudent("긴미숙", "2021543609", "컴퓨터공학과", "D", "170", "20");
		smList.addStudent("황민혁", "1999242360", "호텔조리학과", "A+", "180", "50");
		
		try {
			PrintWriter pw = new PrintWriter(file);
		    studentList = smList.getStudentList();
			for(int i = 0; i < smList.getListLength(); i++) {
				pw.println(studentList[i]);
				System.out.println(studentList[i]);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void sortName() {
		try {
			BufferedReader brStr = new BufferedReader(new FileReader(file));
			while((str = brStr.readLine()) != null) {
				System.out.println(str);
			}
			brStr.close();
			System.out.println(str); //다시 여러 줄이 담김
			String[] sortName = str.split("\r\n");
			for(int i = 0; i < sortName.length; i++) {
				System.out.println(sortName[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void sortStudentNum() {
		
	}
	public static void sortDepartment() {
		
	}
	public static void sortGrade() {
		
	}
	public static void sortHeight() {
		
	}
	public static void sortAge() {
		
	}
}
