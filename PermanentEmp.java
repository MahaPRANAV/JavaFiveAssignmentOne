package AssignmentFive;

public class PermanentEmp extends Employee{
	int paid_leave ;
	int sick_leave ;
	int casual_leave ;
	
	double basic;
	double hra;
	double pfa;
	
	
	 
	public PermanentEmp (int empId,String empName)
	{
		super(empId ,empName);
		
	}
	
	
	void print_leave_details () {
		System.out.println( " Employee  : "+ empName ) ;
		System.out.println( " Sick Leave  : "+ sick_leave ) ;
		System.out.println( " Paid Leave  : "+ paid_leave ) ;
		System.out.println( " Casual Leave  : "+ casual_leave ) ;

	}
	
	 void calculate_balance_leaves(int no_of_leaves, String type_of_leave) 
	 {
		 
		 paid_leave = 15;
		 sick_leave = 7;
		 casual_leave = 7;
			
		 if (type_of_leave == "Sick" && no_of_leaves > 0 && no_of_leaves  <= 7 )
		 {
			 
			 sick_leave = sick_leave - no_of_leaves ;
			 

		 }
		 else if (type_of_leave == "Paid"  && no_of_leaves > 0 && no_of_leaves  <= 15)
	     {
		 paid_leave = paid_leave - no_of_leaves ;
	     }
	 else if (type_of_leave == "Casual" && no_of_leaves > 0 && no_of_leaves  <= 7) 
	  { 
		 casual_leave = casual_leave - no_of_leaves ;
	  }
	 else 
		 {
		   System.out.println(type_of_leave + " Cannot be Approved ");
		 }
		 
		 print_leave_details();
		 
		 }
	 
	 
	 boolean avail_leave(int no_of_leaves,String type_of_leave)
	 { 
		 calculate_balance_leaves(no_of_leaves,type_of_leave);
		 //print_leave_details(no_of_leaves,type_of_leave);

		 
		 if (type_of_leave == "Sick" && sick_leave > 0 )
		 {
			 System.out.println("Leave Approved");
			 return true;
			 
	     }
		 else if (type_of_leave == "Paid"  && paid_leave > 0 )
		     {
			 System.out.println("Leave Approved");
			 return true;
		     }
		 else if (type_of_leave == "Casual" && casual_leave > 0 ) 
		  { 
			 System.out.println("Leave Approved");
			 return true;
		  }
		 else 
			 {
			   return true ;
			 }
		 
		 
	}
		 
	 
	 
	 void calculate_salary(double basic) 
	 {
		 pfa = basic*  0.12;
		 hra = basic*  0.5;
		 total_salary = basic  + hra - pfa ;
		 
		 System.out.println(" total_salary "+ total_salary);
		 
	 }

	
	

}
