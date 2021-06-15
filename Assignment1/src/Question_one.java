import java.util.Scanner;
public class Question_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
		System.out.println("\t\t\tProgram to find ASCII value of a character");
        System.out.print("Please enter a character to see its ASCII value :: ");
        char c=sc.next().charAt(0);
        sc.close();
        System.out.println("ASCII value of "+c+" is : "+(int)c);
	}

}
