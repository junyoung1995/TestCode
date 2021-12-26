package testCode;

import java.util.Comparator;

public class StudentManagement {
	private StudentInfo[] studentList = new StudentInfo[10];
	private int listLength = 0;
	
	public boolean studentListLength() {
		return listLength < studentList.length;
	}
	
	public void addStudent(String name, String studentNum, String department, String grade, String height, String age) {
		studentList[listLength++] = new StudentInfo(name, studentNum, department, grade, height, age);
	}
	
	public StudentInfo[] getStudentList() {
		return studentList;
	}
	
	public int getListLength() {
		return listLength;
	}
}

