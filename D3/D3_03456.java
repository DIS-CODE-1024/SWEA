import java.util.Scanner;

public class D3_03456 {
	static int a, b, c, d;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if (a == b) d = c;
			else if (a == c) d = b;
			else d = a;
			
			System.out.printf("#%d %d\n", test_case, d);
		}
		
		sc.close();
	}
}
