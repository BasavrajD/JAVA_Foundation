package com.dev.abstraction;

//partial abstraction
abstract class Account{
	//we can have static, final, etc...
	final long accNum = 1234567890;// actually this should be private but see this just for ease
	String accType = "Savings";
	
	
	public Account() {
		System.out.println("constructor for account class");
	}
	
	//abstract method
	public abstract void transaction();
	
	//non static method
	public void getIFSC() {
		System.out.println("HDFC0000202");
	}
	
	//static method
	public static void getBranch() {
		System.out.println("Santacruz");
	}
}


public class Bank extends Account{

	@Override //mandatory to be override
	public void transaction() {
		
		System.out.println("fund tn");
	}
	public void getIFSC() {
		System.out.println("SBII0000202");
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		System.out.println(bank.accNum);
		System.out.println(bank.accType);
		
		getBranch();
		bank.getIFSC();//bank implementation
		bank.transaction(); //comes from Bank class
		System.out.println("*****************");
		
		//you can't create obj for abstract class like
		//Account obj = new Account 
		//still you can upcast like 
		Account obj = new Bank();
		obj.getIFSC();//account implementation
		obj.transaction();
	}

}
