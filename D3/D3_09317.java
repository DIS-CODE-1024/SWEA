import java.util.Scanner;

public class D3_09317 {
	static int N, cnt;
	static String answer, reply;
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
			answer = sc.next();
			reply = sc.next();
			cnt = 0;
			
			for (int i = 0; i < N; i++) {
				if (answer.charAt(i) == reply.charAt(i)) cnt++;
			}
			
			sb.append(cnt);
			System.out.println(sb);
		}
		
		sc.close();
	}
}
