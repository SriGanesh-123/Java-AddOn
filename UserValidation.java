package task;
// for exception handling in throws
import java.util.Scanner;

public class UserValidation {
	public static void main (String args[]) throws NameValidator {
		Scanner nm = new Scanner(System.in);
		System.out.println("Enter the name :  ");
	    String name=nm.nextLine().toUpperCase();
	  //  String num="1234567890";
	    //char[] x = num.toCharArray();
	    char[] n = name.toCharArray();
	    for(char x:n) {
	    	if('A'<=x && 'Z'>=x) {
	    		System.out.println("Validation Succesfull");
	    		
	    	}
	    	else if('0'<=x && '9'>=x) {
	    		throw new NameValidator("number");
	    	}
	    	else {
	    		throw new NameValidator("Symbol");
	    	}
	    }
	}

}
 class NameValidator extends Exception {
	NameValidator(String str){
		super(str); 
	}
	
	

}
