import java.util.Scanner;

class Week{
    public static void main(String args[])
{
    System.out.println("choose the week:\n 1.Monday \n 2.Tuesday \n 3.Wednesday \n 4.Thursday \n 5.Friday \n 6.Saturday \n 7.Sunday");
    Scanner sc = new Scanner(System.in);
    int Day = sc.nextInt();
    
switch (Day)
{
   case 1: 
System.out.println("Monday");
    break;

case 2: 
System.out.println("Tuesday");
    break;
case 3: 
System.out.println("Wednesday");
    break;
case 4: 
System.out.println("Thursday");
    break;
case 5: 
System.out.println("Friday");
    break;
case 6: 
System.out.println("Saturday");
    break;
case 7: 
System.out.println("Sunday");
    break;

default:
   System.out.println("Invalid input");

}

}
}
