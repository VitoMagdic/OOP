package vjezba4;

import java.util.Objects;

public class Person {

	protected String name, surname;
	protected int age;
	
	public Person(String n, String s, int a) {
		name = n;
		surname = s;
		age = a;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("Name : %s \nSurname : %s \nAge : %d", name, surname, age);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}

	public static void main(String[] args) {

	}

}
