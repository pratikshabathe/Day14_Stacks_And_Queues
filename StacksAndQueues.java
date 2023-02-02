package com.bridgelabz.stacks_and_queues;

import java.util.Scanner;

public class StacksAndQueues {

	public static void main(String[] args) {
		
		int choice;
		Scanner scanner = new Scanner(System.in);
		 Operation operation = new Operation();
		do {
			System.out.println("Enter a options: \n1. To push data \n2.Display Stack\n3.To exit");
			choice = scanner.nextInt();
			switch(choice) {
			case 1:
				operation.push(scanner);
				break;
			case 2:
				operation.display();
				break;
			case 3:
				System.out.println("Enter invalid input ");
				break;
			}
		}while(choice != 3);
	}
}
