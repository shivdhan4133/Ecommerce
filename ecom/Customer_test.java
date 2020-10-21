package ecom;

import java.util.Scanner;

public class Customer_test {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		//for new user sign up
		System.out.println("Enter name : ");	
		String Name = sc.nextLine();
		System.out.println("Enter address : ");
		String Add = sc.nextLine();
		System.out.println("Enter email : ");
		String mail = sc.next();
		System.out.println("Enter pincode : ");
		int pin = sc.nextInt();
		System.out.println("Enter mobile no : ");
		long mob = sc.nextLong();
		
		Customer C1 = new Customer( Name,Add,mail,pin,mob);
		C1.Show();
		sc.close();

	}

}
