package com.dev.operators;

public class Arithmetic {

	public static void main(String[] args) {
		//Arithmetic
		//  +, -, *, /, %
		
		double res = 5/2; //2
		double res2 = 5.0/2; //2.5
		System.out.println(res);
		System.out.println(res2);
		
		System.out.println("-----------------");
		//Simple assignment operator =
		int i = 10;
		//Compound assignment operator 
		i += 10;
		System.out.println(i);
		i -= 5;
		System.out.println(i);
		i *= 3; 
		System.out.println(i);
		i /= 5;
		System.out.println(i);
		i %= 2;
		System.out.println(i);
		System.out.println("-----------------");
		
		//relational operator -- return a boolean always
		int x=20;
		int y=20;
		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x!=y);
		System.out.println(x==y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		System.out.println("-----------------");
		
		//logical operators --- &&, ||, !
		// truth tables of all
		
		int a=10;
		int b=20;
		int c=30;
		System.out.println((a==b)); //false
		System.out.println(!(a==b)); //true
		
		System.out.println((a==b) && (a<b)); //false
		
		System.out.println((a>c) || (a<b)); //true
		System.out.println("-----------------");
		
		//bitwise operators --- &, |, ~, ^
		a = 10;//1010 
		b = 15;//1111
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~b);
		System.out.println("-----------------");
		
		//shift operators ---- <<, >>, >>
		int z = 10;
		System.out.println(z << 2);
		System.out.println(z >> 2);
		System.out.println(z >>> 2);
		
		System.out.println("-----------------");
		
		//unary operators--->  -, !, ++, --
		int k=10;
		int result = --k+k---k+--k; // 9+9-8+7=17
		System.out.println(k);//7
		System.out.println(result);//17
		
		int res1 = k+++-k++-k--; // 7+(-8)-9 = (-10)
		System.out.println(k);//8
		System.out.println(res1);//-10
		System.out.println("-----------------");
		
		//ternary operator
		// variable = condition ? true statement : false statement
		String response = (k>=35) ? "pass" : "fail";
		System.out.println(response);
		
		String ans = (a>b) ? (a>c ? "a is largest" : "c is largest") : (b>c ? "b is largest" : "c is largest");
		System.out.println(ans);
		System.out.println("-----------------");
		
		//concatenation
		System.out.println("hello" + 10); // string o/p hello10
		System.out.println("hello" + 10 + 20); //hello1020
		System.out.println("hello" + (10 + 20)); // hello30
		System.out.println(10+20+"hello"); // 30hello
		
		//System.out.println(ture + 10); //runtime error
		System.out.println('A' + 10); // 75 since A=65 ASCII
		
		

	}

}
