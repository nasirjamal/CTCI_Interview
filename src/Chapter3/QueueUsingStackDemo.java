package Chapter3;
import java.util.Stack;
import java.util.Iterator;
import java.util.Scanner;

public class QueueUsingStackDemo {

	public static void main(String[] args) {
		Stack<Integer> S1 = new Stack<Integer>();
		Stack<Integer> S2 = new Stack<Integer>();


		while (true)
		{
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("4. Display");
			System.out.println("0. Exit");
			Scanner input = new Scanner(System.in);
			int ch1 = input.nextInt();
			switch (ch1)
			{
			case 0:
				System.exit(0);
				break;

			case 1:
				System.out.println("Enter Element to Add to Queue: ");
				int data1= input.nextInt();
				S1.push(data1);
				while (true)
				{
					System.out.println("Press y to add data to Queue Or any other key to Exit");
					char ch = input.next().charAt(0);
					if(ch != 'y')
					{
						break;
					}
					else
					{
						System.out.println("Enter Element to Add to Queue: ");
						int data2= input.nextInt();
						S1.push(data2);
					}
				}
				break;

			case 2:
				System.out.println("In Deque");
				if (!S2.isEmpty())
				{
					System.out.println(S2.pop());
					break;
				}
				else
				{
					if (S1.isEmpty())
					{
						System.out.println("No Data found, Queue Empty!!");
						break;
					}
					else
					{
						while (!S1.isEmpty())
						{
							S2.push(S1.pop());
						}
						System.out.println(S2.pop());
					break;
					}
					
				}
				
			
			case 4:
				System.out.println("S1: "+S1);
				System.out.println("S2: "+S2);
				break;
			}

		}
	}

}
