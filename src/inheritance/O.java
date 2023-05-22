package inheritance;

public class O extends W {

	public static void main(String[] args) {
		
		W1();
		
	}

	public static void O1() {
		System.out.println("static O1 method");
	}
	public void O2() {
		System.out.println("non-static O2 method");
}
	public static void W1() {
		System.out.println("static W1 from class O");
		
	}
}