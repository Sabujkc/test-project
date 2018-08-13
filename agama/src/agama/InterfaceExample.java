 package agama;

public class InterfaceExample {

	
		public  class InterfaceExample {

		      interface Pet{// interface keyword should be used

		              public void test();

		              public void greeting();

		            }

		     

		            static class Dog implements Pet{ //all the methods in interface should be implemented

		               public void test(){

		                 System.out.println("Interface Method Implemented");

		              }

		               public void greeting() {

		                     System.out.println("hi");

		               }

		              

		               public static void main(String args[]){//static methods can only be returned in outer class or a static class

		                        Pet p = new Dog();

		                       p.test();

		                       p.greeting();

		                    }

		             

		            }

		 

		ABSTRACT PROGRAM

		 

		      //abstract parent class

		      abstract class Animal{

		         //abstract method

		         public abstract void sound();//if atleast one method is abstract,class should be declared as abstract class

		         public void color() {

		               System.out.println("color is grey");

		         }

		      }

		      // AbstractExample class extends Animal class

		      public class AbstractExample extends Animal{

		 

		         public void sound(){ //abstract method is implemented in this class

		            System.out.println("Woof");

		         }

		         public void color() {

		               System.out.println("color is green");

		         }

		         public static void main(Stringargs[]){

		            Animal obj = new AbstractExample();

		            obj.sound();

		           

		            obj.color();//if color is not present in this class parent class color method will be called

		         }

		      }
	}

}
