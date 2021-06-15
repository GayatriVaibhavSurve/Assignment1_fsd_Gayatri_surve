import java.util.Scanner;
public class Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("\t\t\tSwapping two numbers without using third variable...");
        int a,b;
        System.out.println("Enter two numbers for swapping");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        System.out.println("See the numbers before swapping --> "+" a = "+a+", b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("See the numbers after swapping --> "+" a = "+a+", b="+b);
	}

}
