
package Chapter2;
import java.util.Scanner;


public class LlistDemo {

	
	static Scanner input = new Scanner(System.in);
	
	

	public static void main(String[] args)
	{	
		Llist L1= new Llist();

		while (true)
		{
			System.out.println("-----------------------------------------------");
			System.out.println("Linked List ");
			System.out.println("-----------------------------------------------\n");
			System.out.println("1. Add node at the start of List");
			System.out.println("2. Add node at the end of List");
			System.out.println("3. Add node at index");
			System.out.println("4. Remove node at start");
			System.out.println("5. Remove node at the end");
			System.out.println("6. Remove node at Index");
			System.out.println("7. Remove node matching data");
			System.out.println("8. Remove Duplicates");
			System.out.println("9. Add List");
			System.out.println("10. Check if Linked List is pelindrome or not");
			System.out.println("11. Display List");
			System.out.println("\n\nChoose from above options OR press 0 to Exit....");
			
			Scanner input =new Scanner(System.in);
			int choice = input.nextInt();
			switch (choice)
			{
				case 0:
					System.out.println("Program Terminated!");
					System.exit(0);
				break;
				case 1:
					System.out.println("Enter Data for node: ");
					int data = input.nextInt();
					Lnode node1 = new Lnode(data);
					L1.addNodeToStart(node1);
					break;
					
				case 2:
					System.out.println("Enter Data for node: ");
					int data1 = input.nextInt();
					Lnode node2 = new Lnode(data1);
					L1.addNodeToEnd(node2);
					break;
					
				case 3:
					System.out.println("Enter data for new node: ");
					int data2 = input.nextInt();
					Lnode node3 =new Lnode(data2);
					L1.displayList();
					System.out.println("Enter Index to add new node: ");
					int index1=input.nextInt();
					L1.addNodeIndex(node3, index1);
					break;
					
				case 4:
					L1.delNodeStart();
					break;
				case 5:
					L1.delNodeEnd();
					break;
					
				case 6:
					System.out.println("Enter Index you want to remove data from: ");
					int index=input.nextInt();
					L1.delNodeIndex(index);
					break;
				case 7:
					System.out.println("Enter data which you want to remove: ");
					int num =input.nextInt();
					L1.delWithData(num);
					break;
				case 8:
					L1.removeDuplictes();
					break;
					
				case 9:
					Llist L2= new Llist();
					System.out.println("Please Enter data for node: ");
					int data3 = input.nextInt();
					Lnode node4 = new Lnode(data3);
					L2.addNodeToStart(node4);
					
					while(true)
					{
						System.out.println("Press \"n\" to Exit or \"y\" to insert a new node: ");
						choice=input.next().charAt(0);
						if (choice == 'n')
						{
							break;
						}
						System.out.println("Please Enter data for node: ");
						//Llist L4 = new Llist();
						int data4 = input.nextInt();
						Lnode node5 = new Lnode(data4);
						L2.addNodeToEnd(node5);				
					}
					System.out.println("Out of loop");
					L2.displayList();
					System.out.println("out of display func");
					Llist L3= new Llist();
					int sum=0;
					Lnode p= L1.head;
					Lnode p1= L2.head;
					int carry=0;
					while (p!=null)
					{
						sum=p.data+p1.data;
						if (sum>9)
						{
							sum=sum%10+carry;
							carry=1;
						}
						else
						{
							sum=sum+carry;
							carry=0;
						}
						
						//System.out.println(sum);
						Lnode node6 = new Lnode(sum);
						L3.addNodeToEnd(node6);
						p=p.next;
						p1=p1.next;
					}
					if (carry ==1)
					{
						Lnode node6 = new Lnode(carry);
						L3.addNodeToEnd(node6);
					}
					L3.displayList();
					
					break;
					
				case 10:
					L1.pelindrome();
					break;
					
				case 12:
					
					break;
				
				case 13:
					L1.displayList();
					break;
				
				default:
					System.out.println("Incorrect Option. Please choose from above options..");
				
			}
		
		}
			
	}

	
}
