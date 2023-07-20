import java.util.Scanner;

public class D3_09229 {
	static int N, M, max;
	static int[] snack;
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			M = sc.nextInt();
			snack = new int[N];
			for (int i = 0; i < N; i++) {
				snack[i] = sc.nextInt();
			}
			max = -1;
			
			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					if (snack[i] + snack[j] <= M) max = Math.max(max, snack[i] + snack[j]);
				}
			}
			
			System.out.printf("#%d %d\n", test_case, max);
		}
		
		sc.close();
	}
}
