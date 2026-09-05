package com.tnsif.nonaccessmodifiers;

final public class FinalExample {
	
	
	final int x = 100;
	
	int y = 300;
	
	final void print() {
		System.out.println("Print the value of x: "+ x);
		
	}

	public static void main(String[] args) {
		
		FinalExample fe = new FinalExample();
		fe.print();
	
		
		fe.x = 200; 
		
		fe.print();
		

	}

}

class Example extends FinalExample{
	void print() {
		
	}
}
