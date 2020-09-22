import java.util.*;
class employeeWage
{
        public static void main(String args[])
        {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("--------------------------------------------");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Wage Per Hour- ");
        int wagePerHour= sc.nextInt();
        System.out.print("Enter Working Days in Month- ");
	int workingDays= sc.nextInt();
        System.out.print("Enter Working Hours in Month- ");
        int workingHours= sc.nextInt();
        int dailyWage=0;
        int totalWage=0;
        int employeeHours=0;
        int days=0;
        int workHours=0;
        System.out.println("Day: No     workHours          DailyWage           TotalWage");
        while (days<workingDays && workHours<workingHours)
	{
        int random=(int)Math.round(Math.random());
        int empCheck=(int)Math.round(Math.random());
                switch (random)
                {
                case 1:

                        switch (empCheck)
                        {
                        case 1:
                                employeeHours=8;
                                break;
                        case 0:
                                employeeHours=4;
                                break;
                        default:
                                break;
                        }
                break;
                case 0:
                dailyWage=0;
                break;
                default:
                break;
                }
        days++;
        workHours=employeeHours+workHours;
        dailyWage=employeeHours*wagePerHour;
        totalWage=dailyWage+totalWage;
        System.out.println("Day  " +days+"        "+workHours+"                   "+dailyWage+"               "+totalWage);

  }
}
}
