public class EmployeeWageBuilder
{
	public static void main(String[] args)
	{
		int check=(int)Math.floor(Math.random()*10)%2;
		if(check==1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
