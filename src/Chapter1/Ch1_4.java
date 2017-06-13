package Chapter1;

import java.util.Scanner;

public class Ch1_4 {
	public static void main(String[] args) {
		String S1 = "";
		// StringBuilder S2 =new StringBuilder();
		int st = 0;
		System.out.println("Enter String: ");
		Scanner input = new Scanner(System.in);
		S1 = input.nextLine();
		int end = S1.length() - 1;
		char S2[] = new char[S1.length()];
		//System.out.println("Start= " + st + "End= " + end);
		for (int i = 0; i < S1.length(); i++) {
			S2[st] = (S1.charAt(i));
			
			for (int j = i + 1; j < S1.length(); j++) {
				//System.out.println(S1.charAt(i));
				//System.out.println(S1.charAt(j));
				if (S1.charAt(i) == S1.charAt(j)) {

					//System.out.println("Start Value: " + st);
					//System.out.println("End Value: " + end);
					
					S2[end] = S1.charAt(j);
					
					//System.out.println("New String" + S2[st] +" "+S2[end]);
					end = end - 1;
					st = st + 1;
				}
			}
		}
		for (int k = 0; k < S1.length(); k++)
			System.out.print(S2[k]);
	}
}

