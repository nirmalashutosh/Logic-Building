import java.util.Scanner;

class Menu {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n----- MENU -----");
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Identify Default Values of Variables");
            System.out.println("5. Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    int M = 80;
                    int S = 85;
                    int H = 90;

                    int Average = (M + S + H) / 3;
                    System.out.println("The average marks is " + Average);

                    String Grade = (Average >= 90) ? "A"
                            : (Average >= 70 && Average <= 89) ? "B"
                            : (Average >= 50 && Average <= 69) ? "C"
                            : (Average >= 30 && Average <= 49) ? "D"
                            : "Fail";

                    System.out.println("Grade: " + Grade);

                    break;


                case 2:

                    System.out.println("Enter the year");

                    int year = sc.nextInt();

                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))

                        System.out.println("It is a leap year");

                    else

                        System.out.println("It is not a leap year");

                    break;


                case 3:

                    System.out.println("choose the week:\n 1.Monday \n 2.Tuesday \n 3.Wednesday \n 4.Thursday \n 5.Friday \n 6.Saturday \n 7.Sunday");

                    int Day = sc.nextInt();

                    switch (Day) {

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

                    break;


                case 4:

                    class Variable {

                        static int a;
                        static byte b;
                        static long c;
                        static double d;
                        static float e;
                        static char f;
                        static short g;
                        static boolean h;
                    }

                    System.out.println(Variable.a);
                    System.out.println(Variable.b);
                    System.out.println(Variable.c);
                    System.out.println(Variable.d);
                    System.out.println(Variable.e);
                    System.out.println(Variable.f);
                    System.out.println(Variable.g);
                    System.out.println(Variable.h);

                    break;


                case 5:

                    System.out.println("Exit");

                    break;


                default:

                    System.out.println("Invalid choice");

            }

        }  

              while (choice != 5);

        
    }
}