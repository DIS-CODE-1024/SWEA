import java.util.Scanner;
import java.util.Arrays;

public class D3_04466 {
	static int N, K, max;
	static int[] score;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			K = sc.nextInt();
			score  = new int[N];
			for (int i = 0; i < N; i++) {
				score[i] = sc.nextInt();
			}
			
			Arrays.sort(score);
			max = 0;
			
			for (int i = 1; i <= K; i++) {
				max += score[N - i];
			}
			
			System.out.printf("#%d %d\n", test_case, max);
		}
		
		sc.close();
	}
}
