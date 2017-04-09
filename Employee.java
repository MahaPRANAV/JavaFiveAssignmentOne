package AssignmentFive;

public class Employee {
	
	int empId;
	String empName;
	double total_salary;
	int total_leave;
	double pf;
	
	
	public Employee (int empId ,String empName) 
	{
		this.empId = empId;
		this.empName = empName; 
		
	}
	
	public void calculate_balance_leaves()
	{
		
		System.out.println(" Calc balance leaves ");
		
	}
	
	public boolean avail_leave (int no_of_leaves, char type_of_leave)
	{
		System.out.println(" Avail Leave ");
        return true;
		
	  	}
	
	public void   calculate_salary() {
		
	System.out.println(" Calculate Salary ");
		 
		 
	}
	
       

}
