package Chapter3;

import java.util.*;
public class Ch3_1 {

	static int top=-1;
	static int size=10;
	static int top2=9;
	static int top3=19;
	static int[] array=new int[size*3];
	
	
	
	public boolean IsEmpty(int st)
	{
		if (st==1)
		{
			return top == -1;
		}
		else if (st==2)
		{
			return top2 == 9;
		}
		else if (st==3)
		{
			return top3 == 19;
		}
		
		return false;
		
	}

	public boolean IsFull(int st)
	{
		if (st==1)
		{
			return top == size-1;
		}
		else if (st==2)
		{
			return top2 == size-1;
		}
		else if (st==3)
		{
			return top3 == size-1;
		}
		return false;
	}
	
public void push(int x, int st)
	{
		if (st==1)
		{
			if(IsFull(st))
			{
				System.out.println("Stack is full...");
			}
			else
			{
				top = top +1;
				array[top]=x;
			}
		}
		
		if (st==2)
		{
			if(IsFull(st))
			{
				System.out.println("Stack is full...");
			}
			else
			{
				top2 = top2 +1;
				array[top2]=x;
			}
		}
		
		if (st==3)
		{
			if(IsFull(st))
			{
				System.out.println("Stack is full...");
			}
			else
			{
				top3 = top3 +1;
				array[top3]=x;
			}
		}
	}


public void pop(int st)
{
	if (st==1)
	{
		if (IsEmpty(st))
		{
			System.out.println("Stack empty");
		}
		else
		{
			top = top-1;
		}
	}
	
	else if (st==2)
	{
		if (IsEmpty(st))
		{
			System.out.println("Stack empty");
		}
		else
		{
			top2 = top2-1;
		}
	}
	
	else if (st==3)
	{
		if (IsEmpty(st))
		{
			System.out.println("Stack empty");
		}
		else
		{
			top3 = top3-1;
		}
	}
}

	
	 public void display(int st)
	 {
		 if(st==1)
		 {
	        for(int i=0;i<=top;i++){
	            System.out.print(array[i]+ " ");
	        }
	        System.out.println();
		 }
		 
		 if(st==2)
		 {
	        for(int i=0;i<=top2;i++){
	            System.out.print(array[i]+ " ");
	        }
	        System.out.println();
		 }
		 
		 if(st==3)
		 {
	        for(int i=0;i<=top3;i++){
	            System.out.print(array[i]+ " ");
	        }
	        System.out.println();
		 }
	 }
	 
	 public void front(int st)
		{
		 
			 if (st==1)
			 {
				if(IsEmpty(st))
				{
					System.out.println("Stack is Empty...");
				}
				else
				{
					System.out.println(array[top]);
				}
			 }
			 
			 if (st==2)
			 {
				if(IsEmpty(st))
				{
					System.out.println("Stack is Empty...");
				}
				else
				{
					System.out.println(array[top2]);
				}
			 }
			 
			 if (st==3)
			 {
				if(IsEmpty(st))
				{
					System.out.println("Stack is Empty...");
				}
				else
				{
					System.out.println(array[top3]);
				}
			 }
		}
	 
	 
	 public static void main (String[] args)
	 {
		
		 Ch3_1 st1 = new Ch3_1();
		 Ch3_1 st2 = new Ch3_1();
		 Ch3_1 st3 = new Ch3_1();
		 while (true)
		 {

			 System.out.println("3 Stacks of Max size 10 per stack...");
			 System.out.println("Enter stack number.. 1, 2 or 3: ");
			 System.out.println("Press 0 to exit..");
			 Scanner input = new Scanner(System.in);
			 int data =input.nextInt();
			 
			 if (data==0)
			 {
				 System.exit(0);
			 }
			 
			 else 
			 {
				 
				 
				 System.out.println("1. PUSH");
				 System.out.println("2. POP");
				 System.out.println("3. FRONT");
				 System.out.println("4. Display stack");
				 int ch = input.nextInt();
				 switch (ch)
				 {
				 case 1:
					 System.out.println("Enter data to add in stack...");
					 int st_data = input.nextInt();
					 if (data ==1)
					 {
						 st1.push(st_data, data);
					 }
					 else if (data ==2)
					 {
						 st2.push(st_data, data);
					 }
					 else if (data ==3)
					 {
						st3.push(st_data, data); 
					 }
					 else 
					 {
						 System.out.println("Invalid Stack number...");
					 }
					 break;
					
				 case 2:
					 if (data ==1)
					 {
						 st1.pop(data);
					 }
					 else if (data ==2)
					 {
						 st2.pop(data);
					 }
					 else if (data ==3)
					 {
						 st3.pop(data); 
					 }
					 else 
					 {
						 System.out.println("Invalid Stack number...");
					 }
					 break;
					 
					 
				 case 3:
					 if (data ==1)
					 {
						 st1.front(data);
					 }
					 else if (data ==2)
					 {
						 st1.front(data);
					 }
					 else if (data ==3)
					 {
						 st1.front(data);
					 }
					 else 
					 {
						 System.out.println("Invalid Stack number...");
					 }
					 break;
				
					 
					 
				 case 4:
					 if (data ==1)
					 {
						 st1.display(data);
					 }
					 else if (data ==2)
					 {
						 st2.display(data);
					 }
					 else if (data ==3)
					 {
						 st3.display(data);				 }
					 else 
					 {
						 System.out.println("Invalid Stack number...");
					 }
					 break;
					 
				 }
				 
			 }
			 
		  } 
		 
		 
	 }
}