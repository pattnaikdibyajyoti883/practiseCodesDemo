package javacodesforpractise;

public class EmployeeDetails {
	
	String name;
	int id;
	int salary;
	
	EmployeeDetails(String name,int salary,int id)
	{
		this.name=name;
		this.salary=salary;
		this.id=id;
	}

	public static void main(String[] args) 
	{
		EmployeeDetails ed = new EmployeeDetails("Dibyajyoti",15200,101958);
		System.out.println("Name of the employee is " + ed.name);
		System.out.println("Salary of the employee is " + ed.salary);
		System.out.println("id of the employee is " + ed.id);
		

	}

}

//Output-
//Name of the employee is Dibyajyoti
//Salary of the employee is 15200
//id of the employee is 101958
