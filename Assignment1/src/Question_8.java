import java.util.Scanner;
public class Question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("\t\t\tProgram that takes three numbers as input and calculate sum and average..");
          Scanner sc=new Scanner(System.in);
          int a,b,c;
          System.out.println("Please Enter three numbers :- ");
          a=sc.nextInt();
          b=sc.nextInt();
          c=sc.nextInt();
          System.out.println("Addition of the three numbers is :- "+(a+b+c));
          System.out.println("Average of the three numbers is :- "+(a+b+c)/3);
          sc.close();
	}

}
