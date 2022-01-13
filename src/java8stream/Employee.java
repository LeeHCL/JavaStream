package java8stream;

public class Employee {
	
	int ssn;
	String empName;
	String birthday;
	int empAge;
	int empSalary;
	boolean empDependents;
	
	public Employee(int social, String name, String bDay, int age, int salary, boolean dependents) {
		ssn = social;
		empName = name;
		birthday = bDay;
		empAge = age;
		empSalary = salary;
		empDependents = dependents;
	}

	public int getSsn() {
		return ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public String getBirthday() {
		return birthday;
	}

	public int getEmpAge() {
		return empAge;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public boolean isEmpDependents() {
		return empDependents;
	}
	
	

}
