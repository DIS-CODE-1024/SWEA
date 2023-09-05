import java.util.Scanner;

public class D3_08338 {
	static int N, num, result;
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
			result = sc.nextInt();
			
			for (int i = 1; i < N; i++) {
				num = sc.nextInt();
				
				result = Math.max(result + num, result * num);
			}
			
			sb.append(result);
			System.out.println(sb);
		}
		
		sc.close();
	}
}
