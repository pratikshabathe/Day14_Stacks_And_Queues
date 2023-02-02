package com.bridgelabz.stacks_and_queues;

import java.util.Scanner;

public class Operation {

	Node top = null;
	
	void push (Scanner scanner) {
		
		System.out.println("Enter data: ");
		int data = scanner.nextInt();
		
		Node newNode = new Node(data);
		
		if(top == null) {
			top = newNode;
		}else {
			newNode.next = top;
			top = newNode;
		}
	}
	
	void display() {
		Node temp = top;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
