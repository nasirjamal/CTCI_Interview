package Chapter4;
import java.util.*;
public class GraphDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l[] =new LinkedList[10];
		for (int i=0;i<10;i++)
		{
			l[i]= new LinkedList<Integer>();
		}
		l[0].add(10);
		l[0].add(20);
		l[2].add(30);
		l[2].add(40);
		l[5].add(50);
		l[5].add(60);
		l[9].add(70);
		l[9].add(80);	
		
		for (int i =0; i<10;i++)
		{
			System.out.println(i+" => "+l[i]);
		}
		
	}

}
