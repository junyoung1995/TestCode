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
		int menu = 0; //��ȣ ����
		System.out.println("----------------------------------------------------");
		while(true) {
			System.out.println("--------�޴�--------");
			System.out.println("1. �����б�(�Է�)");
			System.out.println("2. �̸��� ����");
			System.out.println("3. �й��� ����");
			System.out.println("4. �а��� ����");
			System.out.println("5. ������ ����");
			System.out.println("6. Ű�� ����");
			System.out.println("7. ���̺� ����");
			System.out.println("8. ���α׷� ����");
			System.out.println("----------------------------------------------------");
			System.out.print("�Է�> ");
			menu = sc.nextInt();
			
			//���� �޼ҵ�
			if(menu == 8) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			switch(menu) {
			case 1 : //���� �Է�
				inputInfo();
				break;
			case 2 : //�̸� �� ����
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
				System.out.println("�ùٸ� �޴� ��ȣ�� �Է��� �ּ���");
				break;
			}
		}
	}
	public static void inputInfo() {
		smList.addStudent("ȫ�浿", "2015042360", "���а�", "C+", "174", "27");
		smList.addStudent("�ڻ���", "2012042160", "�濵�а�", "A+", "180", "30");
		smList.addStudent("���м�", "2000012360", "������а�", "B+", "170", "48");
		smList.addStudent("�̷ֹ�", "2016042240", "���б����а�", "D+", "162", "25");
		smList.addStudent("��ÿ�", "2010072360", "��ȣ�а�", "F", "157", "39");
		smList.addStudent("������", "2014071360", "���а�", "C", "188", "28");
		smList.addStudent("������", "2008062360", "�ǿ���", "B", "176", "40");
		smList.addStudent("������", "2001022360", "��������ΰ�", "A", "192", "49");
		smList.addStudent("��̼�", "2021543609", "��ǻ�Ͱ��а�", "D", "170", "20");
		smList.addStudent("Ȳ����", "1999242360", "ȣ�������а�", "A+", "180", "50");
		
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
			System.out.println(str); //�ٽ� ���� ���� ���
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
