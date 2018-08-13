package agama;

public class OverridingMethod {
	public void sleep() {
		System.out.println("Human is sleeping");
	}
class Boy extends OverridingMethod{
	public void sleep() {
	System.out.println("Boy is sleeping");
	}
}
	public static void main(String[] args) {
		Boy obj = new Boy();
		obj.sleep();
		

	}

}
