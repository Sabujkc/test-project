package agama;

public class TryCatchBlock {

    public static void main(String args[]){

       int d = 0;

       int n = 20;

       int fraction = n/d;

      System.out.println("End Of Main");

    }

 }


public class TryCatchcorrect {

public static void main(String args[]) {

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

