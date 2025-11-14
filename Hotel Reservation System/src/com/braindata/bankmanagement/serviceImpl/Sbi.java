package com.braindata.bankmanagement.serviceImpl;

import com.braindata.bankmanagement.service.*;
import com.braindata.bankmanagement.model.*;
import java.util.Scanner;

public class Sbi implements Rbi{
	 Account ac = null;

	 public void createAccount() 
	 {  
		 Scanner sc= new Scanner(System.in);
		 ac= new Account();
	     System.out.println("Welcome ! Enter Your Details"); 
	      System.out.println("Enter Account No.");
	        ac.setAccNo(sc.nextInt());
	        
	        System.out.println("Enter Name :");
	        ac.setName(sc.next());
	         
	            sc.nextLine();
	        System.out.println("Enter Mobile No.:");
	        ac.setMobNo(sc.nextLine());
	        
	        System.out.println("Enter Adhar Number :");
	        ac.setAdharNo(sc.nextLine());
	        
	        System.out.println("Enter Gender :");
	        ac.setGender(sc.nextLine());
	        
	        System.out.println("Enter Age :");
	        ac.setAge(sc.nextInt());
	        
	        
	        
	       System.out.println("Add Balance");
	        ac.setBalance(sc.nextDouble());
	           
	        System.out.println("Congratulations..! Account is Created.");
	     return;
	 } 
	 public void displayAllDetails() 
	 {   
		 if( ac == null) {
			 System.out.println("Account Not Created.Please create an Account");
			 return;
		 }
		 System.out.println("Account Number :" +ac.getAccNo());
		 System.out.println("Name :" +ac.getName());
		 System.out.println("Mobile Number :" +ac.getMobNo());
		 System.out.println("Adhar Number :" +ac.getAdharNo());
		 System.out.println("Gender :" +ac.getGender());
		 System.out.println("Age :" +ac.getAge());
		 System.out.println("Balance:" +ac.getBalance() +"Rs");



	 } 
	 public void depositeMoney() 
	 {   Scanner sc= new Scanner(System.in);
	    
	 if( ac == null) {
		 System.out.println("Account Not Created.Please create an Account");
		 return;
		 
	 }
		 System.out.println("Enter Ac No.");
		 int useracc =sc.nextInt();
		 
		if(ac.getAccNo()==0) {
			 System.out.println("Account Not Created.Please create an Account");
			 return;
			 
		 }
		 System.out.println("Enter Amount :");
		 int money =sc.nextInt();
		 if(money > 0) {
			 
			
			 double newbalance = ac.getBalance() + money;
			 ac.setBalance(newbalance);
			 System.out.println("Transaction Succesfull...");

		 }
		 else
		 {
			 System.out.println("Sorry ! money is Less than 0");
		 }
	 } 
	 public void withdrawal() 
	 {
		 Scanner sc= new Scanner(System.in);
	     
		 if( ac == null) {
			 System.out.println("Account Not Created.Please create an Account");
			 return;
			 
		 }
		 System.out.println("Enter Ac No.");
		 int useracc =sc.nextInt();
		 
		 
		 if(useracc==ac.getAccNo()) {
			 
			 System.out.println("Enter Amount :");
			 int money =sc.nextInt();
			 
            if(money <= ac.getBalance()) {
            	
            
			double newbalance = ac.getBalance() - money;
			 ac.setBalance(newbalance);
			 
			 System.out.println("Transaction Succesfull...");}
            
            else
            { System.out.println("Amount is less than Account Balance...");
            
            }
		 }
		 else
		 {
			 System.out.println("Sorry ! Account No. not Matched");
		 }
	 } 
	 public void balanceCheck() 
	 { 
		 Scanner sc= new Scanner(System.in);
	     
	     
		
		 
		 
		 if( ac == null) {
			 System.out.println("Account Not Created.Please create an Account");
			 return;
			 
		 }
		 System.out.println("Enter Ac No.");
		 int useracc =sc.nextInt();
		 if(useracc==ac.getAccNo()) {
			 
			 System.out.println("Available Balance :" +ac.getBalance() +"Rs");
			 
		 }
		 else
		 {
			 System.out.println("Sorry ! Account No. not Exist.");
		 }
	 } 
	 
	}


