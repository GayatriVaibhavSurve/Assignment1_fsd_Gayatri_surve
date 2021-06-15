import java.util.Scanner;
public class Question_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int dividend,divisor;
          Scanner sc=new Scanner(System.in);
          System.out.println("\t\t\tProgram to find Quotient and Remainder of a number....");
          System.out.println("Please Enter a dividend : ");
          dividend=sc.nextInt();
          System.out.println("Please Enter a divisor : ");
          divisor=sc.nextInt();
          sc.close();
          System.out.println("Quotient of a number "+dividend+" is : "+dividend/divisor);
          System.out.println("Remainder of a number "+dividend+" is : "+dividend%divisor);
	}

}
