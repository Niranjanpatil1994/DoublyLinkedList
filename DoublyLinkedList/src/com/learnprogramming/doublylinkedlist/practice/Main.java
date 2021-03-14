package com.learnprogramming.doublylinkedlist.practice;

public class Main {

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("mike", "Wilson", 3245);
		
		
		
		
		
		EmployeeDoublyLinkedList employeeList = new EmployeeDoublyLinkedList();
		System.out.println("Size of List "+ employeeList.getSize());
		System.out.println("Empty List "+ employeeList.isEmpty());
		employeeList.addToFront(janeJones);
		employeeList.addToFront(johnDoe);
		employeeList.addToFront(marySmith);
		employeeList.addToFront(mikeWilson);
		
		employeeList.printList();

		System.out.println("Size of List "+ employeeList.getSize());
		System.out.println("Empty List "+ employeeList.isEmpty());
		
		Employee billEnd = new Employee("Bill", "End", 781);
		employeeList.addToEnd(billEnd);
		employeeList.printList();
		System.out.println("Size of List "+ employeeList.getSize());
		
		employeeList.removeFromFront();
		employeeList.printList();
		System.out.println("Size of List "+ employeeList.getSize());
		
		
		System.out.println("--Remove From end--");
		employeeList.removeFromEnd();
		employeeList.printList();
		System.out.println("Size of List "+ employeeList.getSize());
		
		System.out.println("--Remove From end--");
		employeeList.removeFromEnd();
		employeeList.printList();
		System.out.println("Size of List "+ employeeList.getSize());
		
		
		
	}

}
