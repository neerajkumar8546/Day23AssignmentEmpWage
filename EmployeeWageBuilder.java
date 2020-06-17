public class EmployeeWageBuilder
{

	public static void main(String[] args)
	{
			int is_Full_Time=1;
		   int emp_Rate_Per_Hrs=20;
			int empWage=0,empHrs=0;
			int check=(int)Math.floor(Math.random()*10)%2;
			if(check==is_Full_Time)
				empHrs=8;
			else
				empHrs=0;

			empWage=empHrs*emp_Rate_Per_Hrs;
			System.out.println("EmpWage = "+empWage);
	}
}
