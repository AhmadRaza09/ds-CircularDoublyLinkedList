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
	
	//return the size of the chain
	public int getSize()
	{
		return size;
	}
	
	//add the node in the chain after the current node
	public void add(int addValue)
	{
		DoublyNode newNode = new DoublyNode();
		newNode.setValue(addValue);
		
		if(current == null)
		{
			current = newNode;
			head = newNode;
			tail = newNode;
			current.setNext(newNode);
			current.setPrev(newNode);
		}
		else
		{
			if(current.getNext() == head)
			{
				newNode.setNext(current.getNext());
				newNode.setPrev(current);
				current.setNext(newNode);
				head.setPrev(newNode);
				current = newNode;
				tail = current;

			}
			else
			{
				newNode.setNext(current.getNext());
				newNode.setPrev(current.getNext().getPrev());
				current.setNext(newNode);
				newNode.getNext().setPrev(newNode);
				current = newNode;
			}
		}
		
		size = size + 1;
		
		
	}
	
	//remove the current node from the chain
	public void remove()
	{
			//if list is empty then nothing to do
			if(current != null)
			{
				//if size is 1 then is mean only one nonde in chain so set all refrences to null
				if(size == 1)
				{
					head.setPrev(null);
					tail.setNext(null);
					head = null;
					current = null;
					tail = null;
				}
				else
				{
					if(head == current)
					{
						current.getNext().setPrev(current.getPrev());
						current = current.getNext();
						tail.setNext(current);
						head = current;
					}
					else if(tail == current)
					{
						current = current.getPrev();
						current.setNext(head);
						tail = current;
						head.setPrev(tail);
					}
					else
					{
						current.getNext().setPrev(current.getPrev());
						current.getPrev().setNext(current.getNext());
						current = current.getPrev();
					}
					
					
				}
				
				//decrease chain size;
				size = size - 1;
			}
	}
	
	//find the value if find then point current to that node
	public boolean find(int findValue)
	{
		//for set current and lastCurrentNode
		DoublyNode temp = head;
		
		for(int i = 1; i <= size; i++)
		{
			
			if(temp.getValue() == findValue)
			{
				current = temp;
				return true;
			
			}
			temp = temp.getNext();
		}
		
		return false;	
		
	}
	
	
	//update the value on which current node refer
	public void update(int updateValue)
	{
		if(current != null)
		{
			current.setValue(updateValue);
		}
	}
	
	//remove all the node from the chain
	public void clear()
	{
		if(current != null)
		{
			current = head;
			do
			{
				if(current.getNext() != head)
				{
					current.getNext().setPrev(null);
					current = current.getNext();
				}
				
			}
			while(current.getNext() != head);
			head.setPrev(null);
			tail.setNext(null);
			head = null; 
			tail = null;
			current = null;
			size = 0;
		}
	}
	
	//get the value where current node piont, if current node is null then throws ListEmptyException
	public int get() throws ListEmptyException
	{
		if(current != null)
		{
			return current.getValue();
		}
		
		throw new ListEmptyException("List is empty");
		
	}
	
		//traversing list operation
	
	//move the current reference to the next node in the chain
	public boolean next()
	{
		
		
		if(head != null)
		{
			
			current = current.getNext();
			return true;
		}
	
		//if current is not connected to the next node then return false
		return false;
	}
	
	//piont the current to the head
	public void start()
	{
		current = head;
	}
	
	//point the current to the tail
	public void tail()
	{
		current = tail;
	}
	
	//move the current reference to the back node in the chain
	public boolean back()
	{
		
		
		if(head != null)
		{
			
			current = current.getPrev();
			return true;
			
		}
	
		//if current is not connected to the next node then return false
		return false;
	}
	
	
}