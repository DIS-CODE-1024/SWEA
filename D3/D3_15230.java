import java.util.Scanner;

public class D3_15230 {
	static String str;
	static int result;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			str =sc.next();
			result = 0;
			
			for (char c : str.toCharArray()) {
				if (c == 'a' + result) result++;
				else break;
			}
			
			sb.append(result);
			System.out.println(sb);
		}
		
		sc.close();
	}
}
