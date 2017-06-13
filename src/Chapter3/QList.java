package Chapter3;

public class QList {
QLNode head;

public void enQueue(QLNode node)
	{
		QLNode rear;
		node.next=head;
		head=node;
	}
public void deQueue()
	{
		QLNode p=head;
		if(p.next==null)
			p=null;
		else
		{
			while (p.next.next!=null)
			{
				p=p.next;
			}
			p.next=null;
		}
	}
public void displayQueue()
	{
		QLNode p= head;
		while (p!=null)
		{
			System.out.print("|");
			System.out.print(p.data);
			System.out.print("|");
			p=p.next;
		}
		System.out.println("\n");
	}

}



