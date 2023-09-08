import java.util.Scanner;

public class D3_13547 {
	static int cnt, win, lose;
	static String game;
	static StringBuilder sb;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb = new StringBuilder("#" + test_case + " ");
			game = sc.next();
			cnt = game.length();
			win = lose = 0;
			
			for (int i = 0; i < cnt; i++) {
				if (game.charAt(i) == 'x') lose++;
				else win++;
			}
			
			sb.append(15 - cnt + win >= 8 ? "YES" : "NO");
			System.out.println(sb);
		}
		
		sc.close();
	}
}
