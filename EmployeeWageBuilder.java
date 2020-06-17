class EmpWage{
	   public static final int is_Part_Time=1;
      public static final int is_Full_Time=2;
      final int emp_Rate_Per_Hrs;
      final int num_Of_Working_Days;
      final int max_Hrs_In_Month;
		final String companyName;
		//parameterized COnstructor
		public EmpWage(String companyName,int emp_Rate_Per_Hrs,int num_Of_Working_Days,int max_Hrs_In_Month)
		{
			this.companyName=companyName;
			this.emp_Rate_Per_Hrs=emp_Rate_Per_Hrs;
			this.num_Of_Working_Days=num_Of_Working_Days;
			this.max_Hrs_In_Month=max_Hrs_In_Month;
		}
		
		public void calculateEmpWage()
		{
			int empHrs=0,total_Working_Days=0,total_EmpHrs=0,totalEmpWage=0,empWage=0;
	      while(total_EmpHrs<max_Hrs_In_Month && total_Working_Days<num_Of_Working_Days)
   	   {
      	   total_Working_Days++;
         	int check=(int)Math.floor(Math.random()*10)%3;
         	switch(check)
         	{
            	case is_Part_Time:
           	   	 empHrs=8;
               	 break;
            	case is_Full_Time:
              	    empHrs=4;
               	break;
            	default:
               	empHrs=0;
               	break;
         	}
         	total_EmpHrs=total_EmpHrs+empHrs;
         	empWage=empHrs*emp_Rate_Per_Hrs;
         	//System.out.println("Day "+total_Working_Days +"EmpHrs "+empHrs+" and EmpWage is "+empWage);
     		}
			System.out.println("Calculate EmpWage For "+companyName+ ":");

			totalEmpWage=total_EmpHrs*emp_Rate_Per_Hrs;
         System.out.println("Total EmpWage is = "+totalEmpWage);
         System.out.println("Total EmpHrs is = "+total_EmpHrs);

		}

}

public class EmployeeWageBuilder
{
	public static void main(String[] args)
	{

		System.out.println("\n");
		EmpWage obj1=new EmpWage("BridgeLabz",20,20,100);
		obj1.calculateEmpWage();
		System.out.println("\n");
		EmpWage obj2=new EmpWage("Jio",10,10,50);
		obj2.calculateEmpWage();
	}
}
