package com.app.arrayPrograms;

abstract class Abstraction {

	abstract void study();

	abstract void test();

	static {

		System.out.println("i am static method");
	}

	public Integer marks() {
		return 100;
	}
}

class Test extends Abstraction {

	@Override
	void study() {
		System.out.println("i am study method");

	}

	@Override
	void test() {
		System.out.println("i am test method");

	}

}

class Abstr {

	public static void main(String[] args) {

	}
}
