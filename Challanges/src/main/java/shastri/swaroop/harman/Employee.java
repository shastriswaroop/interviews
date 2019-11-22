package shastri.swaroop.harman;

public class Employee {

	int salary;
	int age;
	
	Employee(int age, int salary){
		this.age = age;
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
