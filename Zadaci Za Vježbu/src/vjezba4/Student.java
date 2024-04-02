package vjezba4;

import java.util.Objects;

public class Student extends Person {

	protected String studentId;
	protected short academicYear;
	
	public Student(String n, String s, int a, String id, short y) {
		super(n, s, a);
		studentId = id;
		academicYear = y;
	}
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public short getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(short academicYear) {
		this.academicYear = academicYear;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", academicYear=" + academicYear + ", name=" + name + ", surname="
				+ surname + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(academicYear, studentId);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Student other = (Student) obj;
		return ((Student) this).studentId.equals(((Student) other).studentId);
	}

	public static void main(String[] args) {
		
		Person p3 = new Student("Ivo","Zelda", 25, "0036312123", (short)3);
		Person p4 = new Student("Marko","Marić", 25, "0036312123", (short)5);
		System.out.println(p3.equals(p4));
	}

}
