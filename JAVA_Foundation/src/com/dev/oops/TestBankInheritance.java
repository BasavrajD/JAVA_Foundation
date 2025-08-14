package com.dev.oops;

public class TestBankInheritance {

	public static void main(String[] args) {
		SavingsAccInheritance acc = new SavingsAccInheritance("SA1001", 1000.0, 5.0);
		
		acc.deposit(500.0);
		System.out.println("balance: " + acc.getBalance());
		acc.addInterest();
		System.out.println("balace after interest: " + acc.getBalance());
		acc.withdraw(500.0);
		System.out.println("balace after withdrawl: " + acc.getBalance());
		
		ODAccInheritance oda = new ODAccInheritance("OD200003", 20000.0, 10000.0);
		System.out.println("over draft limit: " + oda.getOverDraftLimit());
		
//		oda.withdraw(25000.0);
//		System.out.println("avaialable balance" + oda.getBalance());
		
		//upcasting
		AccountInheritance oda1 = new ODAccInheritance("OD200005", 10000.0, 10000.0);
		oda1.withdraw(25000.0);
		
		
		SeniorCitizenSavingsAccInheritance scAcc = new SeniorCitizenSavingsAccInheritance("SC00001", 30000.0, 5.0, 2.0);
		scAcc.scInterest();
		System.out.println("avaialable balance after SC" + scAcc.getBalance());
	}

}
