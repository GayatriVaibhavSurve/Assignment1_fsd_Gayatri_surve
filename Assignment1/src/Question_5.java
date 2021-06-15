import java.util.Scanner;
public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("\t\t\tProgram to convert char type variables to int...");
     Scanner sc = new Scanner(System.in);
     char c;
     System.out.println("Please enter a character : ");
     c=sc.next().charAt(0);
     System.out.println("Conversion of entered character "+c+" into an integer is "+(int)c);
	sc.close();
	}

}
