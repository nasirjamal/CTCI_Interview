/**
 * 
 */
package Chapter2;

import java.util.Scanner;

/**
 * @author Aaditya
 *
 */
public class SLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*LinkedList n = new LinkedList();
		ListNode node = new ListNode(10);
		node.setNext(null);
		n.insertAtBeginning(node);
		ListNode node1 = new ListNode(20);
		node1.setNext(null);
		n.insertAtBeginning(node1);
		ListNode node2 = new ListNode(30);
		node2.setNext(null);
		n.insertAtBeginning(node2);
		ListNode node3 = new ListNode(5);
		n.insertAtEnd(node3);
		n.insert(25, 3);
		n.insert(26, 0);
		n.insert(27, -1);
		ListNode node4 = new ListNode(20);
		node4.setNext(node);
		n.removeFromBeginning();
		n.removeFromEnd();
		//n.removeNode(node4);
		//n.removeNodeData(25);
		n.removeNodePosition(1);
		ListNode z;
		z = n.getHead();
		while( z != null){
			//System.out.println("NodeData - " + z.getData() + " , NodeNext - " + z.getNext());
			System.out.println(z.getData()+" -> "+z.getNext());
			z = z.getNext();
		}
*/	
		
		LinkedList n = new LinkedList();
		Scanner input = new Scanner(System.in);
		int option =0, value=0, position=0;
		do{
			System.out.println("Choose option : ");
			System.out.println("1. Insert at Beginning : ");
			System.out.println("2. Insert at End : ");
			System.out.println("3. Insert at Position : ");
			System.out.println("4. Remove From Beginning : ");
			System.out.println("5. Remove From End : ");
			System.out.println("6. Remove by Value : ");
			System.out.println("7. Remove at Postion : ");
			System.out.println("8. Print Linked List : ");
			System.out.println("9. Removes duplicates : ");
			System.out.println("10. Quit : ");
			option = input.nextInt();
			switch(option){
			case 1:
				System.out.println("Enter the value : ");
				value = input.nextInt();
				ListNode node1 = new ListNode(value);
				n.insertAtBeginning(node1);
				System.out.println(value+" : Inserted at the beginning ");
				break;
			case 2:
				System.out.println("Enter the value : ");
				value = input.nextInt();
				ListNode node2 = new ListNode(value);
				n.insertAtEnd(node2);
				System.out.println(value+" : Inserted at the end ");
				break;
			case 3:
				System.out.println("Enter the value : ");
				value = input.nextInt();
				System.out.println("Enter the position : ");
				position = input.nextInt();
				n.insert(value, position);
				System.out.println(value+" : Inserted at : "+position);
				break;
			case 4:
				n.removeFromBeginning();
				System.out.println("Node removed from beginning ");
				break;
			case 5:
				n.removeFromEnd();
				System.out.println("Node removed from end ");
				break;
			case 6:
				System.out.println("Enter the value : ");
				value = input.nextInt();
				n.removeNodeData(value);
				System.out.println(value + " : Node removed ");
				break;
			case 7:
				System.out.println("Enter the value : ");
				position = input.nextInt();
				n.removeNodePosition(position);
				System.out.println(" : Node removed from position : " + position);
				break;
			case 8:
				ListNode z;
				z = n.getHead();
				while( z != null){
					//System.out.println("NodeData - " + z.getData() + " , NodeNext - " + z.getNext());
					System.out.println(z.getData()+" -> "+z.getNext());
					z = z.getNext();
				}
				break;
			case 9:
				n.removeDuplicates();
				break;
			}
			 
				
	
		}while(option != 10);
		
	}

}
