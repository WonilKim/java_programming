package chapter07;

public class LMSTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();

		e.setName("Employee");
		e.setAge(47);
		e.setDept("dept");

		p.setName("Professor");
		p.setAge(52);
		p.setSubject("subject");

		s.setName("Student");
		s.setAge(20);
		s.setMajor("major");

		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
		
		//
		System.out.println("=".repeat(50));
		
		//Employee e1 = new Employee();
		//System.out.println(e1);
		
		Employee e2 = new Employee("e2", 2, "dept");
		System.out.println(e2);
		
		//Professor p1 = new Professor();
		//System.out.println(p1);
		
		Professor p2 = new Professor("p2", 22, "subject");
		System.out.println(p2);
		
		//Student s1 = new Student();
		//System.out.println(s1);
		
		Student s2 = new Student("s2", 222, "major");
		System.out.println(s2);
		
		
	}
}