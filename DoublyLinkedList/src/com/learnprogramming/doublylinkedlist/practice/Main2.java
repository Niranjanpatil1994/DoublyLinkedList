package com.learnprogramming.doublylinkedlist.practice;

public class Main2 {

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


		
		Employee billEnd = new Employee("Bill", "End", 781);
		//employeeList.addBefore(billEnd, johnDoe);
		employeeList.insertNodeAtPosition(billEnd, 2);
		employeeList.printList();
		System.out.println("Size of List "+ employeeList.getSize());
		

				employeeList.removeNodeNodeAtPosition(3);
				employeeList.printList();
				System.out.println("Size of List "+ employeeList.getSize());
				
				Employee employeeDetails = employeeList.GetNode(2);
				System.out.println(employeeDetails.getFirstName());
				
				Employee nilEnd = new Employee("nil", "End", 781);
				employeeList.addToEnd(nilEnd);
				employeeList.printList();
				
				Employee sumEnd = new Employee("sum", "End", 781);
				employeeList.addBefore(billEnd, nilEnd);
	}

}
