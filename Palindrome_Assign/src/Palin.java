import java.util.Scanner;

public class Palin {

	public static void main(String[] args) {
System.out.println("Enter a word:");
        
        Scanner read = new Scanner(System.in);
               
        	
	String str = read.nextLine();
    
	palindrome(str);

}
	
		public static void palindrome(String test) 
	{
		String reverse = "";
	    String str = test.replaceAll(" ","");      
	    
	    for(int p = str.length() - 1; p >= 0; p--)
	    {
	        reverse = reverse + str.charAt(p);
	    }
	    if(reverse.equals(str)) {
	    	System.out.println("Test is a palindrome");
	    } else {
	    	System.out.println("Test is not a palindrome");
	    }
	    
	}
}
