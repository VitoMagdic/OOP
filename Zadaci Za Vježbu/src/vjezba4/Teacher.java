package vjezba4;

import java.util.Objects;

public class Teacher extends Person {

	protected String email, subject;
	protected double salary;
	
	public Teacher(String n, String s, int a, String mail, String sub, double sal) {
		super(n, s, a);
		email = mail;
		subject = sub;
		salary = sal;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Email : %s \nSubject : %s \nSalary : %f", email, subject, salary);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(email, salary, subject);
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
		Teacher other = (Teacher) obj;
		return Objects.equals(email, other.email);
	}

	public void increaseSalary(int p) {
		salary *= 1 + ((double) p / 100); 
	}
	
	public static void increaseSalary(int p, Teacher...teach) {
		for(int i = 0; i < teach.length; i++) {
			teach[i].increaseSalary(p);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
