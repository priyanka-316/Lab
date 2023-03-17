// Write a Java program to swap two variables.

public class Test3 {
	public static void main(String[] args) { 
		int a=5,b=10;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Befor swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("After swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}