import java.util.Scanner;

class Positive {

    void askForPositiveNumber() {

        Scanner sc = new Scanner(System.in);

        int n;

        do {
          System.out.print("Enter a positive number ");
            n = sc.nextInt();
        } while (n<= 0);

        System.out.println("You entered a positive number " + n);
    }

    public static void main(String args[]) {

       Positive obj = new Positive();

        obj.askForPositiveNumber();
    }
}