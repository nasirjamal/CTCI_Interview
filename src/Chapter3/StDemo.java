package Chapter3;

import java.util.Scanner;

public class StDemo {
	
	public static void main(String [] args)
	{
		
		StList S1 = new StList();
		StList S2 = new StList();
		while (true)
		{
			
			Scanner input = new Scanner(System.in);
			 System.out.println("1. PUSH");
			 System.out.println("2. POP");
			 System.out.println("3. FRONT");
			 System.out.println("4. Display stack");
			 System.out.println("5. MIN");
			 int ch = input.nextInt();
			 switch (ch)
			 {
			 case 1:
				 System.out.println("Enter data to add in stack...");
				 int data = input.nextInt();
				 S1.push(data);
				 S2.push(data);
				 while (true)
				 {
					 System.out.println("Press y to add more data or any other key to Exit");
					 char ch1 = input.next().charAt(0);
					 if (ch1!='y')
					 {
						 break;
					 }
					 else
					 {
						 System.out.println("Enter data to add in stack...");
						 int data1 = input.nextInt();
						 if (S2.top1() >data1)
						 {
							 S1.push(data1);
							 S2.push(data1);
						 }
						 else
						 {
							 S1.push(data1);
							 S2.push(S2.top1());
						 }
					 }
				 }
				 break;

			 case 2:
				 S1.pop();
				 S2.pop();
				 break;
				 
			 case 3:
				 S1.top1();
				 S2.top1();
				 break;
				 
			 case 4:
				 S1.display();
				 break;
			
			 case 5:
				 System.out.println(S2.top1());
				 break;
			 }
		}
			 		
		
		
	}

}
