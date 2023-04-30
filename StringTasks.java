package Lab;

public class StringTasks 
{
	
	public static void main(String[] args) 
	{
        // Create the string
        String str = "Welcome to Java World";
        
        // Returns the character at 5th position and display it.
        char c = str.charAt(4); // index starts from 0
        System.out.println("The character at 5th position is: " + c);
        
        // Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
        boolean isEqual = str.substring(0, 7).equalsIgnoreCase("Welcome");
        System.out.println("Is the string equal to \"Welcome\": " + isEqual);
        
        // Concatenates “- Let us learn” to the above string and display it.
        String s = str.concat("- Let us learn");
        System.out.println("The new string is: " + s);
        
        // Returns the position of the first occurrence of character ‘a’ and display it.
        int a = str.indexOf('a');
        System.out.println("The position of the first occurrence of 'a' is: " + a);
        
        // Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
        String st = str.replace('a', 'e');
        System.out.println("The new string after replacing 'a' with 'e' is: " + st);
        
        // Returns string between 4th position and 10th position and display it.
        String Str = str.substring(3, 10); // index starts from 0
        System.out.println("The string between 4th and 10th position is: " + Str);
        
        // Returns the lowercase of the string and display it.
        String lowerCaseStr = str.toLowerCase();
        System.out.println("The lowercase of the string is: " + lowerCaseStr);
        
        
    }

}

