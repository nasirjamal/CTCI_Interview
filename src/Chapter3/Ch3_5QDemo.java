package Chapter3;
import java.util.*;

public class Ch3_5QDemo {

	public static void main(String[] args) {
		Ch3_5QList L1= new Ch3_5QList();

		while(true)
		{
			System.out.println("1. EnQueue");
			System.out.println("2. DeQueue");
			System.out.println("3. Display");
			System.out.println("4. DeQueue 1(CAT)");
			System.out.println("5. DeQueue 2(DOG)");
			System.out.println("0. Exit");
			Scanner input= new Scanner(System.in);
			int ch = input.nextInt();

			switch (ch)
			{
			case 1:
				System.out.println("Please enter data for Queue: ");
				int d1= input.nextInt();
				Ch3_5QNode N1= new Ch3_5QNode(d1);
				L1.enQueue(N1);
				while(true)
				{
					System.out.println("Do you want to enter more data:");
					char ch1= input.next().charAt(0);
					if (ch1!='y')
					{
						break;
					}
					else
					{
						System.out.println("Please enter data for Queue: ");
						int d2= input.nextInt();
						Ch3_5QNode N2= new Ch3_5QNode(d2);
						L1.enQueue(N2);
					}
				}
				break;
			case 2:
				L1.deQueue();
				break;
			
			case 3:
				L1.display();
				break;
			
			case 4:
				L1.deQueue1();
				break;
			
			case 5:
				L1.deQueue2();
				break;
					
			
				
			}

		}
	}

}
