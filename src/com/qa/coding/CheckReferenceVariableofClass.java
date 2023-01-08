package com.qa.coding;

public class CheckReferenceVariableofClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scenario 1
		Parent parent = new Parent();
		parent.add();
		System.out.println(parent.name);

		// Scenario 2

		Parent p1 = new Child();

		p1.add();

		System.out.println(p1.name);

		// Scenario 3

		//Sodhi sodhi = new

	}

}

class Parent {

	String name = "sai";

	void add() {
		System.out.println("this is Paret add method");
	}
}

class Child extends Parent {

	String name = "Prakash";

	void sub() {
		System.out.println("this is sub method");
	}

	void add() {
		System.out.println("this is Child add method");
	}
}

class Great {

	String name = "great name";

	void add() {
		System.out.println("this is great add metod");
	}

}

interface Sodhi {

	String name = "sodhi";

	static void add() {
		System.out.println("this is sodhi method");
	}

}
