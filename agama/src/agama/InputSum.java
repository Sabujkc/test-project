package agama;
import java.util.Scanner;

public class InputSum {
	int FirstNumber;
	int SecondNumber;
	int Sum1;
	int Subtract;
	int Division;
	
	public void KeyBoardInput() {
		Scanner S1= new Scanner(System.in);
		System.out.println("Enter the FirstNumber");
	   FirstNumber = S1.nextInt();
	   System.out.println("The first number is="+ FirstNumber);
	    
	   Scanner S2= new Scanner(System.in);
	   System.out.println("Enter the SecondNumber");
	   SecondNumber = S2.nextInt();
	   System.out.println("The SecondNumber is =" + SecondNumber);
	  public void Sum1{ 
	   Sum1=FirstNumber + SecondNumber;
	   System.out.println("Sum of two number is "+Sum1);
	   
	}

	public static void main(String[] args) {
		InputSum I= new InputSum();
		I.Sum1();

	}

}
