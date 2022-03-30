/**
	Created By: Ahmad Raza
	Date: 30 Mar 2022
**/

public class CircularDoublyLinkedList
{
	//store the refrence of the first node
	private DoublyNode head;
	
	//store the refrence of the last node
	private DoublyNode tail;
	
	//store the refrence of the current node this node move anywhere in the chain
	private DoublyNode current;
	
	//store the size of the node in the chain
	private int size;
	
	public CircularDoublyLinkedList()
	{
		head = null;
		tail = null;
		current = null;
		size = 0;
	}
}