package Lab;

public class String_Buffer {

	    public static void main(String[] args) 
	    {
	        // Create the StringBuffer
	        StringBuffer sb = new StringBuffer("This is StringBuffer");
	        
	        // Add the string "- This is a sample program" to existing string and display it
	        sb.append("- This is a sample program");
	        System.out.println("After appending: " + sb);
	        
	        // Insert the string "Object" into the existing string at 21st position and display it
	        sb.insert(21, "Object ");
	        System.out.println("After inserting: " + sb);
	        
	        // Reverse the entire string and display it
	        sb.reverse();
	        System.out.println("After reversing: " + sb);
	        
	       
	    }
	}



