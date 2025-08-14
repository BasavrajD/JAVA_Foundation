package com.dev.interfaces;

public class HDFCBank implements Bank, RBI{

	@Override
	public void credit() {
		System.out.println("HDFC - credit method");
		
	}

	@Override
	public void debit() {
		System.out.println("HDFC - debit method");
		
	}

	@Override
	public void calcInterest() {
		System.out.println("HDFC - calculate interest 2%");
		
	}
	
	//exclusive methods / features to HDFC
	public void TxnNEFT() {
		System.out.println("HDFC - fund transfer using NEFT");
	}
	
	public void payUtilityBill() {
		System.out.println("HDFC - utility bill");
	}
	
	public void checkMinBalance() {
		System.out.println("HDFC - minimum balance is: "+ minBalance);//directly calling var since its static
	}
	@Override //came from RBI
	public void guidelines() {
		System.out.println("HDFC - guidelines");
		
	}
	
	@Override //came from FinancialInstitutions -- supermost interface
	public void fiGuidelines() {
		System.out.println("HDFC - FI guidelines");
		
	}
	
	
	public static void main(String[] args) {
		HDFCBank acc = new HDFCBank();
		acc.credit();
		acc.debit();
		acc.calcInterest();
		acc.TxnNEFT();
		acc.payUtilityBill();
		acc.checkMinBalance();
		acc.defaultMethod();
		
		acc.guidelines();//method from RBI
		acc.fiGuidelines();//method from FI
		
		Bank.staticMethod();
		
		//upcasting
		//this will run methods from Bank interface but use the implementation in HDFCBank class
		Bank acc2 = new HDFCBank();
		acc2.credit();
		acc2.debit();
		acc2.calcInterest();
		
		//upcasting 
		RBI acc3 = new HDFCBank();
		acc3.guidelines();
		acc3.fiGuidelines();
		
		//upcastin to supermost interface
		FinancialInstitution acc4 = new HDFCBank();
		acc4.fiGuidelines();
		
	}



	

}
