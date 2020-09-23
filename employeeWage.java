class Employee
{
public int Wage_Per_Hour,Daily_Wage,Employee_Hours,Working_Days,Working_Hours;
public int Total_Wage=0;
public int Days=0;
public int Work_Hours=0;
String Company_Name;
public void calculation(int Wage_per_Hour,int Working_Days,int Working_Hours )
{
this.Wage_Per_Hour=Wage_per_Hour;
this.Working_Days=Working_Days;
this.Working_Hours=Working_Hours;
while (Days<Working_Days && Work_Hours<Working_Hours)
{
int Attendance_Check=(int)Math.round(Math.random());    //Employee Attendance Check
int Employee_Check=(int)Math.round(Math.random());      //Employee PartTime FullTime Availability check
switch (Attendance_Check)
                {
                case 1:                                 //Is Present
                        switch (Employee_Check)
                        {
                        case 1:                         //Is FullTime
                                Employee_Hours=8;
                                break;
                        case 0:                         //Is PartTime
                                Employee_Hours=4;
                                break;
                        default:
                                break;
                        }
                break;
                case 0:                                 //Is Absent
                Daily_Wage=0;
                break;
                default:
                break;
                }
        Days++;
        Work_Hours=Employee_Hours+Work_Hours;
        Daily_Wage=Employee_Hours*Wage_Per_Hour;        //Daily Wage Calculation
        Total_Wage=Total_Wage+Daily_Wage;               //Total Wage Calculation
        System.out.println("Day  "+Days+"           "+Work_Hours+"              "+Daily_Wage+"             "+Total_Wage);
}
}
}
class employeeWage
{
public static void main(String args[])
{
System.out.println("*****Welcome To Employee Wage Computation Problem*****");
Employee obj1=new Employee();
obj1.Company_Name="COMPANY NAME::RELIANCE";
System.out.println(obj1.Company_Name);
System.out.println("---------------------------------");
System.out.println("Day No.      Work_Hours      Daily_Wage     Total_Wage");
obj1.calculation(20,20,100);
Employee obj2=new Employee();
obj2.Company_Name="COMPANY NAME::GOOGLE";
System.out.println(obj2.Company_Name);
System.out.println("---------------------------------");
System.out.println("Day No.      Work_Hours      Daily_Wage     Total_Wage");
obj2.calculation(30,25,150);
Employee obj3=new Employee();
obj3.Company_Name="COMPANY NAME::TATA CONSULTANCY SERVICES";
System.out.println(obj3.Company_Name);
System.out.println("---------------------------------");
System.out.println("Day No.      Work_Hours      Daily_Wage     Total_Wage");
obj3.calculation(15,25,120);
}
}
