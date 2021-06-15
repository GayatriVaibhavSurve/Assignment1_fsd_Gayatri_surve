import java.util.Scanner;
public class Question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("\t\t\tProgram to calculate area and circumference of circle....");
	Scanner sc=new Scanner(System.in);
	float area,circum;
	int r;
	System.out.println("Please enter a radius of a circle : ");
	r=sc.nextInt();
	area=3.14f*r*r;
	circum=2*3.14f*r;
	System.out.println("Area of circle is : "+area);
	System.out.println("Circumference of circle is : "+circum);
	sc.close();
	}

}
