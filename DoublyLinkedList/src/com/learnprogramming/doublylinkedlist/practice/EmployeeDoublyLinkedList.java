package com.learnprogramming.doublylinkedlist.practice;

public class EmployeeDoublyLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	
	private int size;
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		
		if(head ==null) {
			tail =node;
		}
		else {
			head.setPrevious(node);
		}
		head =node;
		size++;
	}
	
	public void addToEnd(Employee employee) {
      EmployeeNode node = new EmployeeNode(employee);
      if(tail==null) {
    	  head = node;
      }
      else {
    	  tail.setNext(node);
    	  node.setPrevious(tail);
      }
      tail = node;
      size++;
	}
	
	public EmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removeNode = head;
		
		if(head.getNext()==null) {
			tail = null;
		}
		
		else {
			head.getNext().setPrevious(null);
		}
		head = head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;
		
	}
	
	public EmployeeNode removeFromEnd() {
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removeNode = tail;
		if(tail.getPrevious()==null) {
			tail = null;
			
			
		}
		else {
			tail.getPrevious().setNext(null);
		}
		tail = tail.getPrevious();
		size--;
		removeNode.setPrevious(null);
		return removeNode;
	}
	
	public boolean addBefore(Employee newEmployee, Employee existingEmployee)
	{
		if(head == null) {
			return false;
		}
		
		//find the existing employee
		 EmployeeNode current = head;
		 while(current!=null&&!current.getEmployee().equals(existingEmployee)) {
			 current = current.getNext();
		 }
		 
		 
		 if(current ==null) {
			 return false;
		 }
		 
		 //create node for new employee 
		 EmployeeNode newNode = new EmployeeNode(newEmployee);
		 newNode.setPrevious(current.getPrevious());
		 newNode.setNext(current);
		 
		 current.setPrevious(newNode);
		 if(head ==current) {
			 head = newNode;
		 }
		 
		 else {
			 newNode.getPrevious().setNext(newNode);
		 }
		 
         size++;
		return true;
	}
	
	public boolean insertNodeAtPosition(Employee newEmployee,int position) {

		EmployeeNode currentNode =head;
		
		for (int i = 0; i < position; i++) {
			currentNode = currentNode.getNext();
	}
		 //insert  node for new employee 
		 EmployeeNode newNode = new EmployeeNode(newEmployee);
		 newNode.setPrevious(currentNode.getPrevious());
		 newNode.setNext(currentNode);
		 
		 currentNode.setPrevious(newNode);
		 if(head ==currentNode) {
			 head = newNode;
		 }
		 
		 else {
			 newNode.getPrevious().setNext(newNode);
		 }
		 
         size++;
		return true;
		


		
		
	}
	
	public EmployeeNode removeNodeNodeAtPosition(int position) {
EmployeeNode currentNode =head;
		
		for (int i = 0; i < position; i++) {
			currentNode = currentNode.getNext();
			
	}
		currentNode.getPrevious().setNext(currentNode.getNext());
		currentNode.getNext().setPrevious(currentNode.getPrevious());
		size--;
		return currentNode;
		
	}
	

    public Employee GetNode(int index)
    {
        EmployeeNode current = head;
        int count = 0; 
        while (current != null)
        {
            if (count == index)
                return current.getEmployee();
            count++;
            current = current.getNext();
        }
 

        assert (false);
        return null;
    }
	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD-->");
		while(current!=null) {
			System.out.println(current);
			current = current.getNext();
		}
		System.out.println("null");
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		if(head==null) 
			return true;
		
		return false;
		
	}
	
}
