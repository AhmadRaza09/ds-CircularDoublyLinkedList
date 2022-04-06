/**
	Created By: Ahmad Raza
	Date: 30 Mar 2022
**/

public class CircularDoublyLinkedListDemo
{
	
	public static void main(String [] args) throws ListEmptyException
	{
		CircularDoublyLinkedList l1 = new CircularDoublyLinkedList();
		l1.add(1);
		l1.add(2);
		l1.start();
		System.out.println(l1.get());
		l1.next();
		System.out.println(l1.get());
		l1.next();
		System.out.println(l1.get());
		
		
		
		
		
		
	}
}