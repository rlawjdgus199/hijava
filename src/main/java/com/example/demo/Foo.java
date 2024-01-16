package com.example.demo;

public class Foo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//익명내부 클래스
		RunSomething runSomthing = new RunSomething() {
			
			public void doIt() {
				// TODO Auto-generated method stub
				System.out.println("Hello");
				System.out.println("test");
			}
			
		}; 

	};

}
