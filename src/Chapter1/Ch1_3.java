package Chapter1;
import java.util.Scanner;
public class Ch1_3 {

	public static void main(String[] args) {
		String s,r="";
		int count=0;
		System.out.println("Enter the String");
		Scanner input = new Scanner(System.in);
		s=input.nextLine();
		long St_time=System.currentTimeMillis();
		//char ch_arr []=s.toCharArray();
		int l=s.length();
		System.out.println("Length"+l);
		for (int i=0; i<l;i++)
		{
			if (s.charAt(i)==' ')
			{
				r=r+"%20";
				count = count +1;
			}
			else
			{
				r+=s.charAt(i);

			}
		}
		//System.out.println(ch_arr[1]);
		System.out.println(count+"Spaces in String" + r);
		System.out.println(System.currentTimeMillis()-St_time);
	}

}
