package java8stream;

import java.util.ArrayList;
import java.util.List;

public class java8Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(8675309, "George", "12-03-1989", 32, 12000, true));
		employee.add(new Employee(8675308, "Tony", "11-03-1989", 32, 12200, false));
		employee.add(new Employee(8675307, "Tina", "10-03-1989", 32, 12400, false));
		employee.add(new Employee(8675306, "Kay", "09-03-1989", 32, 12500, true));
		employee.add(new Employee(8675305, "Lee", "08-03-1989", 32, 12600, false));
		employee.add(new Employee(8675304, "Solomon", "07-03-1989", 32, 122200, true));
		employee.add(new Employee(8675303, "Samantha", "06-03-1989", 32, 128400, true));
		employee.add(new Employee(8675302, "Joseph", "05-03-1989", 32, 120000, false));
		employee.add(new Employee(8675301, "Chloe", "04-03-1989", 32, 12454000, true));
		
		System.out.println("Filter by Age < 18: ");
		employee.stream().filter(emp -> emp.getEmpAge() < 18).forEach(emp -> System.out.println(emp.getEmpName()));
		
		System.out.println("\nFilter by Age > 18: ");
		employee.stream().filter(emp -> emp.getEmpAge() > 18).forEach(emp -> System.out.println(emp.getEmpName()));
		
		System.out.println("\nFilter by Dependents: ");
		employee.stream().filter(emp -> emp.isEmpDependents() == true).forEach(emp -> System.out.println(emp.getEmpName()));
		
		System.out.println("\nFilter by Salary > $100,000: ");
		employee.stream().filter(emp -> emp.getEmpSalary() > 100000).forEach(emp -> System.out.println(emp.getEmpName()));

	}

}
