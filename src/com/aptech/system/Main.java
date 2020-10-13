package com.aptech.system;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeManagement em = new EmployeeManagement();
		int choice;

		System.out.println("Please select: ");
		System.out.println("1. Add New.");
		System.out.println("2. Show All.");
		System.out.println("3. Search.");
		System.out.println("4. Exit.");
		System.out.print("Your choice: ");
		choice = Integer.parseInt(sc.nextLine());

		do {
			switch (choice) {
			case 1:
				em.addEmployee();
				break;
			case 2:
				em.showEmployee();
				break;
			case 3:
				System.out.print("Enter employee name: ");
				String name = sc.nextLine();
				em.searchByName(name);
				break;

			default:
				break;
			}
		} while (choice != 4);

		System.out.println("Good bye!");
	}
}
