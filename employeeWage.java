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
        int dailyWage=0;
        int totalWage=0;
        int fullTimeHour=8;
        int partTimeHour=4;
        System.out.println("Day: No     DailyWage    TotalWage");
        for (int day=1;day<=workingDays;day++)
        {
        int random=(int)Math.round(Math.random());
        int empCheck=(int)Math.round(Math.random());
                switch (random)
                {
                case 1:

                        switch (empCheck)
                        {
                        case 1:
                                dailyWage=fullTimeHour*wagePerHour;
                                break;
                        case 0:
                                dailyWage=partTimeHour*wagePerHour;
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
        totalWage=dailyWage+totalWage;
        System.out.println("Day  " +day+"        "+dailyWage+"            "+totalWage);
  }
}
}
