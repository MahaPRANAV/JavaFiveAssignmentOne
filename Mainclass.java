package AssignmentFive;

public class Mainclass {

	public static void main(String[] args) {
		
		PermanentEmp pe = new PermanentEmp(1,"John");
		PermanentEmp pa = new PermanentEmp(2,"Mary");
		
		TemporaryEmp te =  new TemporaryEmp(3,"Mia");

		pe.avail_leave(3, "Sick");
		pe.calculate_salary(10000);
		
		pa.avail_leave(2, "Paid");
		pa.calculate_salary(20000);
		
		te.avail_leave(1) ;
		te.calculate_salary(10000);
	}

}
