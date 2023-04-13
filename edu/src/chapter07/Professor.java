package chapter07;

public class Professor extends Person {
	private String subject;

	public Professor() {
		System.out.println("Professor 생성자 호출");
	}
	
	public Professor(String name, int age, String subject) {
		//setName(name);
		//setAge(age);
		super(name, age);
		
		this.subject = subject;
	}


	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return super.name + ":" + super.age + ":" + this.subject;
	}
}