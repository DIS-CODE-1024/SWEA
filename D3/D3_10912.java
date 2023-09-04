import java.util.Arrays;
import java.util.Scanner;

public class D3_10912 {
	static char[] temp;
	static StringBuilder str, sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			str = new StringBuilder(sc.next());
			
			for (int i = 0; i < str.length(); i++) {
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						str.deleteCharAt(i--);
						str.deleteCharAt(j - 1);
						break;
					}
				}
			}

			temp = str.toString().toCharArray();
			Arrays.sort(temp);
			if (str.length() == 0) sb.append("Good");
			else sb.append(temp);
			
			System.out.println(sb);
		}
		
		sc.close();
	}
}
