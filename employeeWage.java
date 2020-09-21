import java.util.*;
class employeeWage
{
        public static void main(String args[])
        {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("--------------------------------------------");
        int random=(int)Math.round(Math.random());
        int empCheck=(int)Math.round(Math.random());
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Wage Per Hour- ");
        int wagePerHour= sc.nextInt();
        long dailyWage;
        {
                if (random==1)
                {
                System.out.println("Employee is present");
                        if (empCheck==1)
                        {
                        System.out.println("Full time");
                        System.out.print("Enter Full Time Hour- ");
                        int fullTimeHour= sc.nextInt();
                        dailyWage=wagePerHour*fullTimeHour;
                        }
                        else
                        {
                        System.out.println("Part time");
                        System.out.print("Enter Part Time Hour- ");
                        int partTimeHour= sc.nextInt();
                        dailyWage=wagePerHour*partTimeHour;
                        }
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




