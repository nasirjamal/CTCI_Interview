package Chapter2;
import java.util.HashSet;
public class Llist {

	Lnode head;
	public void addNodeToStart(Lnode node)
	{	
		node.next=head;
		head= node;
	}
	
	public void addNodeToEnd(Lnode node)
	{	
		if (head==null)
		{
			head= node;
		}
		else
		{
		Lnode p= head;
			while (p.next!=null)
			{
				p=p.next;
			}
			p.next=node;
			node.next=null;
		}
			
	}
	
	public void delNodeStart()
	{	
		head=head.next;
		//head= head.next;
		//System.out.println(head.next.data);
	}

	public void delNodeEnd()
	{	
		Lnode p= head;
		while(p.next.next!=null)
		{
			p=p.next;
		}
		p.next=null;
		//head= head.next;
		//System.out.println(head.next.data);
	}
	public void addNodeIndex(Lnode node, int index)
	{
		Lnode p=head;
		while(index-1!=0)
		{
			p=p.next;
			index--;
		}
		node.next=p.next;
		p.next=node;
	}
	
	public void delNodeIndex(int index)
	{	
		Lnode p= head;
		while(index-1!=0)
		{
			p=p.next;
			index--;
		}
		p.next=p.next.next;
		//head= head.next;
		//System.out.println(head.next.data);
	}

	public void delWithData(int num)
	{	
		Lnode p= head;
		while(p.next.data!=num)
		{
			p=p.next;
		}
	p.next=p.next.next;
	}

	public void removeDuplictes()
	{	
		HashSet<Integer> HS1 = new HashSet<Integer>();
		Lnode p = head;
		HS1.add(p.data);
		while (p.next!=null)
		{
			if( HS1.contains(p.next.data))
			{
				System.out.println("Duplicate found. Deleting...");
				p.next=p.next.next;
			}
			HS1.add(p.next.data);
			p=p.next;
		}
	}
	
	public void pelindrome()
	{
		int res =0;
		Lnode n = head;
		Llist L2= new Llist();
		while(n!=null)
		{
			Lnode node1 = new Lnode(n.data);
			L2.addNodeToStart(node1);
			n=n.next;
		}		
		L2.displayList();
		n = head;
		Lnode p =L2.head;
		while(n!=null)
		{
			if(n.data!=p.data)
			{
				p=p.next;
				n=n.next;
				res=0;
			}
			else
			{
				p=p.next;
				n=n.next;
				res=1;
			}
		}
		if (res==1)
		{
			System.out.println("Pelindrome!!");
		}
		else
		{
			System.out.println("Not a pelindrome!!");
		}
		
	}
	
	public void pelindromeInPlace()
	{
		int count=0;
		int index=0;
		int res =0;
		Lnode n = head;
		while (n!=null)
		{
			count++;
			n=n.next;
		}
		index=count/2;
		Lnode p =head;
		while (index!=0)
		{
			p=p.next;
			index--;
		}
		
		while(p.next!=null)
		{
			if(n.data!=p.data)
			{
				p=p.next;
				n=n.next;
				res=0;
				
			}
			else
			{
				p=p.next;
				n=n.next;
				res=1;
			}
		}
		if (res==1)
		{
			System.out.println("Pelindrome!!");
		}
		else
		{
			System.out.println("Not a pelindrome!!");
		}
		System.out.println(count);
		System.out.println(index);
	}
	
	
	public void displayList()
	{
		Lnode n = head;
		while(n!=null)
		{
			System.out.print(n.data+"->");
			n=n.next;
		}
		System.out.print("NULL\n");
		
	}
	
	
	
}
