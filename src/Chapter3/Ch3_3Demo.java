package Chapter3;

import java.util.Scanner;

public class Ch3_3Demo {

	public static void main(String[] args) {
		
		Ch3_3Func S1 = new Ch3_3Func();
		
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
						S1.push(data1);
					}
				}
				break;
				
			case 2:
				S1.pop();
				break;
			
			case 3:
				System.out.println(S1.top1());
				break;
			
			case 4:
				S1.display();
				break;
			}
		}
	}
}
