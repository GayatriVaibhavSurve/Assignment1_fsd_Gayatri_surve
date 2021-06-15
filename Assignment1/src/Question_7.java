
import java.util.Scanner;
public class Question_7 {
    public static void main(String[] args) 
    {
		Scanner obj = new Scanner(System.in);
    	int a,b,c;
    	System.out.println("Please enter three numbers ::");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        obj.close();
        if(a>b && a>c)
        {
        	System.out.println(a+" is maximum");
        }
        else if(b>a && b>c)
        {
        	System.out.println(b+" is maximum");
        }
        else {
        	System.out.println(c+" is maximum");
        }
    }
}
