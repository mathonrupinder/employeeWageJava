import java.util.*;
class Employee
{
	public int WAGE_PER_HOUR,WORKING_DAYS,WORKING_HOURS;
	public int employeeHours;
	public int TOTAL_WAGE=0;
	public int DAILY_WAGE;
	public int DAYS=0;
	public int WORK_HOURS=0;
	String Company_Name;
	public void calculation()
	{
		while (DAYS<WORKING_DAYS && WORK_HOURS<WORKING_HOURS)
	{
		int Attendance_Check=(int)Math.round(Math.random());    //Employee Attendance Check
		int Employee_Check=(int)Math.round(Math.random());      //Employee PartTime FullTime Availability check
		DAYS++;
                WORK_HOURS=employeeHours+WORK_HOURS;

	switch (Attendance_Check)
            {
                case 1:                                 //Is Present
                        switch (Employee_Check)
                        {
                        case 1:                         //Is FullTime
                                employeeHours=8;
                                break;
                        case 0:                         //Is PartTime
                                employeeHours=4;
                                break;
                        default:
                                break;
                        }
                break;
                case 0:                                 //Is Absent
                DAILY_WAGE=0;
                break;
                default:
                break;
                }
        DAILY_WAGE=(employeeHours*WAGE_PER_HOUR);              //Daily Wage Calculation
        TOTAL_WAGE=(TOTAL_WAGE+DAILY_WAGE);                    //Total Wage Calculation
}
}
}
class employeeWage
{

	public static void main(String args[]) {
	System.out.println("Welcome To Employee Wage Computation Problem");
	Scanner sc= new Scanner(System.in);
	//creating ARRAYLIST
	ArrayList<Employee> employeeWageBuilder=new ArrayList<Employee>();
	Scanner in = new Scanner(System.in);
	System.out.println("Enter no. of companies");
	int limit=sc.nextInt();
	int i=0;
	while (i!=limit)
	{
		i++;
		Employee obj1=new Employee();
		System.out.println("Enter Company Name");
		obj1.Company_Name= in.nextLine();
		System.out.println("Enter wage per hour");
		obj1.WAGE_PER_HOUR= sc.nextInt();
		System.out.println("Enter Working_Days");
		obj1.WORKING_DAYS= sc.nextInt();
		System.out.println("Enter Working_Hours");
		obj1.WORKING_HOURS= sc.nextInt();
		obj1.calculation();
        
	// Iterator
	employeeWageBuilder.add(obj1);
        Iterator itr=employeeWageBuilder.iterator();
			while(itr.hasNext())
			{
				Employee emp=(Employee)itr.next();
				System.out.println("---------------");
				System.out.println(emp.Company_Name);
				System.out.println("Total wage is "+emp.TOTAL_WAGE);
				System.out.println("---------------");

			}	
	}
}


