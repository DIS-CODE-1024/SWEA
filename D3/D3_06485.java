import java.util.Scanner;

public class D3_06485 {
	static int N, P, start, end;
	static int[] busstop;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case);
			busstop = new int[5_000];
			N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				start =sc.nextInt();
				end = sc.nextInt();
				for (;start <= end; start++) busstop[start]++;
			}
			
			P = sc.nextInt();
			for (int i = 0; i < P; i++) {
				sb.append(" ").append(busstop[sc.nextInt()]);
			}
			
			System.out.println(sb);
		}
		
		sc.close();
	}
}
