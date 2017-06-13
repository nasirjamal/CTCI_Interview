package Chapter3;

import java.util.*;
public class QDemo {

	public static void main(String[] args) {
		int data, choice;
		// TODO Auto-generated method stub
		QList Q1 = new QList();
		Scanner input = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. EnQueue");
			System.out.println("2. DeQueue");
			System.out.println("3. Front");
			System.out.println("4. Print Queue");
			System.out.println("0. Exit");
			
			System.out.println("Enter your Choice: ");
			choice= input.nextInt();
			switch (choice)
				{
					case 0:
						System.out.println("Terminating Program...");
						System.exit(0);
					case 1:
						System.out.println("Enter data for node: ");
						data = input.nextInt();
						QLNode N1= new QLNode(data);
						Q1.enQueue(N1);
						 
						while (true)
						{
							System.out.println("Press y to add more data or any other key to exit: ");
							char ch = input.next().charAt(0);
							if(ch!= 'y')
							break;
							else
							{
								System.out.println("Enter data for node: ");
								data = input.nextInt();
								QLNode N2 = new QLNode(data);
								Q1.enQueue(N2);
							}
						}
						break;
					
					case 2:
						Q1.deQueue();
						break;
						
					case 3:
						System.out.println("In Front function..");
						break;
						
					case 4:
						Q1.displayQueue();
						break;
						
					default:
						System.out.println("Please select Valid option...");
				}			
		}
		
		
	}

}
