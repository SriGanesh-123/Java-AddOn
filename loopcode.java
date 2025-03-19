package task;

import java.util.Date;
import java.util.Scanner;

public class Register {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of users :" );
		int n=in.nextInt();
		
		for(int i=0;i<=n;i++)
		{
		
		System.out.println("\n\tEnter your Username : ");
		String username = in.nextLine();
		System.out.println("\n\tEnter your Password :");
		String password = in.nextLine();
		System.out.println("\n\tEnter Your Email : ");
		String email = in.nextLine();
		System.out.println("\n\tEnter your Address :");
		String address = in.nextLine();
		System.out.println("\n\tEnter your Mobile Nummber : ");
		long mobileNumber = in.nextLong();
		//System.out.println("Enter the Started Date : ");
		Date createAt = new Date();
		Date updatedAt = new Date();
		boolean isActive = true;
		//System.out.println("Enter the Updated Date : ");
		//System.out.println("Enter ISActive : ");
	
		Encapsulation person1 = new Encapsulation();
		person1.setUsername(username);
		person1.setPassword(password);
		person1.setEmail(email);
		person1.setAddress(address);
		person1.setMobileNumber(mobileNumber);
		person1.setCreatedAt(createAt);
		person1.setUpdtedAt(updatedAt);
		person1.setIsActive(isActive);
		System.out.println("\n\n\n************************************************************************");
		System.out.println("\n* \t Your Name : " +person1.getUsername());
		System.out.println("\n* \tYour Password : "+person1.getPassword());
		System.out.println("\n* \tYour Email :" +person1.getEmail());
		System.out.println("\n* \tYour Address: " +person1.getAddress());
		System.out.println("\n* \tYour Mobile Number : "+person1.getMobileNumber());
		System.out.println("\n* \tAccount Created At : " +person1.getCreatedAt());
		System.out.println("\n* \tAccount Updated At : "+person1.getUpdatedAt());
		System.out.println("\n* \tAccount Activity : "+person1.getIsActive());
		System.out.println("\n\n\n************************************************************************");
	}
	}
}
