public class EmployeeWageBuilder
{
	public static void main(String[] args)
	{
		int is_Full_Time=1;
		int is_Part_Time=2;
		int emp_Rate_Per_Hrs=20;
		int empHrs=0;
		int empWage=0;

		int check=(int)Math.floor(Math.random()*10)%3;
		if(check==is_Full_Time)
			empHrs=4;
		else if(check==is_Part_Time)
			empHrs=8;
		else	
			empHrs=0;
		empWage=empHrs*emp_Rate_Per_Hrs;
		System.out.println("EmpWage = "+empWage);

	}
}
