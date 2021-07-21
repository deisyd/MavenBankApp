package bankapp.com.controllers;

import java.util.Scanner;

import bankapp.com.models.customer;
import bankapp.com.models.users;
import bankapp.com.models.employee;

public class Controller {
		
		public static users user  = null;
		public static Scanner scanner = new Scanner(System.in);
		public static boolean running = true;
		
		public static int appMenu() {
			System.out.printf("\n==============================\n"
					+ "\nWelcome to Flower Bank\n"
					+ "\n==============================\n");	
			System.out.printf("1. Login\n2. Register for an account\n3. Quit\n");
			int choice = 0;
			
			try {
				choice = scanner.nextInt();
			}catch(Exception except){
				System.out.print("\nError: Input not recognized!");
			}
			return choice;
		}
		
		public static int employeeMenu() {
			System.out.printf("\n=======================================\n"
					+ "\nEmployee Menu\n"
					+ "\n=======================================\n\n");
			
			System.out.printf("1. View customer's account\n"
					+ "2. View transactions\n"
					+ "3. View account applications\n"
					+ "4. Log out\n"
					+ "5. Quit\n");
			
			int choice = 0;
			
			try {
				choice = scanner.nextInt();
			}catch(Exception except){
				System.out.print("\nError: Input not recognized!");
			}
			return choice;
		}
		
		public static int customerMenu() {
			System.out.printf("\n=======================================\n"
					+ "\nCustomer Menu\n"
					+ "\n=======================================\n\n");
			
			System.out.printf("1. View Funds\n"
					+ "2. Make a withdraw\n"
					+ "3. Make a deposit\n"
					+ "4. Log out\n"
					+ "5. Quit\n");
			
			int choice = 0;
			
			try {
				choice = scanner.nextInt();
			}catch(Exception except){
				System.out.print("\nError: Input not recognized!");
			}
			return choice;
		}
		
		public static void quitMessage() {
			
			System.out.printf("\n\n\n======================================="
					+ "\n\n"
					+ "Thank you for using Flower Bank!"
					+ "\n\n"
					+ "=======================================\n\n\n");
			
		}
		public static void run() {
			
			while(running) {
				int choice1 = appMenu();
				
				switch(choice1) {
					case 1:
						//user = new customer("user1", "pass", "Rosa", "Hayes");
						 user = new employee("employee1", "pass");
						break;
					case 2: // register for an acc 
						break;
					case 3: running = false;
						quitMessage();
						break;
					default: System.out.println("Enter a number from 1-3. \n");
						break;
				}
				if (user != null && user instanceof customer) {
					boolean isCustomer = true;
					while(isCustomer) {
						int choice2 = customerMenu();
						switch(choice2) {
						case 1: // view funds
							break;
						case 2: // Make a withdraw

							break;
						case 3: // make a deposit
							break;
						case 4: user = null;
							isCustomer = false;
							break;
						case 5: isCustomer = false;
							running = false;
							quitMessage();
							break;
						default: System.out.print(" Please enter a number from 1-5.\n");
							break;
						}
					}
				}
				if (user != null && user instanceof employee) {
					boolean isEmployee = true;
					while(isEmployee) {
						int choice2 = employeeMenu();
						switch(choice2) {
						case 1: // view customers
							break;
						case 2: // view transactions

							break;
						case 3: // View account applications
							break;
						case 4: user = null;
							isEmployee = false;
							break;
						case 5: isEmployee = false;
							running = false;
							quitMessage();
							break;
						default: System.out.print(" Please enter a number from 1-5.\n");
							break;
						}
					}
				}
			}
			
		}

}
