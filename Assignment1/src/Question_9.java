import java.util.Scanner;
public class Question_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t\t\tProgram to Calculate Simple Interest..");
         Scanner sc=new Scanner(System.in);
         int p,t,r;
         float si;
         System.out.println("Please Enter Principal :-");
         p=sc.nextInt();
         System.out.println("Please Enter Number of years :-");
         t=sc.nextInt();
         System.out.println("Please Enter rate of interest :-");
         r=sc.nextInt();
         si=p*t*r/100;
         System.out.println("The Simple Interest is :-  "+si);
         sc.close();
	}

}
