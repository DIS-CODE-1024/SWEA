import java.util.Scanner;

public class D3_04299 {
	static int D, H, M, time;
	static final int blind = 11 * 1440 + 11 * 60 + 11;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		for (int test_case = 1; test_case <= T; test_case++)
		{
			D = sc.nextInt();
			H = sc.nextInt();
			M = sc.nextInt();
			
			time = D * 1440 + H * 60 + M - blind;
			time = time < 0 ? -1 : time;
			
			System.out.println("#" + test_case + " " + time);
		}
		
		sc.close();
	}
}
