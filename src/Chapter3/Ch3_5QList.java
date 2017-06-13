package Chapter3;

public class Ch3_5QList {
	Ch3_5QNode first=null;
	Ch3_5QNode last=null;
	
	
	public boolean isEmpty()
	{
		return first==null && last==null;
		
	}
	
	public void enQueue(Ch3_5QNode node)
	{
		if (isEmpty())
		{
			first=node;
			last=node;
		}
		else
		{
			last.next=node;
			last=node;
		}
		
	}
	public void deQueue()
	{
		if (isEmpty())
		{
			System.out.println("Queue Empty");
		}
		else
		{
			Ch3_5QNode node=first;
			first=first.next;
			node.next=null;
		}
	}
	
	public void deQueue1()
	{
		Ch3_5QNode ptr=first;
		if (isEmpty())
		{
			System.out.println("Queue Empty");
		}
		else
		{
			while (ptr.data!=1)
			{
				ptr=ptr.next;
			}
			//Ch3_5QNode node;
			ptr.data=ptr.next.data;
			ptr.next=ptr.next.next;
		}
	}
	
	public void deQueue2()
	{
		Ch3_5QNode ptr=first;
		if (isEmpty())
		{
			System.out.println("Queue Empty");
		}
		else
		{
			while (ptr.data!=2)
			{
				ptr=ptr.next;
			}
			//Ch3_5QNode node;
			ptr.data=ptr.next.data;
			ptr.next=ptr.next.next;
		}
	}
	
	public void display()
	{
	 Ch3_5QNode ptr1=first;
		while (ptr1!=null)
		{
			System.out.print(ptr1.data+"->");
			ptr1=ptr1.next;
		}
		System.out.println("null");
	}
}
