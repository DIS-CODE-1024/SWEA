import java.util.Scanner;

public class D3_03431 {
	static int L, U, X, result;
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++) {
			L = sc.nextInt();
			U = sc.nextInt();
			X = sc.nextInt();
			
			if (X < L) result = L - X;
			else if (X > U) result = -1;
			else result = 0;
			
			System.out.printf("#%d %d\n", test_case, result);
		}
		
		sc.close();
	}
}
