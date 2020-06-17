public class EmployeeWageBuilder
{
	public static void main(String[] args)
	{
		final int is_Part_Time=1;
		final int is_Full_Time=2;
		int empHrs=0;
		int empWage=0;
		int emp_Rate_Per_Hrs=20;

		int check=(int)Math.floor(Math.random()*10)%3;
		switch(check)
		{
			case is_Part_Time:
				empHrs=8;
				break;
			case is_Full_Time:
				empHrs=4;
			default:	
				empHrs=0;
		}
		empWage=empHrs*emp_Rate_Per_Hrs;
		System.out.println("EmpWage = " +empWage);

	}
}
