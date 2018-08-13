
/*4.perform all Addition, Substraction, 
division of two numbers taking inputs from keyboard and create functions*/
package agama;
import java.util.Scanner;
public class SumMethod {
	int x;
	int y;
	int z;
	public static void main(String[] args) {
		Scanner firstnumber = new Scanner(System.in);
		System.out.println("Enter the first Number ");
	   int  x = firstnumber.nextInt();
		System.out.println("First number is = " +x); 
		
		Scanner secondnumber = new Scanner(System.in);
		System.out.println("Enter the second number");
		int y = secondnumber.nextInt();
		System.out.println("Second number is =" +y );
		
		int add = x+y;
		System.out.println("sum of two numbers is = "+add);
		
		int sub = x-y;
		System.out.println("subtraction of two number is ="+ sub);
		int div = x/y;
		System.out.println("division of two number is ="+ div);
		
	
	}
}
