import java.util.Scanner;

public class Cube {
	public static void main(String args[]) {
		
    int i,num;

    System.out.print("Enter the number  : ");
    Scanner in = new Scanner(System.in);
		    num = in.nextInt();

     for(i=1;i<=num;i++)
     {
     //System.out.println("Number is :- " +i+" and cube of " +i+" is : "+(i*i*i)); 
     System.out.println("Cube of number:-  "+(i*i*i));
    }
 }
}