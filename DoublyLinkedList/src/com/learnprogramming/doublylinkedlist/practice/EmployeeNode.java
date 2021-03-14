package com.learnprogramming.doublylinkedlist.practice;

public class EmployeeNode {

	private Employee employee;
	private EmployeeNode next;
	private EmployeeNode previous;
	
	public EmployeeNode getPrevious() {
		return previous;
	}

	public void setPrevious(EmployeeNode previous) {
		this.previous = previous;
	}

	public EmployeeNode(Employee employee) {
		super();
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}
	
	public String toString(Employee employee) {
		return employee.toString();
	}

	@Override
	public String toString() {
		return "EmployeeNode [employee=" + employee + ", next=" + next + "]";
	}
	
}
