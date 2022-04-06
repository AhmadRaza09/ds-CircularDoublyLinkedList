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
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		l1.add(10);
		
		System.out.println("Start");
		
		l1.start();
		for(int i = 0; i < l1.getSize(); i++)
		{
			System.out.print(l1.get());
			if(i < l1.getSize() - 1)
			{
				System.out.print("->");
			}
			l1.next();
		}
		System.out.println();
		
		System.out.println("End");
		
		l1.tail();
		for(int i = 0; i < l1.getSize(); i++)
		{
			System.out.print(l1.get());
			if(i < l1.getSize() - 1)
			{
				System.out.print("<-");
			}
			l1.back();
		}
		System.out.println();
		
		
		l1.tail();
		l1.remove();
		l1.remove();
		l1.remove();
		
		l1.start();
		for(int i = 0; i < l1.getSize(); i++)
		{
			System.out.print(l1.get());
			if(i < l1.getSize() - 1)
			{
				System.out.print("->");
			}
			l1.next();
		}
		System.out.println();
		
		System.out.println("End");
		
		l1.tail();
		for(int i = 0; i < l1.getSize(); i++)
		{
			System.out.print(l1.get());
			if(i < l1.getSize() - 1)
			{
				System.out.print("<-");
			}
			l1.back();
		}
		System.out.println();
		
		
		l1.start();
		l1.remove();
		l1.remove();
		l1.remove();
		
		l1.start();
		for(int i = 0; i < l1.getSize(); i++)
		{
			System.out.print(l1.get());
			if(i < l1.getSize() - 1)
			{
				System.out.print("->");
			}
			l1.next();
		}
		System.out.println();
		
		System.out.println("End");
		
		l1.tail();
		for(int i = 0; i < l1.getSize(); i++)
		{
			System.out.print(l1.get());
			if(i < l1.getSize() - 1)
			{
				System.out.print("<-");
			}
			l1.back();
		}
		System.out.println();
		
		
		l1.tail();
		l1.next();
		l1.next();
		l1.remove();
		l1.remove();
		l1.remove();
		
		l1.start();
		for(int i = 0; i < l1.getSize(); i++)
		{
			System.out.print(l1.get());
			if(i < l1.getSize() - 1)
			{
				System.out.print("->");
			}
			l1.next();
		}
		System.out.println();
		
		System.out.println("End");
		
		l1.tail();
		for(int i = 0; i < l1.getSize(); i++)
		{
			System.out.print(l1.get());
			if(i < l1.getSize() - 1)
			{
				System.out.print("<-");
			}
			l1.back();
		}
		System.out.println();
		
		
		
		
		
		
	}
}