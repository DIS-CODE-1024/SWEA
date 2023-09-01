import java.util.Scanner;

public class D3_07584 {
	static long K;
	static byte result;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			K = sc.nextLong() - 1;
			
			while(true) {
				if (K % 2 == 1) K = (K - 1) / 2;
				else if (K % 4 == 0) {
					result = 0;
					break;
				}
				else {
					result = 1;
					break;
				}
			}
			
			System.out.printf("#%d %d", test_case, result);
		}
		
		sc.close();
	}
}
