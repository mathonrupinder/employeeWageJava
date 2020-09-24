import java.util.*;
interface Employee1
{
void calculation();
}
 class Employee implements Employee1
{
         public int WAGE_PER_HOUR,WORKING_DAYS,WORKING_HOURS;
         public int employeeHours;
         public int TOTAL_WAGE=0;
         public int DAILY_WAGE;
         public int DAYS=0;
         public int WORK_HOURS=0;
         String Company_Name;
         ArrayList<Integer> employeeDailyWage=new ArrayList<Integer>();
         ArrayList<Integer> employeeTotalWage=new ArrayList<Integer>();
         ArrayList<String> company=new ArrayList<String>();
        public void calculation(String Company_Name,int WAGE_PER_HOUR,int WORKING_DAYS,int WORKING_HOURS)
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
        employeeTotalWage.add(TOTAL_WAGE);
        employeeDailyWage.add(DAILY_WAGE);
}

        System.out.println(employeeDailyWage+"     "+employeeTotalWage);
        System.out.println("Total Wage of "+Company_Name+"  "+employeeTotalWage.get(employeeTotalWage.size()-1));
        company.add(Company_Name);
        System.out.println(company);
}
}

class employeeWageBuilder
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
                obj1.calculation(Company_Name,WAGE_PER_HOUR,WORKING_DAYS,WORKING_HOURS);

        }

}
}
