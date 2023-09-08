import java.util.Scanner;

public class D3_08500 {
	static int N, min, temp;
	static int[] seat;
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
			seat = new int[N];
			min = temp = 0;
			
			for (int i = 0; i < N; i++) {
				seat[i] = sc.nextInt();
				if (temp < seat[i]) temp = seat[i];
				min += 1 + seat[i];
			}
			min += temp;
			
			sb.append(min);
			System.out.println(sb);
		}
			
		sc.close();
	}
}
