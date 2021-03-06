package shastri.swaroop.harman;

public class Employee implements Comparable<Employee>{

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
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		int ageDiff = this.age - emp.getAge();
		
		if(ageDiff > 0)
			return 1;
		if(ageDiff<0)
			return -1;
		return 0;
	}	
}
