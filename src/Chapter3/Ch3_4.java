package Chapter3;
import java.util.*;

public class Ch3_4 {
	public static void main (String[] args)
	{
		Stack <Integer> S1 = new Stack<Integer>();
		Stack <Integer> S2 = new Stack<Integer>();
		int temp;
		
		S1.push(3);
		S1.push(2);
	S1.add(20);
			S1.add(10);
		S1.add(5);
		
		System.out.println("Before Sort: "+ S1);
		
		while(!S1.isEmpty())
		{
			temp=S1.pop();
			if (S2.isEmpty())
			{
				S2.push(temp);
			}
			else
			{
				//int length=S2.size();
				if(temp<S2.peek())
					{
						S2.push(temp);
					}
					else
					{
						while (!S2.isEmpty() && S2.peek()<temp)
						{
							S1.push(S2.pop());
						}
						S2.push(temp);
						//S2.push(S1.pop());
					}
				//length--;
				}
			
		}
		System.out.println("After Sort: "+S2);
	}

}
