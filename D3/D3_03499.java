import java.util.Scanner;

public class D3_03499 {
	static int N, back;
	static String[] card;
	
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			card = new String[N];
			back = (N / 2) - 1 + (N % 2);
			
			for (int i = 0; i < N; i++) {
				if (i < N / 2 + (N % 2)) {
					card[i * 2] = sc.next();
				}
				else {
					card[i - back--] = sc.next();
				}
			}
			
			System.out.printf("#%d", test_case);
			
			for (int i = 0; i < N; i++) {
				System.out.printf(" %s", card[i]);
			}
			System.out.println();
		}
		
		sc.close();
	}
}