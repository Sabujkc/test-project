
//1.Addition of 2 numbers by using method//

package agama;

class MethodsCall {
	
	static int sum;
	public int additionMethod(int Fnumber,int Snumber) {
		sum=Fnumber+Snumber;
		return sum;
	}

	public static void main(String args[]) {
		MethodsCall a1= new MethodsCall();  
		sum=a1.additionMethod(200, 36);
		System.out.println(sum);

	}

}
