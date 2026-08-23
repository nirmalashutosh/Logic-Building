import java.util.Scanner;

class Square{
public static void main(String args[]){

System.out.println("Enter the number");
  Scanner sc =new Scanner(System.in);

   int side=sc.nextInt();

    int area =side*side;

   System.out.println("The area of square is "+ area);       

  }

}