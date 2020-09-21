import java.util.*;
class employeeWage
{
        public static void main(String args[])
        {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("--------------------------------------------");
        int random=(int)Math.round(Math.random());
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Wage Per Hour- ");
        int wagePerHour= sc.nextInt();
        System.out.print("Enter Full Day Hour- ");
        int fullDayHour= sc.nextInt();
        long dailyWage;
        {
                if (random==1)
                {
                System.out.println("Employee is present");
                dailyWage=wagePerHour*fullDayHour;
                }
                else
                {
                System.out.println("Employee is absent");
                dailyWage=0;
                }
        }
                 System.out.println("Daily Wage is:"+dailyWage);
        }
}


