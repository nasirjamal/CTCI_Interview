package Chapter2;
import java.util.LinkedList;
import java.util.HashSet;
public class Ch2_2 {
	static LinkedList <Integer> list1 = new LinkedList<Integer>();
	static HashSet<Integer> HSet1 = new HashSet<Integer>();
	public static void bruteForce()
	{
		for (int i=0; i<list1.size();i++)
		{
			for(int j=i+1;j<list1.size();j++)
			{
				boolean aa= list1.get(i).equals(list1.get(j));
				System.out.println(aa);
				if(aa)
				{
					System.out.println("Found Duplicate entry for: "+ list1.get(j)+", Deleting this entry!");
					list1.remove(j);
				}
			}
			//System.out.println(i);
		}

	}
	
	public static void hashSet()
	{
		for (int i=0;i< list1.size();i++)
		{
			if (HSet1.contains(list1.get(i)))
					{
						System.out.println("Hset : Found Duplicate entry for: "+ list1.get(i)+", Deleting this entry!");
						list1.remove(i);

					}
			else
			{
				HSet1.add(list1.get(i));
			}	
		}
	}
	public static void main(String[] args) {
	
		
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(300);
		System.out.println(list1);
		System.out.println("----------------------------------------");
		//bruteForce();
		hashSet();
		System.out.println(list1);
	}
	
}


