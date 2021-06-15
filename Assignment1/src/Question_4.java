import java.util.Scanner;
public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("\t\t\tProgram to Check Whether a Character is Alphabet or Not?");
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a character : ");
	    char c=sc.next().charAt(0);
	    sc.close();
	    if((c>='A' && c<='Z')||(c>='a' && c<='z'))
	    {
	    	System.out.println("The entered character "+c+" is an Alphabet..");
	    }
	    else {
	    	System.out.println("The entered character "+c+" is NOT an Alphabet..");
	    }
	}

}
