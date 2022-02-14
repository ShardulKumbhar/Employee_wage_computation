
public class AddPartTimeEmployee {

	public static void main(String[] args) {
		
			

           int isPartTime=1;
           int isFullTime=2;
           int empRatePerHr=20;
           int empHrs;
           int salary;
double randomCheck=Math.floor(Math.random() * 10) % 3;

      if ( isFullTime == randomCheck )
      {       
	                   System.out.println("Employee is FullTime");
                        empHrs=8;
      }    
     else if( isPartTime == randomCheck )
            {
        	   System.out.println("Employee is PartTime");
                       empHrs=4;
            }
      else
           {
	              System.out.println("Employee is Absent");
                         empHrs=0;
           }
          salary= empHrs * empRatePerHr;
          System.out.println("Employee Salary" + salary);




	}

}
