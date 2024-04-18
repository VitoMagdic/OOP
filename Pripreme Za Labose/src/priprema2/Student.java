package priprema2;

class Student {
    private String name, surname;
    private int age;
    public Student(String name, String surname, int age) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    
    static void sortStudentsOnAge(Student[] students) {
    	for(int i = 0; i < students.length - 1; i++) {
    		for(int j = i + 1; j < students.length; j++) {
    			Student z;
    			if(students[i].getAge() > students[j].getAge()) {
    				z = students[i];
    				students[i] = students[j];
    				students[j] = z;
    			}
    		}
    	}
    }
    
    public static void main(String[] args) {
    	
	}

}
