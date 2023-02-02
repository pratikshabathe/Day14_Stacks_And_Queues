package com.bridgelabz.stacks_and_queues;

import java.util.Scanner;

public class Operation {

	int top;
	int maxsize = 5;
	int[] a = new int[maxsize];
	
	boolean isEmpty(){
		return (top < 0);
	}
	
	void operation(){
		top = -1;
	}
	boolean push (Scanner scanner) {
		
		if(top == maxsize) {
			System.out.println("Overflow");
			return false;
		}else {
			System.out.println("Enter value");
			int val = scanner.nextInt();
			top++;
			a[top] = val;
			System.out.println("pushed value");
			return true;
		}
	}
	
	boolean pop() {
		if(top == -1) {
			System.out.println("Underflow");
			return false;
		}else {
			top--;
			System.out.println("pop value");
			return true;
		}
	}
	void display() {
		System.out.println("Printing stack element: ");
		for(int i = top; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}
}
