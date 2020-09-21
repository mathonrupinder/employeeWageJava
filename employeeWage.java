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
        int dailyWage=0;
        {
                switch (random)
                {
                case 1:
                System.out.println("Employee is present");
                        switch (empCheck)
                        {
                        case 1:
                                System.out.println("Full time");
                                System.out.print("Enter Full Time Hour- ");
                                int fullTimeHour= sc.nextInt();
                                dailyWage=wagePerHour*fullTimeHour;
                                break;
                        case 0:
                                System.out.println("Part time");
                                System.out.print("Enter Part Time Hour- ");
                                int partTimeHour= sc.nextInt();
                                dailyWage=wagePerHour*partTimeHour;
                                break;
                        default:
                                break;
                        }
                break;
                case 0:
                System.out.println("Employee is absent");
                dailyWage=0;
                break;
                default:
                break;
                }
        }
        System.out.println("Daily Wage is:"+dailyWage);

        }
}





