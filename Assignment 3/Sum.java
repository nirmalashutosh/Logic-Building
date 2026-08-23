import java.util.Scanner;

class Sum {

    int sumOfTwoNumbers(int a, int b) {
        int c = a + b;
        return c;
  }

  public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

       System.out.print("Enter first number");
        int a = sc.nextInt();

        System.out.print("Enter second number");
        int b = sc.nextInt();

        Sum obj = new Sum();

        int c = obj.sumOfTwoNumbers(a,b);

        System.out.println("The sum is " + c);
        System.out.println("The sum of " + a + " and " + b + " is " + c);
  }
}