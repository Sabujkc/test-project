package agama;

public class TrycatchCorrect {
	  int d = 0;

	   int n = 20;

	   try {

	    int fraction = n / d;

	    System.out.println("excuted value is" +fraction);

	    System.out.println("This line will not be Executed");

	   } catch (ArithmeticException e) {

	    System.out.println("In the catch Block due to Exception = " + e);

	   }

	   System.out.println("End Of Main");

	 }

	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
