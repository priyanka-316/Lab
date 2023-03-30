
public class Smallestnumber {
 
public static void main(String[] args)   
{  
 
int a=10, b=5, c=15;  //initializing numbers to compare 
 

if(a<=b && a<=c)  //if both conditions are true, prints a  
	
System.out.println(a+" is the smallest number");  


else if (b<=a && b<=c)  //if both conditions are true, prints b  
	
System.out.println(b+" is the smallest number");  

else  //prints c if this conditions are false  

System.out.println(c+" is the smallest number");  
}  
}  