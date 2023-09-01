import java.util.Scanner;

public class D3_08016 {
	static long N, left, right;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	
		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextLong();
			left = right = 1;
			
//			for (int i = 1; i < N; i++) {
//				left += (4 * i - 2);
//				right += (4 * i + 2);
//			}
//			
//			System.out.println("#" + test_case + " " + left + " " + right);
			
			left = 2 * (N - 1) * (N - 1) + 1;
			right = 2 * N * N - 1;
			System.out.println("#" + test_case + " " + left + " " + right);
		}
		
		sc.close();
	}
}
