import java.util.Scanner;
public class posi_nega_zero_num {

	public static void main(String[] args) {
		
      System.out.println("Enter number:- ");
      Scanner sc=new Scanner(System.in); 
      int num=sc.nextInt();
     
      if( num > 0)
      {
    	 System.out.println("Number is Postive."); 
      }
      
      else if(num < 0)
      {
    	  
    	  System.out.println("Number is Negative.");
      }
      else
      {
    	  System.out.println("Number is zero.");
      }
	}

}
