package Chapter1;
import java.util.Scanner;
public class Ch1_1 {
	public static void main(String[] args){
		String s;
		int i=0;
		System.out.println("Enter String: ");
		Scanner input = new Scanner(System.in);
		s=input.next();
		
		while(i <s.length())
		{
			int j=i+1;
			while (j<s.length()){
				if (s.charAt(i) == s.charAt(j)){
					System.out.println("Duplicate");
					System.exit(0);
			}
				j++;
			}
			i++;

		}
		System.out.println("Unique");
		
	}

}
