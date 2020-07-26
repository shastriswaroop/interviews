package shastri.swaroop.harman;

import java.util.Comparator;

public class EmpBySalComparator implements Comparator<Employee>{
	public int compare(Employee emp0, Employee emp1) {
		// TODO Auto-generated method stub
		int salDiff = emp0.getSalary() - emp1.getSalary();
		
		if(salDiff > 0)
			return 1;
		if(salDiff<0)
			return -1;
		return 0;
	}
}
