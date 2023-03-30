
public class Student_ass
	  
		{  
	    int id;  
	    String name;  
	    int age;  
	     
	    Student_ass(int i,String n) //creating two argument constructor 
	    {  
	    id = i;  
	    name = n;  
	    }  
	    
	    Student_ass(int i,String n,int a) //creating three arguments constructor  
	    {  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
	    public static void main(String args[]){  
	    Student_ass s1 = new Student_ass(101,"Rudra");  
	    Student_ass s2 = new Student_ass(201,"Riya",15);  
	    s1.display();  
	    s2.display();  
	   }  
	}  