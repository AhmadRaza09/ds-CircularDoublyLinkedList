/**
	Created By: Ahmad Raza
	Date: 30 Mar 2022
**/

public class CircularDoublyLinkedListDemo
{
	
	public static void main(String [] args)
	{
		CircularDoublyLinkedList l1 = new CircularDoublyLinkedList();
		l1.add(3);
		l1.add(5);
		l1.add(9);
		
		l1.update(10);
		System.out.println("update: " + l1.current.getValue());
		System.out.println(l1.head.getValue());
		System.out.println(l1.head.getNext().getValue());
		System.out.println(l1.head.getNext().getNext().getValue());
		
		
		
	}
}