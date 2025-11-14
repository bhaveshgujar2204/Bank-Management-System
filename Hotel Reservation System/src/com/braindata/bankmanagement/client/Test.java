package com.braindata.bankmanagement.client;

import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.serviceImpl.Sbi;
import java.util.Scanner;
public class Test
{
	public static void main(String[] args) 
	{   Scanner sc=new Scanner(System.in);
		Rbi bank=new Sbi();
		 int choice ;
		while(true){
			System.out.println("\n----- Bank Menu -----");
			System.out.println("1.  Create Account");
			System.out.println("2.  Dispaly Account Details");
			System.out.println("3.  Deposit Money");
			System.out.println("4.  Withdraw Money");
			System.out.println("5.  Check Balance");
			System.out.println("6.  Cancel Transaction");

			 choice=sc.nextInt();
			 
		  switch(choice) {
		  
		  case 1: bank.createAccount();
		   break;
		   
		  case 2: bank.displayAllDetails();
		  break;
		  
		  case 3: bank.depositeMoney();
		  break;
		  
		  case 4: bank.withdrawal();
		  break;
		  
		  case 5: bank.balanceCheck();
		  break;
		  
		  case 6: System.out.println("Exiting from Bank.. Thank You !");
		  break;
		  
		  default: System.out.println(" Sorry ...Invalid Choice !!");
		  }
 
		}
		
		
         

	}

}
