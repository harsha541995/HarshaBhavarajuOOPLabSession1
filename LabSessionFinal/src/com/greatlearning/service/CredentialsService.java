package com.greatlearning.service;

import java.lang.Math;    

import com.greatlearning.interfaces.ICredentials;

import com.greatlearning.model.Employee;


public class CredentialsService implements ICredentials {
	
@Override
public String generateEmailAddress(String firstName, String lastName, String department) {
	String emailAddress = firstName+lastName+"@"+department+"greatlearning.com";
	return emailAddress;
}


@Override

public String generatePassword() {
		
	String password = "";	
	int randomNum;
	char randomChar;
	
	
	for(int i=0; i<8; i++) {
		
	if(i<2) {
	randomNum = (int)(Math.random()*9);
	password += String.valueOf(randomNum);		//GENERATING FIRST TWO CHARACTERS OF PASSWORD AS NUMBERS		
	
	}else if(i>1 && i<4) {
		randomChar = (char)(Math.random()*25+65); //GENERATING 3RD AND 4TH CHARACTERS OF PASSWORD AS CAPITAL LETTERS BY TYPECASTING
		password += String.valueOf(randomChar);	 	
			
	}else if (i>3 && i<6) {
		randomChar = (char)(Math.random()*25+97); //GENERATING 5TH AND 6TH CHARACTERS OF PASSWORD AS SMALL LETTERS BY TYPECASTING
		password += String.valueOf(randomChar);	
	
	}else {
		randomChar = (char)(Math.random()*14+33);  //GENERATING 7TH AND 8TH CHARACTERS OF PASSWORD AS SPECIAL CHARACTERS BY TYPECASTING
		password += String.valueOf(randomChar);	
	}
			}	
			
	return password;
}



@Override

public void showCredentials(Employee employee) {
	
System.out.println("Dear " +employee.getFirstName()+" " + "your credentials are:");
System.out.println("Email ID:"+ employee.getEmail());
System.out.println("Password:" +employee.getPassword());
	
}


}
