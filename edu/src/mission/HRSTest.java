package mission;

abstract class Employee {
	String name;
	int salary;
	int salaryEtc;
	int bonus = 0;

	public Employee(String name, int salary, int salaryEtc) {
		super();
		this.name = name;
		this.salary = salary;
		this.salaryEtc = salaryEtc;
	}
	
	public abstract void calcSalary();
	public abstract void calcBonus();
	
	public int getSalary() {
		return this.salary;
	}

	public int getSalaryEtc() {
		return this.salaryEtc;
	}

}

class Salesman extends Employee {
	
	
	public Salesman(String name, int salary, int salaryEtc) {
		super(name, salary, salaryEtc);
		// TODO Auto-generated constructor stub
	}

	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
		System.out.println(String.format("%15s", "기본급 : ") + getSalary());
		System.out.println(String.format("%15s", "판매 수당 : ") + getSalaryEtc());
		System.out.println(String.format("%15s", "합계 : ") + (getSalary() + getSalaryEtc()));
	}

	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
		System.out.println(String.format("%15s", "보너스 : ") + (getSalary() * 12 * 4));
	}
}

class Consultant extends Employee {
	
	public Consultant(String name, int salary, int salaryEtc) {
		super(name, salary, salaryEtc);
		// TODO Auto-generated constructor stub
	}

	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
		System.out.println(String.format("%15s", "기본급 : ") + getSalary());
		System.out.println(String.format("%15s", "컨설팅 특별 수당 : ") + getSalaryEtc());
		System.out.println(String.format("%15s", "합계 : ") + (getSalary() + getSalaryEtc()));
	}

	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
		System.out.println(String.format("%15s", "보너스 : ") + (getSalary() * 12 * 2));
	}
}

abstract class Manager extends Employee {
	
	public Manager(String name, int salary, int salaryEtc) {
		super(name, salary, salaryEtc);
		// TODO Auto-generated constructor stub
	}

	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
		System.out.println(String.format("%15s", "기본급 : ") + getSalary());
		System.out.println(String.format("%15s", "팀 성과 수당 : ") + getSalaryEtc());
		System.out.println(String.format("%15s", "합계 : ") + (getSalary() + getSalaryEtc()));
	}

}

class Director extends Manager {
	
	public Director(String name, int salary, int salaryEtc) {
		super(name, salary, salaryEtc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Manager 보너스 = 기본급 * 12 * 6");
		System.out.println(String.format("%15s", "보너스 : ") + (getSalary() * 12 * 6));
	}
}

public class HRSTest {

	public static void main(String[] args) {
		
		Salesman s = new Salesman("Salesman", 300, 100);
		Consultant c = new Consultant("Consultant", 600, 200);
		Director d = new Director("Director", 800, 400);
		
		System.out.println("-".repeat(50));
		s.calcSalary();
		s.calcBonus();
		System.out.println("-".repeat(50));
		c.calcSalary();
		c.calcBonus();
		System.out.println("-".repeat(50));
		d.calcSalary();	
		d.calcBonus();

	}
}
