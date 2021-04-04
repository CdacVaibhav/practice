package com.app.arrayPrograms;

class Add {
	
	public void run() {
		System.out.println("sumit");
	}
	
	 static void play() {
		
		 
		 System.out.println("play");
	}
	 
	 static {
		 System.out.println("i am static ");
	 }

}

public class Test extends Add {

	public static void main(String[] args) {

		Add a = new Add();
		a.run();
		a.play();
	}

}
