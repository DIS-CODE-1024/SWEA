import java.util.Scanner;

public class D3_10726 {
	static int N, M;
	static String str;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			N = sc.nextInt();
			M = sc.nextInt();
			str = Integer.toBinaryString(M);
			
			if (str.length() < N) sb.append("OFF");
			else if (str.substring(str.length() - N).contains("0")) sb.append("OFF");
			else sb.append("ON");
			
			System.out.println(sb);
		}
		
		sc.close();
	}
}
