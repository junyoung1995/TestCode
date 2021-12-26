package testCode;

public class StudentInfo {//OutputStream을 사용하기 위해(직렬화)
	private String name; //이름
	private String studentNum; //학번
	private String department; //학과
	private String grade; //성적
	private String height; //키
	private String age; //나이
	
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
	public String toString() {//toString메소드를 재정의(Overriding)하면 객체의 주소값이 아닌 toString이 출력된다.
		return name + " " + studentNum + " " + department + " " + grade + " " + height + " " + age ;
	}
}
