package day1.examples;

import day1.exercises.A;
import day1.exercises.B;

public class MyFirstClass {
	public A aVariable;

	public MyFirstClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("dsd");
//		String d = "Two";
//		switch(d) {
//		   case "Two":System.out.print("1");;
//		   case "2":System.out.print("2");;
//		   case "3":System.out.print("3");;
//		}
		Employee alex, linda;
		alex = new Employee();
//		linda = new Employee();
//		alex.calculatePay();
//		linda.calculatePay();
//		A objA = new A();
//		objA.methodA();
//		objA
		B objB = new B();
		objB.methodA();
		//error en tiempo de ejecucion, email es interface
		objB.notifyEmployee();
		
		A objc = new B();
		objc.methodA();
		
		alex.calculatePay();
		
	}

}
