import java.util.Scanner;

public class D3_10505 {
	static int N, avg, cnt;
	static int[] arr;
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
			arr = new int[N];
			avg = 0;
			cnt = 0;
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				avg += arr[i];
			}
			
			avg /= N;
			
			for (int i = 0; i < N; i++) {
				if (arr[i] <= avg) cnt++;
			}
			
			sb.append(cnt);
			System.out.println(sb);
		}
		
		sc.close();
	}
}
