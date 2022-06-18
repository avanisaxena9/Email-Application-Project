package emailapp;

import java.util.Scanner;

public class Email {
		private String firstName;
		private String lastName;
		private String password;
		private String department;
		private String email;
		private int mailboxCapacity = 500;
		private int defaultPasswordLength = 8;
		private String alternateEmail;
		private String companyname = "abccompany.com";
		
		//Constructor to receive the first name and the last name
		
		public Email(String firstName, String lastName) {
			
			this.firstName=firstName;
			this.lastName=lastName;
			
			 
			//Call a method asking for the department and then return the department
			this.department = setDepartment();
		
			
			//Call a method that return a random password
			this.password = randomPassword(defaultPasswordLength);
			System.out.println("PASSWORD: "+this.password);
			
			//Combine elements to generate email
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companyname;
			System.out.println("EMAIL ID: "+ email + "\n\n");
			
		}
		
		//Ask for the department
		private String setDepartment() {
			System.out.println("New Worker: " + firstName + "\nDepartment Codes:\n1for Sales\n2 for Development\n3 for Account\nEnter the department code:");
			Scanner in = new Scanner(System.in);
			int depChoice = in.nextInt();
			if(depChoice == 1) return "sales.";
			else if(depChoice == 2) return "dev.";
			else if(depChoice == 3) return "acct.";
			else return "";

		}
		
		//Generate a random password
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
			char[] password = new char[length];
			for(int i=0;i<length;i++) {
				int rand = (int) (Math.random() * passwordSet.length());
				password[i]=passwordSet.charAt(rand);
			}
			return new String(password);
			
		}
		
		//Set the mailbox capacity
		public void setMailboxCapacity (int capacity) {
			this.mailboxCapacity= capacity;			
		}
		
		//Set the alternate email
		public void setAlternateEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
		//Change the password 		
		public void changePassword(String password) {
			this.password = password;
		}
		
		public int  getMAilboxCapacity() { return mailboxCapacity; }
		public String getAlternateEmail() { return alternateEmail; }
		public String getPassword() { 
			System.out.print("PASSWORD: ");
			return password; }
		
		public void showInfo() {
			System.out.println("\nDISPLAY NAME: "+ firstName + " " + lastName +
					"\nCOMPANY EMAIL: " + email +
					"\nMAILBOX CAPACITY: " + mailboxCapacity + "MB");
					if(alternateEmail!=null)
						System.out.println("ALTERNATE EMAIL ID:" + alternateEmail);
						
			
		}
		
		
		
		
}
