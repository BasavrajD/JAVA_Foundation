package com.dev.exceptionHandling;

public class Product {
	int pid;
	String pName;
	int unitP;
	int qty;
	int stk;
	int totalCost;
	
	
	public Product(int pid, String pName, int unitP, int qty, int stk) {
		this.pid = pid;
		this.pName = pName;
		this.unitP = unitP;
		this.qty = qty;
		this.stk = stk;
		this.totalCost = this.unitP * this.qty;
	}

	public void checkStock() throws ProductExcep {
		if(this.qty>this.stk) throw new ProductExcep();
		else System.out.println("in stock");
	}
	

	public static void main(String[] args) {
//		Product p1 = new Product(111, "Pencil", 100, 10, 10);
		
		Product[] products = new Product[3];
		products[0] = new Product(111, "Pencil", 100, 10, 10);
		products[1] = new Product(112, "Pen", 100, 10, 12);
		products[2] = new Product(111, "books", 100, 10, 5);
		
		for(Product p: products) {
			try {
				p.checkStock();
			}catch(ProductExcep e) {
				e.printStackTrace();
			}finally {
				System.out.println("finally...");
			}
		}

	}

}
