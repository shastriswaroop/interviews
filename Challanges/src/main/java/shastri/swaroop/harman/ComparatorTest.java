package shastri.swaroop.harman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// sort employee objects using comparator and comparable interface
// based on age
// based on salary
// based on age and salary 

public class ComparatorTest {
	public static void main(String args[]) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(18,5000));
		employees.add(new Employee(38,4500));
		employees.add(new Employee(28,1500));
		employees.add(new Employee(28,5500));
		employees.add(new Employee(21,4500));

		Collections.sort(employees, new EmpByAgeComparator());
		for(Employee emp:employees) {
			System.out.println(emp.age);
		}

		Collections.sort(employees, new EmpBySalComparator());
		for(Employee emp:employees) {
			System.out.println(emp.getSalary());
		}

		Collections.sort(employees, new EmpByAgeAndSalComparator());
		for(Employee emp:employees) {
			System.out.println(emp.getAge() + " , " + emp.getSalary());
		}
		
	}
}
