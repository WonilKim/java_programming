package chapter07;

public class Student extends Person {
	private String major;

	public Student() {
		System.out.println("Student 생성자 호출");
	}
	
	public Student(String name, int age, String major) {
		//setName(name);
		//setAge(age);
		super(name, age);
		
		this.major = major;
	}


	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.name + ":" + super.age + ":" + this.major;
	}

}