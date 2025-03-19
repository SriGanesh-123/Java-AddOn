package task;

import java.util.Scanner;

public class stringtask1 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

 
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

    
        System.out.println("Enter a letter : ");
        char letterToCount = scanner.next().charAt(0);

    
        int count = 0;

  
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == letterToCount) {
                count++;
            }
        }

        System.out.println("The letter has occured :" +count);

    
    }
}
