package com.bridgelabz.stacks_and_queues;

import java.util.Scanner;

public class StacksAndQueues {

	public static void main(String[] args) {
		
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		 Operation operation = new Operation();
		while(choice != 4) {
			System.out.println("Enter a options: \n1. To push data \n2.To pop \n3. To show data\n4.To exit");
			System.out.println("enter a choice");
			choice = scanner.nextInt();
			switch(choice) {
			case 1:
				operation.push(scanner);
				break;
			case 2:
				operation.pop();
				break;
			case 3:
				operation.display();
				break;
			case 4:
				System.out.println("Exit program ");
				System.exit(0);
				break;
				
				default:
					System.out.println("Enter invalid choice");
			}
		}
		}
}
