package testCode;

public class StudentInfo {//OutputStream�� ����ϱ� ����(����ȭ)
	private String name; //�̸�
	private String studentNum; //�й�
	private String department; //�а�
	private String grade; //����
	private String height; //Ű
	private String age; //����
	
	public StudentInfo(String name, String studentNum, String department, String grade, String height, String age) {
		super();
		this.name = name;
		this.studentNum = studentNum;
		this.department = department;
		this.grade = grade;
		this.height = height;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public String getDepartment() {
		return department;
	}

	public String getGrade() {
		return grade;
	}

	public String getHeight() {
		return height;
	}

	public String getAge() {
		return age;
	}
	
	@Override
	public String toString() {//toString�޼ҵ带 ������(Overriding)�ϸ� ��ü�� �ּҰ��� �ƴ� toString�� ��µȴ�.
		return name + " " + studentNum + " " + department + " " + grade + " " + height + " " + age ;
	}
}
