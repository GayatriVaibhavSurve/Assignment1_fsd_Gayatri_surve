import java.util.Scanner;
public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\tProgram to Check whether an alphabet is vowel or consonant using switch statement...");
	    System.out.println("Please enter a character : ");
	    char c=sc.next().charAt(0);
	    sc.close();
	    if(!((c>='a' && c<='z') || (c>='A' && c<='Z')))
	    		{
	    	      System.out.println("Entered character is not an Alphabet....");
	    	      System.exit(1);
	    		}
	    switch(c)
	    {
	    case 'a':
	    case 'A':
	    case 'e':
	    case 'E':
	    case 'o':
	    case 'O':
	    case 'u':
	    case 'U':
	    case 'i':
	    case 'I':System.out.println("Entered character "+c+" is a vowel..");
	             break;
	    default:System.out.println("Entered character "+c+" is a consonent..");
	    }
	}

}
