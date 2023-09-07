import java.util.Scanner;

public class D3_12741 {
	static int A, B, C, D, max, result;
	static int[] time;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			D = sc.nextInt();
			result = 0;
			
			max = Math.max(B, D);
			time = new int[max + 1];
			
			for (int i = A; i < B; i++) time[i]++;
			for (int i = C; i < D; i++) time[i]++;
			for (int i = 0; i <= max; i++) {
				if (time[i] == 2) result++;
			}
			
			sb.append(result);
			System.out.println(sb);
		}
		
		sc.close();
	}
}
