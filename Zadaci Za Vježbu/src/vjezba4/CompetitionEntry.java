package vjezba4;

public class CompetitionEntry {

	private Teacher teacher;
	private Dessert dessert;	
	private Student[] students;
	private int[] ratings;
	
	private int i;
	
	public CompetitionEntry(Teacher t, Dessert d) {
		this.teacher = t;
		this.dessert = d;
		
		this.students = new Student[3];
		this.ratings = new int[3];
		this.i = 0;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public int[] getRatings() {
		return ratings;
	}

	public void setRatings(int[] ratings) {
		this.ratings = ratings;
	}

	public boolean addRating(Student s, int grade) {
		if(i < 3) {
			this.students[i] = s;
			this.ratings[i] = grade;
			i++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getRating() {
		double d = 0;
		int z = 0;
		for(int j = 0; j < students.length; j++) {
			if(ratings[j] != 0) {
				z++;
				d += ratings[j];
			}
		}
		if(z == 0) return 0;
		
		return d / z;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
