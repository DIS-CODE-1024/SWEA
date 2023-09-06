import java.util.Scanner;

public class D3_07102 {
	static int N, M, max;
	static int[] arr;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            sb = new StringBuilder("#" + test_case);
            N = sc.nextInt();
            M = sc.nextInt();
            arr = new int[N + M + 1];
            max = Integer.MIN_VALUE;
            
            for (int i = 1; i <= N; i++) {
            	for (int j = 1; j <= M; j++) {
            		arr[i + j]++;
            		max = Math.max(max, arr[i + j]);
            	}
            }
            
            for (int i = 0; i <= N + M; i++) {
            	if (arr[i] == max) sb.append(" " + i);
            }
            
            System.out.println(sb);
		}
		
		sc.close();
	}
}
