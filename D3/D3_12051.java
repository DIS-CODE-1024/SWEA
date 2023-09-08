import java.util.Scanner;

public class D3_12051 {
	static long N;
	static int D, G;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			N = sc.nextLong();
			D = sc.nextInt();
			G = sc.nextInt();
			
			if ((D != 100 && G == 100) || (D != 0 && G == 0)) sb.append("Broken");
			else {
				if (check(N, D)) sb.append("Possible");
				else sb.append("Broken");
			}
			
			System.out.println(sb);
		}
			
		sc.close();
	}
	
	private static boolean check(long n, int d) {
		for (long i = 1; i <= n; i++) {
			if ((i * d ) % 100 == 0) return true;
		}
		
		return false;
	}
}
