package inheritance;

public class A {
	
	public void print(int num) {
		System.out.println("1st print method");
		System.out.println("int: "+ num);
	}

	public void print(double num) {
		System.out.println("2nd print method");
		System.out.println("double: "+ num);
}
	public void print(String  text) {
		System.out.println("3rd print method");
		System.out.println("String: "+ text);
		
	}
}