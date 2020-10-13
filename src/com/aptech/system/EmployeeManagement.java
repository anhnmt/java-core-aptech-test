package com.aptech.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aptech.employee.Employee;

public class EmployeeManagement {
	private List<Employee> listEmployee = new ArrayList<Employee>();

	public void addEmployee() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Add Employee: ");
		System.out.print("N = ");
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			Employee e = new Employee();
			e.input();
			listEmployee.add(e);
		}
	}

	public void showEmployee() {
		System.out.println("List Employee: ");

		System.out.println("+----+----------+---------+-------+");
		System.out.println("| Id | FullName | PhoneNo | Email |");
		System.out.println("+----+----------+---------+-------+");

		listEmployee.forEach(obj -> {
			obj.display();
			System.out.println("+----+----------+---------+-------+");
		});
	}

	public List<Employee> searchByName(String name) {
		System.out.println("Search Employee: ");
		return null;

	}
}
