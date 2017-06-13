package Chapter3;
import java.util.Arrays;

public class StList {

		public int top=-1;
		public int size=20;
		public int[] array=new int[size];
		
		
		public boolean IsEmpty()
		{
			return top == -1;
		}

		public boolean IsFull()
		{
			return top == size-1;
		}
		
		 public void display()
		 {
		        for(int i=0;i<=top;i++){
		            System.out.print(array[i]+ " ");
		        }
		        System.out.println();
		 }
		
		public void push(int x)
		{
			if(IsFull())
			{
				System.out.println("Stack is full...");
			}
			else
			{
				top = top +1;
				array[top]=x;
			}		
		}
		public void pop()
		{
			if (IsEmpty())
			{
				System.out.println("Stack is Empty..");
			}
			top =top -1;
		}
		
		public int top1()
		{
			if(IsEmpty())
			{ 
				System.out.println("Stack is Empty...");
				return -1;
			}
			else
			{
				//System.out.println(array[top]);
				return array[top];
			}
		}
		
		
	
}
