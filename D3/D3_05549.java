import java.util.Scanner;

public class D3_05549 {
	static String number;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			number = sc.next();
			sb.append(((number.charAt(number.length() - 1) - '0') & 0x1) == 0 ? "Even" : "Odd");
			
			System.out.println(sb);
		}
        
        sc.close();
	}
}
