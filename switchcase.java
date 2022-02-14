
public class switchcase {

	public static void main(String[] args) {
		
        int empRatePerHr=20;
        int empHrs=0;
        double salary=0;
        
        double randomCheck=Math.floor(Math.random() * 10) % 3;
        int i = (int) randomCheck;   
        switch (i)
        {
    
        case 2:
                System.out.println("Employee is FullTime");
                empHrs=8;
                break;
        case 1:
                 System.out.println("Employee is PartTime");
                 empHrs=4;
                 break;
        case 0:
                 System.out.println("Employee is Absent");
                 empHrs=0;
                 break;     
        }
        	 
        	 salary= empHrs * empRatePerHr;
        	 System.out.println("Employee Salary" + salary);
           
	   
	}
}
