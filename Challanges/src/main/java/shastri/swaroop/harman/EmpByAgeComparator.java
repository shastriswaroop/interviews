package shastri.swaroop.harman;

import java.util.Comparator;

public class EmpByAgeComparator implements Comparator<Employee>{
	public int compare(Employee emp0, Employee emp1) {
		// TODO Auto-generated method stub
		int ageDiff = emp0.getAge() - emp1.getAge();
		
		if(ageDiff > 0)
			return 1;
		if(ageDiff<0)
			return -1;
		return 0;
	}
}
