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
         ArrayList<Integer> employeeDailyWage=new ArrayList<Integer>();
         ArrayList<Integer> detailTotalWage=new ArrayList<Integer>();
         ArrayList<Integer> employeeTotalWage=new ArrayList<Integer>();
         ArrayList<String> company=new ArrayList<String>();
        public void employeeWageBuilder(String Company_Name,int WAGE_PER_HOUR,int WORKING_DAYS,int WORKING_HOURS)
        {
                while (DAYS<WORKING_DAYS && WORK_HOURS<WORKING_HOURS)
        {
                int Attendance_Check=(int)Math.round(Math.random());    //Employee Attendance Check
                int Employee_Check=(int)Math.round(Math.random());      //Employee PartTime FullTime Availability check
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
        DAYS++;
        WORK_HOURS=employeeHours+WORK_HOURS;
        DAILY_WAGE=(employeeHours*WAGE_PER_HOUR);              //Daily Wage Calculation
        TOTAL_WAGE=(TOTAL_WAGE+DAILY_WAGE);
        employeeDailyWage.add(DAILY_WAGE);
        employeeTotalWage.add(TOTAL_WAGE);
        }
        System.out.println(employeeDailyWage);

        System.out.println(employeeTotalWage);
        company.add(Company_Name);
        detailTotalWage.add(TOTAL_WAGE);
        }
public void query(){

        Scanner sc= new Scanner(System.in);
        System.out.println("List of Companies:"+company);
        System.out.println("-----------------------------------------");
        System.out.println("Enter index to find the details of company start from 0");
        int i=sc.nextInt();
        if(i>company.size())
        {
         System.out.println("COMPANY NOT FOUND");
        }
        else
        {
        System.out.println("COMPANY NAME::"+company.get(i));
        System.out.println("TOTAL WAGE::"+detailTotalWage.get(i));
        }

}
}
class employeeWage
{

        public static void main(String args[])
        {

        System.out.println("Welcome To Employee Wage Computation Problem");
        ArrayList<String> company=new ArrayList<String>();
        Scanner sc= new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of companies");
        int limit=sc.nextInt();
        int i=0;
        Employee obj1=new Employee();
        while (i!=limit)
        {
                i++;
                System.out.println("Enter Company Name");
                String Company_Name= in.nextLine();
                System.out.println("Enter wage per hour");
                int WAGE_PER_HOUR= sc.nextInt();
                System.out.println("Enter Working_Days");
                int WORKING_DAYS= sc.nextInt();
                System.out.println("Enter Working_Hours");
                int WORKING_HOURS= sc.nextInt();
                obj1.employeeWageBuilder(Company_Name,WAGE_PER_HOUR,WORKING_DAYS,WORKING_HOURS);

        }
                obj1.query();
        }
}






