package Chapter3;
import java.util.ArrayList;

public class Ch3_3Func {
	public int top=-1;
	public int max=3;

	ArrayList<Integer> aL1 = new ArrayList<Integer>();

	public boolean isFull()
	{
		return top==aL1.size()-1;

	}

	public boolean isEmpty()
	{
		return top== -1;
	}


	public void push(int data)
	{
		top=top+1;
		aL1.add(data);
	}

	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Empty...");
		}
		else
		{
			top=top -1;	

		}
	}

	public int top1()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty...");
			return -1;
		}
		else
		{
			//System.out.println(array[top]);
			return aL1.get(top);
		}
	}

	public void display()
	{
		int count =1;
		int St_count=1;
		System.out.println("Stack "+St_count);
		for(int i: aL1)
		{
			if (count<=max)
			{
				System.out.print(i+" ");
				count++;
			}
			else
			{
				St_count++;
				System.out.println();
				System.out.println("Stack "+St_count);
				System.out.print(i+" ");
				count=2;
			}
		}
		System.out.println();
	}

}
