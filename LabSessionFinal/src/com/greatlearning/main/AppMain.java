package com.greatlearning.main;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;

import java.util.Scanner;


public class AppMain {
 public static void main(String[] args) {

	 Employee demoemployee = new Employee("harsha", "bhavaraju");
	 ICredentials credentialsService = new CredentialsService();
	 
	 int departmentInt;

	 do {
	 	
	 	Scanner departmentInput = new Scanner(System.in);
	 	System.out.println("Please enter your department number");  //To avoid invalid entries
	 	System.out.println("1. Technical");
	 	System.out.println("2. Admin");
	 	System.out.println("3. Human Resources");
	 	System.out.println("4. Legal");	
	 	departmentInt = departmentInput.nextInt();	

	 }	 while(departmentInt>4 || departmentInt<0) ;
	 
	 
	 String generatedEmail;
	 String generatedPassword;
	 String department="";
	 	
	 	switch(departmentInt) {

	 	case 1:{
	 	department = "tech";
	 	break;
	 	}

	 	case 2:{
	 	department = "admin";
	 	break;
	 	}

	 	case 3:{
	 	department = "hr";
	 	break;
	 	}

	 	case 4:{
	 	department = "legal";
	 	break;
	 	}
	 	}	
	 	
generatedEmail = credentialsService.generateEmailAddress(demoemployee.getFirstName(), demoemployee.getLastName(), department); 	
generatedPassword = credentialsService.generatePassword();


demoemployee.setEmail(generatedEmail);
demoemployee.setPassword(generatedPassword);

credentialsService.showCredentials(demoemployee);
	 
	 
}
}
