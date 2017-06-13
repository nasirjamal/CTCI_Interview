package Chapter4;
import java.util.ArrayList;
import java.util.Scanner;
public class BSTDemo {

	
	
	public static void main(String[] args) {

		BSTTree tree1 = new BSTTree();

		while(true)
		{
			System.out.println("1. Add data");
			System.out.println("2. rec_search");
			System.out.println("3. search");
			System.out.println("4. Pre Order Display");
			System.out.println("5. In Order Display");
			System.out.println("6. Post Order Display");
			System.out.println("7. Delete a node");
			System.out.println("8. Check BST ");
			System.out.println("9. Create Binary tree with Sorted Array");
			System.out.println("10. Level Order Traversal");
			System.out.println("11. BST Sequence");
			System.out.println("0. Exit");

			System.out.println("Enter your choice: ");
			Scanner input = new Scanner(System.in);
			int ch1= input.nextInt();
			switch (ch1)
			{
			case 0:
				System.exit(0);

			case 1:
				System.out.println("Enter data to create node: ");
				int data1= input.nextInt();
				BSTNode N1 = new BSTNode(data1);
				tree1.insert(N1);
				while(true)
				{
					System.out.println("Do you want to add more data?");
					char ch2= input.next().charAt(0);
					if (ch2!='y')
					{
						break;
					}
					else
					{
						System.out.println("Enter data to create node: ");
						int data2= input.nextInt();
						BSTNode N2 = new BSTNode(data2);
						tree1.insert(N2);
						System.out.println(tree1.root);
					}					
				}
				break;

			case 2:
				System.out.println("Enter data to search: ");
				int d =  input.nextInt();
				System.out.println(tree1.rec_search(tree1.root, d));
				break;

			case 3:
				System.out.println("Enter data to search: ");
				int d1 =  input.nextInt();
				System.out.println(tree1.search(d1));
				break;

			case 4:
				tree1.preOrder(tree1.root);
				break;

			case 5:
				tree1.inOrder(tree1.root);
				break;

			case 6:
				tree1.postOrder(tree1.root);
				break;

			case 7:
				System.out.println("Enter data to Delete: ");
				int d2 =  input.nextInt();
				tree1.del(tree1.root, d2);
				break;
				
			case 8:
				BSTNode N2 = new BSTNode();
				BSTNode N3 = new BSTNode();
				BSTNode N4 = new BSTNode();
				BSTTree tree2 = new BSTTree();
				
				N2.data=2;
				N2.left=N3;
				
				N3.data=1;
				N2.right=N4;
				N4.data=4;
				
				System.out.println(tree2.checkBST(N2));
				break;
				
			case 9:
				System.out.println("Creating BST from Sorted Array: [1, 2, 3, 4, 5, 6]");
				int a[] = {1, 2, 3, 4, 5 , 6};
				int left =0;
				int right =a.length;
				tree1.insertCheckBST(tree1, a, left, right);
				break;
				
			case 10:
				tree1.levelOrder();
				break;
				
			case 11:
				tree1.BSTSeq();
				break;
			}
		}
	}

}
