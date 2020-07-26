package shastri.swaroop.harman;

import java.util.Comparator;

public class EmpByAgeAndSalComparator implements Comparator<Employee>{
	public int compare(Employee emp0, Employee emp1) {
		// TODO Auto-generated method stub
		int agediff = emp0.getAge() -emp1.getAge(); 
		int saldiff = emp0.getSalary() -emp1.getSalary();
		int ageAndSalDiff = agediff - saldiff;
		
		if(ageAndSalDiff > 0)
			return 1;
		if(ageAndSalDiff<0)
			return -1;
		return 0;
	}
}
