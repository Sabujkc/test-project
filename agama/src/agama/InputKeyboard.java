
//2.print sum of n natural numbers from keyboard//
package agama;

import java.util.Scanner;

 public class InputKeyboard {
 static int firstnumber;
 static int secondnumber;
 static int sum;
 public static void main (String[]args) {
 Scanner s1 = new Scanner (System.in);
 System.out.println("enter the firstnumber");
 firstnumber=s1.nextInt();
 System.out.println("firstnumber is =" +firstnumber);
 
 Scanner s2 = new Scanner(System.in);
 System.out.println("enetr the secondnumber");
 secondnumber = s2.nextInt();
 System.out.println("secondnumber is=" +secondnumber);
 
 sum=firstnumber +secondnumber;
 System.out.println("the sum of two number is "+sum);
 }
 }
		    
		  