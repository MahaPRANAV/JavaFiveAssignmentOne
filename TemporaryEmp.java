package AssignmentFive;

public class TemporaryEmp extends Employee 
{
	
	
	public TemporaryEmp  ( int empId,String empName)
	{
		super (empId,empName);
		
	}
	
	void print_leave_details () {
		System.out.println( " Employee  : "+ empName ) ;
		System.out.println( " Total Leave Balance : "+ total_leave ) ;

	}

	
	 public void calculate_balance_leaves (int no_of_leaves)
	 {
		 total_leave = 15 ;
		if  (no_of_leaves > 0 ) 
		{
			total_leave = total_leave - no_of_leaves ;
		}
		 print_leave_details();

	 }
	 
	 
	 boolean avail_leave(int no_of_leaves)
	 {
		 calculate_balance_leaves(no_of_leaves);

		 if (no_of_leaves > 0 && total_leave > 0 && total_leave < 15) 
		 {
		   System.out.println("Leave Approved");	 
		   return true ;
		 }
		 else 
		 {
			   System.out.println("Leave Cannot be Approved");	 
               return false;
		 }
	 }
	 
	 void calculate_salary(double basic)
	 {
		 pf = basic*  0.12;
		 total_salary = basic - pf ;
		 
		 System.out.println(" total_salary "+ total_salary);	 
	 }
}
